public class TS{
    private static Node first = null;
    private static Node last = null;
    public static int nBlock= 0;

    public static void newBlock(){
      nBlock++;
    }

    public static void oldBlock(){
      nBlock--;
    }

    public static void add(String var, String type){
      Node nod = new Node(var,nBlock,type,null);
      if(first==null){ //Si es el primer nodo que se va a insertar
        first = nod;
        last = nod;
      }else{
        if(!find(nod)){ //Si ya hay algun nodo
          if(first==last){//Si solo hay un nodo
            first.setNext(nod);
            last=nod;
          }else{//Si hay mas de un nodo
            last.setNext(nod);
            last=nod;
          }
        }else{
          error(1);
        }
      }
    }

    public static boolean find (Node nod){
      boolean is = false;
      if(first != null){  //Si hay algun nodo hacemos la comprobacion
        Node aux = first;
        String name = nod.getVar();
        int num = nod.getBlock();
        do{
          if(name == aux.getVar() && num == aux.getBlock()){
            is = true;
          }
          aux=aux.getNext();
        }while(aux!=null && !is);
      }
      return is;
    }

     //Si sameBlokck == true buscamos si la variable este declarada en el bloque ACTUAL
    public static boolean isDeclared(String var, boolean sameBlock){
      boolean is=false;
      Node aux= first;
      while(aux!=null && !is){
        if(aux.getVar().equals(var) && aux.getBlock()<=nBlock && !sameBlock){
          is=true;
        }
        if(aux.getVar().equals(var) && aux.getBlock()==nBlock && sameBlock){
          is=true;
        }
        aux=aux.getNext();
      }
      return is;
    }

    //Esta funcion parte de la base que la variable de entrada SI esta declarada
    public static String varBlock(String id){
      String sol=id;

      if(nBlock>0){
        Node aux=first;
        Node aux2=null;
        while(aux!=null){
          if(aux.getVar().equals(id) && aux.getBlock()==nBlock){
            sol=id+"_"+nBlock;
            break;
          }else{
            aux=aux.getNext();
          }
        }
      }
      return sol;
    }

    public static void error(int nError){
      PLXC.out.println("error;");

      switch(nError){
        case 1: //Variable ya declarada
          PLXC.out.println("# variable ya declarada");
        break;
        case 2: //Variable no declarada
          PLXC.out.println("# variable no declarada");
      }
    }
}
