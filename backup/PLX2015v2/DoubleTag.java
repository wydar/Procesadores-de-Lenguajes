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
