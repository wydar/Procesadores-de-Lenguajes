import java.io.*;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Generator{
  private static PrintStream out = PLXC.out;
  private static int contTag = 0;
  public static Node[] temps = new Node[100];

  public static final int MAS = 1;
  public static final int MENOS=2;
  public static final int POR=3;
  public static final int DIV=4;
  public static final int MENOSUNARIO=5;
  public static final int LT=6;
  public static final int LEQ=7;
  public static final int EQ=8;
  public static final int GEQ=9;
  public static final int GT=10;
  public static final int NEQ=11;
  public static final int MOD=12;
  public static final int MASEQ=13;
  public static final int MENOSEQ=14;
  public static final int POREQ=15;
  public static final int DIVEQ=16;


  public static void GenPrint(String arg){
    out.println("   print "+arg+";");
  }

  public static String newTag(String type){
    String aux = "$t"+contTag;
    contTag++;
    Node nod = new Node(aux,0,type,null);
    int numb=contTag-1;
    temps[numb]=nod;
    return aux;
  }

  public static boolean binOperTypes(String arg1,String arg2){
    //System.out.println("arg1: "+arg2+" arg2: "+arg2);
    int type1 = seeType(arg1);
    int type2=seeType(arg2);
    boolean floatOper=false;

    if(type1==1){
      type1=varType(arg1);
    }
    if(type1==2){
      type1=tempType(arg1);
    }
    if(type2==1){
      type2=varType(arg2);
    }
    if(type2==2){
      type2=tempType(arg2);
    }

    if(type1==3 && type2==4){
      String cast = newTag("FLOAT");
      out.println("   "+cast+" = (float) "+arg1+";");
      floatOper=true;
    }
    if(type1==4 && type2==3){
      String cast = newTag("FLOAT");
      out.println("   "+cast+" = (float) "+arg2+";");
      floatOper=true;
    }
    if(type1==4 && type2==4){
      floatOper=true;
    }

    return floatOper;
  }

  public static String GenBinOper(String arg1,int oper,String arg2,String temp){
    String modTemp="";
    boolean floatOper=binOperTypes(arg1,arg2);
    int num = getNumTemp(temp);
    Node nod=temps[num];
    if(!floatOper){ //Vamos a poner el tipo al artibuto temp que se ha definido justo antes en el CUP pero ahi no sabiamos que tipo era
      nod.setType(3);
    }else{
      nod.setType(4);
    }
    switch(oper){
      case MAS:
        if(!floatOper){
          out.println("   "+temp+" = "+arg1+" + "+arg2+";");
        }else{
          out.println("   "+temp+" = "+arg1+" +r "+arg2+";");
        }
      break;
      case MENOS:
        if(!floatOper){
          out.println("   "+temp+" = "+arg1+" - "+arg2+";");
        }else{
          out.println("   "+temp+" = "+arg1+" -r "+arg2+";");
        }
      break;
      case POR:
        if(!floatOper){
          out.println("   "+temp+" = "+arg1+" * "+arg2+";");
        }else{
          out.println("   "+temp+" = "+arg1+" *r "+arg2+";");
        }
      break;
      case DIV:
        if(!floatOper){
          out.println("   "+temp+" = "+arg1+" / "+arg2+";");
        }else{
          out.println("   "+temp+" = "+arg1+" /r "+arg2+";");
        }
      break;
      case MENOSUNARIO:
        out.println("   "+temp+" = -"+arg2+";");
        break;
      case MOD:
        if(!floatOper){
          out.println("   "+temp+" = "+arg1+" / "+arg2+";");
          modTemp=temp;
          temp=newTag("INTEGER");
          out.println("   "+temp+" = "+modTemp+" * "+arg2+";");
          modTemp=temp;
          temp=newTag("INTEGER");
          out.println("   "+temp+" = "+arg1+" - "+modTemp+";");
          modTemp=temp;
        }else{
          out.println("   "+temp+" = "+arg1+" / "+arg2+";");
          modTemp=temp;
          temp=newTag("FLOAT");
          out.println("   "+temp+" = "+modTemp+" * "+arg2+";");
          modTemp=temp;
          temp=newTag("FLOAT");
          out.println("   "+temp+" = "+arg1+" - "+modTemp+";");
          modTemp=temp;
        }
        break;
    }
    return modTemp;
  }

  public static void GenUnicOper(String id,int oper, String exp){
    if(seeType(id)>2){
      TS.error(0);
    }
    switch(oper){
      case MASEQ:
        out.println("   "+id+" = "+id+" + "+exp+";");
      break;
      case MENOSEQ:
        out.println("   "+id+" = "+id+" - "+exp+";");
      break;
      case POREQ:
        out.println("   "+id+" = "+id+" * "+exp+";");
      break;
      case DIVEQ:
        out.println("   "+id+" = "+id+" / "+exp+";");
      break;
    }
  }
  //incDec indica si es un incremento (true) o un decremento (false)
  //prePost indica si es un Pre-incremento/decremento (true) o un Post-incremento/decremento (false)
  public static String GenIncDec(String var,boolean prePost , boolean incDec){
    String temp="";
    if(prePost){
      temp=var;
      if(incDec){ //Pre-incremento
        out.println("   "+var+" = "+var+" + 1;");
      }else{ //Pre-decremento
        out.println("   "+var+" = "+var+" - 1;");
      }
    }else{
      temp= newTag("");
      if(incDec){//Post-incremento
        out.println("   "+temp+" = "+var+";");
        out.println("   "+var+" = "+var+" + 1;");
      }else{ //Post-decremento
        out.println("   "+temp+" = "+var+";");
        out.println("   "+var+" = "+var+" - 1;");
      }
    }
    return temp;
  }

  public static String GenAsig(String id, String exp){
    int idType= seeType(id);
    int expType= seeType(exp);
  //  System.out.println("*****id: "+id+" "+idType+"\nvar: "+exp+" "+expType);
    if(idType==1 && expType==1){ //las dos son variables
      Node nodId = TS.getNode(id);
      Node nodExp = TS.getNode(exp);
      idType= varType(id);
      expType= varType(exp);
      //System.out.println("*****id: "+id+" "+nodId.getIsArray()+"\nvar: "+exp+" "+nodExp.getIsArray());
      if(nodId.getIsArray() && nodExp.getIsArray()){
        GenAsigArray(id,exp);
      } else if(idType==expType){ //las dos variables o son int o float
        out.println("   "+id+" = "+exp+";");
      }else if(idType==4 && expType==3){//la primera es float y la segunda int (en este caso se puede hacer un casteo)
        String temp=newTag("FLOAT");
        out.println("   "+temp+" = (float) "+exp+";");
        out.println("   "+id+" = "+temp+";");
      }else{ //Los tipos son incompatibles
        //System.out.println("id: "+id+" "+idType+"\nvar: "+exp+" "+expType);
        TS.error(3);
      }
    }else{
      if(idType==1){
        idType= varType(id);
      }
      if(idType==2){
        idType= tempType(id);
      }
      if(expType==1){
        expType= varType(exp);
      }
      if(expType==2){
        expType=tempType(exp);
      }
  //  System.out.println("id: "+id+" "+idType+"\nvar: "+exp+" "+expType);
      if(expType==idType){
        out.println("   "+id+" = "+exp+";");
      }else if(idType==4 && expType==3){
        String temp=newTag("FLOAT");
        out.println("   "+temp+" = (float) "+exp+";");
        out.println("   "+id+" = "+temp+";");
      }else{
      //  System.out.println("id: "+id+" "+idType+"\nvar: "+exp+" "+expType);
        TS.error(3);
      }
    }
    return id;
  }

//**********************Codigo para los punteros**********************************
  public static String pointLoop(String id,int tam){
    String aux="";
    String tempo="";
    Node nod=TS.getNode(id);
    for(int i=0;i<tam;i++){
      tempo = newTag(nod.getTypeS());
      if(i==0){
        out.println("   "+tempo+" = * "+id+";");
      }else{
        out.println("   "+tempo+" = * "+aux+";");
      }
      aux=tempo;
    }
    return aux;
  }

  public static String GenPointAsig(String id,String exp){

    Node nod = TS.getNode(id);

    if(nod.getPointLevel()>1){
        id=pointLoop(id,nod.getPointLevel()-1);
    }

    int idType = seeType(id);
    int expType = seeType(exp);

    if(idType==1 && expType==1){
      idType=varType(id);
      expType=varType(exp);
      if(idType==expType){
        out.println("   "+id+" = "+exp+";");
      }
    }else{
      if(idType==2){
        idType=tempType(id);
      }else if(idType==1){
        idType=varType(id);
      }
      if(expType==2){
        expType=tempType(exp);
      }else if(expType==1){
        expType=varType(exp);
      }
      if(idType==expType){
        out.println("   * "+id+" = "+exp+";");
      }
    }

    if(idType==4 && expType==3){
      String temp=newTag("FLOAT");
      out.println("   "+temp+" = (float) "+exp+";");
      out.println("   * "+id+" = "+temp+";");
    }else if(idType==3 && expType==4){
      TS.error(3);
    }

    return id;
  }

  public static String GenPointer(String id){
    Node nod = TS.getNode(id);
    int level = nod.getPointLevel();
    return pointLoop(id,level);
  }

  public static String GenAmpPoint(String id, String exp, boolean isId,int level){
    Node nod = TS.getNode(id);
    String aux="";
    String temp="";
    if(level>1 && !isId){
      aux=pointLoop(id,level-1);
      temp = newTag(nod.getTypeS());
      out.println("   "+temp+" = & "+exp+";");
      out.println("   * "+aux+" = "+temp+";");
    }else{
      temp = newTag(nod.getTypeS());
      out.println("   "+temp+" = & "+exp+";");
      out.println("   "+id+" = "+temp+";");
    }

    return temp;
  }

//****************************************************************************************************************

//*************************Codigo para los arrays*************************************************************

  public static void arrayRangeCheck(String var, String num, String exp){
    Node nod = TS.getNode(var);
    DoubleTag aux = new DoubleTag();
    out.println("# comprobacion de rangos");
    out.println("   if ("+num+" < 0) goto "+aux.getV()+";");
    out.println("   if ("+nod.getTam()+" < "+num+") goto "+aux.getV()+";");
    out.println("   if ("+nod.getTam()+" == "+num+") goto "+aux.getV()+";");
    out.println("   goto "+aux.getF()+";");
    out.println(aux.getV()+":");
    out.println("   error;");
    out.println("   halt;");
    out.println(aux.getF()+":");

  }

  public static void GenAsigArray(String id,String exp){
      Node nodId=TS.getNode(id);
      Node nodExp=TS.getNode(exp);
      List<String> list = nodExp.getArray();
      String temp = newTag(nodId.getTypeS());
      for(int i=0;i<list.size();i++){
        out.println("   "+temp+" = "+exp+"["+i+"];");
        out.println("   "+id+"["+i+"] = "+temp+";");
        nodId.setArrayValue(list.get(i));
      }
      out.println("   "+id+" = "+exp+";");
  }

  public static void GenAsigArray(String var, String num, String exp){
      arrayRangeCheck(var,num,exp);
      Node nod = TS.getNode(var);
      nod.setArrayValue(exp);
      out.println("   "+var+"["+num+"] = "+exp+";");
  }

  public static void GenInitArray(String var,String temp,int num,String exp){
    Node nod=TS.getNode(var);
    int tam=nod.getTam();
    if(num>=tam){
      TS.error(4);
    }else{
      nod.setArrayValue(exp);
      out.println("   "+temp+"["+num+"] = "+exp+";");
    }
  }

  public static void GenInitArrayPart2(String temp1,String temp2, String var,int tam,boolean isInExp){
      Node nod=TS.getNode(var);
      for(int i=0; i<tam; i++){
        out.println("   "+temp2+" = "+temp1+"["+i+"];");
        out.println("   "+var+"["+i+"] = "+temp2+";");
      }
      if(isInExp){
        out.println("   "+var+" = "+temp1+";");
      }

  }

  public static void GenUseVarArray(String var,String num,String temp){
      arrayRangeCheck(var,num,temp);
      int type= varType(var);
      temps[getNumTemp(temp)].setType(type);
      out.println("   "+temp+" = "+var+"["+num+"];");
  }

  //************************************************************************************************************

  public static DoubleTag GenCond (String arg1, Integer type, String arg2){
    DoubleTag aux= new DoubleTag();
    switch(type){
      case LT:
        out.println("   if ("+arg1+" < "+arg2+") goto "+aux.getV()+";");
        GenGoto(aux.getF());
      break;
      case GT:
        out.println("   if ("+arg2+" < "+arg1+") goto "+aux.getV()+";");
        GenGoto(aux.getF());
      break;
      case LEQ:
        out.println("   if ("+arg2+" < "+arg1+") goto "+aux.getF()+";");
        GenGoto(aux.getV());
      break;
      case GEQ:
        out.println("   if ("+arg1+" < "+arg2+") goto "+aux.getF()+";");
        GenGoto(aux.getV());
      break;
      case EQ:
        out.println("   if ("+arg1+" == "+arg2+") goto "+aux.getV()+";");
        GenGoto(aux.getF());
      break;
      case NEQ:
        out.println("   if ("+arg1+" != "+arg2+") goto "+aux.getF()+";");
        GenGoto(aux.getV());
    }
    return aux;
  }

  public static void GenCondForDownTo(String arg1, String arg2, DoubleTag tag, boolean isDownto){
    if(!isDownto){
      out.println("   if ("+arg2+" < "+arg1+") goto "+tag.getF()+";");
    }else{
      out.println("   if ("+arg1+" < "+arg2+") goto "+tag.getF()+";");
    }
    GenGoto(tag.getV());
  }

  public static void GenCase(String swtVar, String num,DoubleTag tag){
    out.println("   if ("+swtVar+" != "+num+") goto "+tag.getF()+";");
  }

  public static void GenGoto(String label){
    out.println("   goto "+label+";");
  }

  public static void GenLabel(String label){
    out.println(label+":");
  }


  public static boolean isVar(String in){
    Pattern p = Pattern.compile("[_a-zA-Z][_a-zA-Z0-9]*");
    return Pattern.matches(p.pattern(),in);
  }

  public static boolean isTemp(String in){
    Pattern p = Pattern.compile("[$]t[0-9]+");
    return Pattern.matches(p.pattern(),in);
  }

  public static boolean isInt(String in){
    Pattern p = Pattern.compile("[1-9][0-9]*|0");
    return Pattern.matches(p.pattern(),in);
  }

  public static boolean isFloat(String in){
    Pattern p = Pattern.compile("[-]?[0-9]*\\.[0-9]+[eE]*[+-]?[0-9]*");
    return Pattern.matches(p.pattern(), in);
  }

  public static int seeType(String in){
    int type=-1;
    if(isTemp(in)){
      type=2;
    }else if(isVar(in)){
      type=1;
    }else if(isInt(in)){
      type=3;
    }else if(isFloat(in)){
      type=4;
    }
    return type;
  }

  public static int varType(String var){
    Node nod=TS.getNode(var);
    return nod.getType();
  }

  public static int getNumTemp(String temp){
    return Integer.parseInt(temp.substring(2));
  }

  public static int tempType(String temp){
    int num=getNumTemp(temp);
    Node nod = temps[num];
    return nod.getType();
  }

  public static String basicType(String exp){
    int tp = seeType(exp);
    String ret="";
    if(tp==1){
      tp=varType(exp);
    }else if(tp==2){
      tp=tempType(exp);
    }

    if(tp==3){
      ret="INTEGER";
    }else{
      ret="FLOAT";
    }
    return ret;
  }
}
