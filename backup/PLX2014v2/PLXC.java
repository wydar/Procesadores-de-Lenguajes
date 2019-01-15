import java.io.*;
   
public class PLXC {	   
	public static PrintStream out;
	public static TS ts = new TS();
	public static void main(String argv[]) {    
    try {
      Reader in = new InputStreamReader(System.in);	
      out = System.out;
      if (argv.length>0) {
    	  in = new FileReader(argv[0]);
      }
      if (argv.length>1) {
    	  out = new PrintStream(new FileOutputStream(argv[1]));
      }
      parser p = new parser(new Yylex(in));
      Object result = p.parse().value;      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
