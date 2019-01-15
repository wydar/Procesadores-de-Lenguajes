import java.io.*;

public class Generator{
  private static PrintStream out = PLXC.out;
  private static int contTag = 0;

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


  public static void GenPrint(String arg){
    out.println("   print "+arg+";");
  }

  public static String newTag(){
    String aux = "$t"+contTag;
    contTag++;
    return aux;
  }

  public static String GenBinOper(String arg1,int oper,String arg2,String temp){
    String modTemp="";
    switch(oper){
      case MAS:
        out.println("   "+temp+" = "+arg1+" + "+arg2+";");
      break;
      case MENOS:
        out.println("   "+temp+" = "+arg1+" - "+arg2+";");
      break;
      case POR:
        out.println("   "+temp+" = "+arg1+" * "+arg2+";");
      break;
      case DIV:
        out.println("   "+temp+" = "+arg1+" / "+arg2+";");
      break;
      case MENOSUNARIO:
        out.println("   "+temp+" = -"+arg2+";");
        break;
      case MOD:
        out.println("   "+temp+" = "+arg1+" / "+arg2+";");
        modTemp=temp;
        temp=newTag();
        out.println("   "+temp+" = "+modTemp+" * "+arg2+";");
        modTemp=temp;
        temp=newTag();
        out.println("   "+temp+" = "+arg1+" - "+modTemp+";");
        modTemp=temp;
        break;
    }
    return modTemp;
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
      temp= newTag();
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

  public static String GenAsig(String id, String var){
    out.println("   "+id+" = "+var+";");
    return id;
  }

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
        out.println("   if ("+arg1+" == "+arg2+") goto "+aux.getF()+";");
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

  public static void GenGoto(String label){
    out.println("   goto "+label+";");
  }

  public static void GenLabel(String label){
    out.println(label+":");
  }
}
