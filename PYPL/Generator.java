import java.io.*;

public class Generator{
  private static PrintStream out = PYPLC.out;
  private static int contTemp = 0;
  public static final int MAS = 1;
  public static final int MENOS = 2;
  public static final int POR = 3;
  public static final int DIV = 4;
  public static final int MOD = 5;
  public static final int POT = 6;
  public static final int MUNARIO =7;
  public static final int LT = 8;
  public static final int LEQ = 9;
  public static final int GT = 10;
  public static final int GEQ = 11;
  public static final int EQ = 12;
  public static final int NEQ = 13;

  public static String newTemp(){
    String aux="$t"+contTemp;
    contTemp++;
    return aux;
  }

  public static void GenPrint(String arg){
    out.println("   print "+arg+";");
  }

  public static String GenAsig(String id,String exp){
    out.println("   "+id+" = "+exp+";");
    return id;
  }

  public static String GenBinOp(String arg1, int op, String arg2){
    String temp = newTemp();
    String modTemp="";
    switch(op){
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
      case MOD:
      out.println("   "+temp+" = "+arg1+" / "+arg2+";");
        modTemp=temp;
        temp=newTemp();
        out.println("   "+temp+" = "+modTemp+" * "+arg2+";");
        modTemp=temp;
        temp=newTemp();
        out.println("   "+temp+" = "+arg1+" - "+modTemp+";");
        modTemp=temp;
      break;
      case POT:
        out.println("nada");
      break;
      case MUNARIO:
        out.println("   "+temp+" = -"+arg2+";");
      break;
    }

    return temp;
  }

  public static void GenGoto(String label){
    out.println("   goto "+label+";");
  }

  public static void GenLabel(String label){
    out.println(label+":");
  }

  public static DoubleTag GenCond(String arg1, int op, String arg2,DoubleTag tag){
    DoubleTag aux;
    if(tag!=null){
      aux=tag;
    }else{
      aux=new DoubleTag();
    }
    switch(op){
      case LT:
        out.println("   if ("+arg1+" < "+arg2+") goto "+aux.getV()+";");
        GenGoto(aux.getF());
      break;
      case LEQ:
        out.println("   if ("+arg2+" < "+arg1+") goto "+aux.getF()+";");
        GenGoto(aux.getV());
      break;
      case GT:
        out.println("   if ("+arg2+" < "+arg1+") goto "+aux.getV()+";");
        GenGoto(aux.getF());
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
      break;
    }
    return aux;
  }
}
