public class Node{
  private String var;
  private int block;
  private  String type;
  private Node next;

  public Node(String var,int block,String type,Node next){
    this.var=var;
    this.block=block;
    this.type=type;
    this.next=next;
  }

  public String getVar(){
    return var;
  }

  public int getBlock(){
    return block;
  }

  public String getType(){
    return type;
  }

  public Node getNext(){
    return next;
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

  public void setNext(Node next){
    this.next=next;
  }
}
