public class DoubleTag{
  private static int cont=0;
  private String v;
  private String f;

  public DoubleTag(){
    v=newTag();
    f=newTag();
  }

  public DoubleTag(String v,String f){
    this.v=v;
    this.f=f;
  }

  public static String newTag(){
    String tag="L"+cont;
    cont++;
    return tag;
  }

  //Si tf == true actualizamos v, si tf == false actualizamos f
  public static void updateTag(DoubleTag tag,boolean tf){
    if(tf){
      tag.setV(newTag());
    }else{
      tag.setF(newTag());
    }
  }
  
  public String getF(){
    return f;
  }

  public String getV(){
    return v;
  }

  public void setV(String v){
    this.v=v;
  }

  public void setF(String f){
    this.f=f;
  }
}
