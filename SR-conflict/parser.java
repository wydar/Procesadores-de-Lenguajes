
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Aug 06 18:22:27 CEST 2018
//----------------------------------------------------

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Aug 06 18:22:27 CEST 2018
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\037\000\002\002\004\000\002\002\004\000\002\002" +
    "\002\000\002\003\004\000\002\003\007\000\002\003\005" +
    "\000\002\007\002\000\002\010\002\000\002\003\012\000" +
    "\002\005\003\000\002\004\005\000\002\004\005\000\002" +
    "\004\005\000\002\004\005\000\002\004\004\000\002\004" +
    "\005\000\002\004\005\000\002\004\003\000\002\004\003" +
    "\000\002\006\005\000\002\006\005\000\002\006\005\000" +
    "\002\006\005\000\002\006\005\000\002\006\005\000\002" +
    "\006\004\000\002\011\002\000\002\006\006\000\002\012" +
    "\002\000\002\006\006\000\002\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\101\000\022\002\uffff\004\uffff\006\uffff\010\uffff\013" +
    "\uffff\020\uffff\041\uffff\042\uffff\001\002\000\022\002\012" +
    "\004\015\006\016\010\011\013\007\020\013\041\006\042" +
    "\005\001\002\000\036\005\uffef\007\uffef\012\uffef\013\uffef" +
    "\014\uffef\015\uffef\030\uffef\031\uffef\033\uffef\034\uffef\035" +
    "\uffef\036\uffef\037\uffef\040\uffef\001\002\000\040\005\ufff0" +
    "\007\ufff0\012\ufff0\013\ufff0\014\ufff0\015\ufff0\016\102\030" +
    "\ufff0\031\ufff0\033\ufff0\034\ufff0\035\ufff0\036\ufff0\037\ufff0" +
    "\040\ufff0\001\002\000\012\006\016\013\007\041\006\042" +
    "\005\001\002\000\014\005\100\012\020\013\021\014\023" +
    "\015\022\001\002\000\022\004\uffff\006\uffff\010\uffff\011" +
    "\uffff\013\uffff\020\uffff\041\uffff\042\uffff\001\002\000\004" +
    "\002\000\001\002\000\004\006\035\001\002\000\024\002" +
    "\001\004\001\006\001\010\001\011\001\013\001\020\001" +
    "\041\001\042\001\001\002\000\004\006\031\001\002\000" +
    "\012\006\016\013\007\041\006\042\005\001\002\000\014" +
    "\007\024\012\020\013\021\014\023\015\022\001\002\000" +
    "\012\006\016\013\007\041\006\042\005\001\002\000\012" +
    "\006\016\013\007\041\006\042\005\001\002\000\012\006" +
    "\016\013\007\041\006\042\005\001\002\000\012\006\016" +
    "\013\007\041\006\042\005\001\002\000\036\005\ufff1\007" +
    "\ufff1\012\ufff1\013\ufff1\014\ufff1\015\ufff1\030\ufff1\031\ufff1" +
    "\033\ufff1\034\ufff1\035\ufff1\036\ufff1\037\ufff1\040\ufff1\001" +
    "\002\000\036\005\ufff5\007\ufff5\012\ufff5\013\ufff5\014\ufff5" +
    "\015\ufff5\030\ufff5\031\ufff5\033\ufff5\034\ufff5\035\ufff5\036" +
    "\ufff5\037\ufff5\040\ufff5\001\002\000\036\005\ufff4\007\ufff4" +
    "\012\ufff4\013\ufff4\014\ufff4\015\ufff4\030\ufff4\031\ufff4\033" +
    "\ufff4\034\ufff4\035\ufff4\036\ufff4\037\ufff4\040\ufff4\001\002" +
    "\000\036\005\ufff6\007\ufff6\012\ufff6\013\ufff6\014\023\015" +
    "\022\030\ufff6\031\ufff6\033\ufff6\034\ufff6\035\ufff6\036\ufff6" +
    "\037\ufff6\040\ufff6\001\002\000\036\005\ufff7\007\ufff7\012" +
    "\ufff7\013\ufff7\014\023\015\022\030\ufff7\031\ufff7\033\ufff7" +
    "\034\ufff7\035\ufff7\036\ufff7\037\ufff7\040\ufff7\001\002\000" +
    "\012\006\016\013\007\041\006\042\005\001\002\000\014" +
    "\007\033\012\020\013\021\014\023\015\022\001\002\000" +
    "\004\005\034\001\002\000\024\002\ufffd\004\ufffd\006\ufffd" +
    "\010\ufffd\011\ufffd\013\ufffd\020\ufffd\041\ufffd\042\ufffd\001" +
    "\002\000\014\006\040\013\007\032\036\041\006\042\005" +
    "\001\002\000\014\006\040\013\007\032\036\041\006\042" +
    "\005\001\002\000\010\007\067\030\062\031\060\001\002" +
    "\000\014\006\040\013\007\032\036\041\006\042\005\001" +
    "\002\000\026\012\020\013\021\014\023\015\022\033\046" +
    "\034\047\035\044\036\045\037\043\040\042\001\002\000" +
    "\012\006\016\013\007\041\006\042\005\001\002\000\012" +
    "\006\016\013\007\041\006\042\005\001\002\000\012\006" +
    "\016\013\007\041\006\042\005\001\002\000\012\006\016" +
    "\013\007\041\006\042\005\001\002\000\012\006\016\013" +
    "\007\041\006\042\005\001\002\000\012\006\016\013\007" +
    "\041\006\042\005\001\002\000\020\007\uffed\012\020\013" +
    "\021\014\023\015\022\030\uffed\031\uffed\001\002\000\020" +
    "\007\uffee\012\020\013\021\014\023\015\022\030\uffee\031" +
    "\uffee\001\002\000\020\007\uffeb\012\020\013\021\014\023" +
    "\015\022\030\uffeb\031\uffeb\001\002\000\020\007\uffea\012" +
    "\020\013\021\014\023\015\022\030\uffea\031\uffea\001\002" +
    "\000\020\007\uffec\012\020\013\021\014\023\015\022\030" +
    "\uffec\031\uffec\001\002\000\020\007\uffe9\012\020\013\021" +
    "\014\023\015\022\030\uffe9\031\uffe9\001\002\000\010\007" +
    "\061\030\062\031\060\001\002\000\030\007\024\012\020" +
    "\013\021\014\023\015\022\033\046\034\047\035\044\036" +
    "\045\037\043\040\042\001\002\000\014\006\uffe7\013\uffe7" +
    "\032\uffe7\041\uffe7\042\uffe7\001\002\000\010\007\uffe3\030" +
    "\uffe3\031\uffe3\001\002\000\014\006\uffe5\013\uffe5\032\uffe5" +
    "\041\uffe5\042\uffe5\001\002\000\014\006\040\013\007\032" +
    "\036\041\006\042\005\001\002\000\010\007\uffe4\030\uffe4" +
    "\031\uffe4\001\002\000\014\006\040\013\007\032\036\041" +
    "\006\042\005\001\002\000\010\007\uffe6\030\uffe6\031\uffe6" +
    "\001\002\000\020\004\ufffb\006\ufffb\010\ufffb\013\ufffb\020" +
    "\ufffb\041\ufffb\042\ufffb\001\002\000\020\004\015\006\016" +
    "\010\011\013\007\020\013\041\006\042\005\001\002\000" +
    "\020\004\ufffa\006\ufffa\010\ufffa\013\ufffa\020\ufffa\041\ufffa" +
    "\042\ufffa\001\002\000\020\004\015\006\016\010\011\013" +
    "\007\020\013\041\006\042\005\001\002\000\024\002\ufff9" +
    "\004\ufff9\006\ufff9\010\ufff9\011\ufff9\013\ufff9\020\ufff9\041" +
    "\ufff9\042\ufff9\001\002\000\024\002\ufff8\004\ufff8\006\ufff8" +
    "\010\ufff8\011\ufff8\013\ufff8\020\ufff8\041\ufff8\042\ufff8\001" +
    "\002\000\010\007\uffe8\030\062\031\060\001\002\000\022" +
    "\004\015\006\016\010\011\011\077\013\007\020\013\041" +
    "\006\042\005\001\002\000\024\002\ufffc\004\ufffc\006\ufffc" +
    "\010\ufffc\011\ufffc\013\ufffc\020\ufffc\041\ufffc\042\ufffc\001" +
    "\002\000\024\002\ufffe\004\ufffe\006\ufffe\010\ufffe\011\ufffe" +
    "\013\ufffe\020\ufffe\041\ufffe\042\ufffe\001\002\000\036\005" +
    "\ufff3\007\ufff3\012\ufff3\013\ufff3\014\ufff3\015\ufff3\030\ufff3" +
    "\031\ufff3\033\ufff3\034\ufff3\035\ufff3\036\ufff3\037\ufff3\040" +
    "\ufff3\001\002\000\012\006\016\013\007\041\006\042\005" +
    "\001\002\000\036\005\ufff2\007\ufff2\012\020\013\021\014" +
    "\023\015\022\030\ufff2\031\ufff2\033\ufff2\034\ufff2\035\ufff2" +
    "\036\ufff2\037\ufff2\040\ufff2\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\101\000\004\002\003\001\001\000\006\003\013\004" +
    "\007\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\100\001\001\000\002\001\001\000\004\002\075\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\004\016\001\001\000\002\001" +
    "\001\000\004\004\027\001\001\000\004\004\026\001\001" +
    "\000\004\004\025\001\001\000\004\004\024\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\004\031\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\004\040\006\036\001\001\000\006\004\040\006\074\001" +
    "\001\000\002\001\001\000\006\004\056\006\055\001\001" +
    "\000\002\001\001\000\004\004\054\001\001\000\004\004" +
    "\053\001\001\000\004\004\052\001\001\000\004\004\051" +
    "\001\001\000\004\004\050\001\001\000\004\004\047\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\011\064\001\001" +
    "\000\002\001\001\000\004\012\062\001\001\000\006\004" +
    "\040\006\063\001\001\000\002\001\001\000\006\004\040" +
    "\006\065\001\001\000\002\001\001\000\004\007\067\001" +
    "\001\000\006\003\070\004\007\001\001\000\004\010\071" +
    "\001\001\000\010\003\073\004\007\005\072\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\013\004\007\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\102\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // cond ::= AP cond CP 
            {
              DoubleTag RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		DoubleTag c = (DoubleTag)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=c; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // cond ::= cond OR NT$3 cond 
            {
              DoubleTag RESULT =null;
              // propagate RESULT from NT$3
                RESULT = (DoubleTag) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int c1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		DoubleTag c1 = (DoubleTag)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int c2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int c2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		DoubleTag c2 = (DoubleTag)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		Generator.GenLabel(c1.getV());
                                                  Generator.GenGoto(c2.getV());
                                                  RESULT=c2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // NT$3 ::= 
            {
              DoubleTag RESULT =null;
		int c1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		DoubleTag c1 = (DoubleTag)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
Generator.GenLabel(c1.getF()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$3",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // cond ::= cond AND NT$2 cond 
            {
              DoubleTag RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (DoubleTag) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int c1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		DoubleTag c1 = (DoubleTag)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int c2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int c2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		DoubleTag c2 = (DoubleTag)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		Generator.GenLabel(c1.getF());
                                                  Generator.GenGoto(c2.getF());
                                                  RESULT=c2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // NT$2 ::= 
            {
              DoubleTag RESULT =null;
		int c1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		DoubleTag c1 = (DoubleTag)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
Generator.GenLabel(c1.getV()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$2",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // cond ::= NOT cond 
            {
              DoubleTag RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		DoubleTag c = (DoubleTag)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		String aux = c.getV();
                                                  c.setV(c.getF());
                                                  c.setF(aux);
                                                  RESULT=c; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // cond ::= exp NEQ exp 
            {
              DoubleTag RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=Generator.GenCond(e1,Generator.NEQ,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // cond ::= exp GT exp 
            {
              DoubleTag RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=Generator.GenCond(e1,Generator.GT,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // cond ::= exp GEQ exp 
            {
              DoubleTag RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=Generator.GenCond(e1,Generator.GEQ,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // cond ::= exp EQ exp 
            {
              DoubleTag RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=Generator.GenCond(e1,Generator.EQ,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // cond ::= exp LEQ exp 
            {
              DoubleTag RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=Generator.GenCond(e1,Generator.LEQ,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // cond ::= exp LT exp 
            {
              DoubleTag RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=Generator.GenCond(e1,Generator.LT,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // exp ::= NUM 
            {
              String RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=n; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // exp ::= IDENT 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=id; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // exp ::= AP exp CP 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // exp ::= IDENT ASIG exp 
            {
              String RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=Generator.GenAsig(id,e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // exp ::= MENOS exp 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=Generator.GenBinOper(null,Generator.MENOSUNARIO,e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // exp ::= exp DIV exp 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=Generator.GenBinOper(e1,Generator.DIV,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // exp ::= exp POR exp 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=Generator.GenBinOper(e1,Generator.POR,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // exp ::= exp MENOS exp 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=Generator.GenBinOper(e1,Generator.MENOS,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // exp ::= exp MAS exp 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=Generator.GenBinOper(e1,Generator.MAS,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // part_else ::= sent 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("part_else",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // sent ::= IF AP cond CP NT$0 sent NT$1 part_else 
            {
              String RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (String) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		DoubleTag c = (DoubleTag)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sent",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NT$1 ::= 
            {
              String RESULT =(String) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		DoubleTag c = (DoubleTag)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
c.setV(c.getF());
                                                c.setF(DoubleTag.newTag());
                                                Generator.GenGoto(c.getF());
                                                Generator.GenLabel(c.getV());
                                                Generator.GenLabel(c.getF()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NT$0 ::= 
            {
              String RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		DoubleTag c = (DoubleTag)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
Generator.GenLabel(c.getV()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // sent ::= ALL List_sent CLL 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sent",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // sent ::= PRINT AP exp CP PYC 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		Generator.GenPrint(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("sent",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // sent ::= exp PYC 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("sent",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // List_sent ::= 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("List_sent",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= List_sent EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // List_sent ::= List_sent sent 
            {
              String RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("List_sent",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

