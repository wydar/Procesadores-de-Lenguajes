public class Node{
  private String var;
  private int block;
  private  String type; // (-1)-->NO TYPE 3-->INTEGER  4-->FLOAT
  private Node next;
  private boolean isArray;
  private int tam;


  public Node(String var,int block,String type,Node next){
    this.var=var;
    this.block=block;
    this.type=type;
    this.next=next;
    isArray=false;
    tam=-1;
  }

  public Node(String var,int block,String type,Node next,boolean isArray,int tam){
    this.var=var;
    this.block=block;
    this.type=type;
    this.next=next;
    this.isArray=isArray;
    this.tam=tam;
  }

  public String getVar(){
    return var;
  }

  public int getBlock(){
    return block;
  }

  public int getType(){
    int sol=-1;
    if(this.type.equals("INTEGER")){
      sol=3;
    }else if(this.type.equals("FLOAT")){
      sol=4;
    }
    return sol;
  }

  public Node getNext(){
    return next;
  }

  public boolean getIsArray(){
    return isArray;
  }

  public int getTam(){
    return tam;
  }

  public void setVar(String var){
    this.var=var;
  }

  public void setBlock(int block){
    this.block=block;
  }

  public void setType(String type){
    this.type=type;
  }

  public void setType(int tp){
    if(tp==3){
      this.type="INTEGER";
    }else if(tp==4){
      this.type="FLOAT";
    }
  }

  public void setNext(Node next){
    this.next=next;
  }

  public void setIsArray(boolean isArray){
    this.isArray=isArray;
  }

  public void setTam(int tam){
    this.tam=tam;
  }

  public String toString(){
    String str="";
    if(!isArray){
      str="nombre: "+var+"\ntipo: "+type+"\nbloque: "+block;
    }else{
      str="nombre: "+var+"\ntipo: "+type+"\nbloque: "+block+"\ntam: "+tam;
    }
    return str;
  }
}
