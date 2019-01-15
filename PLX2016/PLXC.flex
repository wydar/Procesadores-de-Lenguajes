import java_cup.runtime.*;
%%
%cup
%xstate COMMENT

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment =  {EndOfLineComment} | {DocumentationComment}
//{TraditionalComment} |
//TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

%%

"="                                                  {return new Symbol(sym.ASIG);}
"+"                                                  {return new Symbol(sym.MAS);}
"-"                                                  {return new Symbol(sym.MENOS);}
"*"                                                  {return new Symbol(sym.POR);}
"/"                                                  {return new Symbol(sym.DIV);}
"++"                                                 {return new Symbol(sym.MASMAS);}
"--"                                                 {return new Symbol(sym.MENOSMENOS);}
"%"                                                  {return new Symbol(sym.MOD);}
"+="                                                 {return new Symbol(sym.MASEQ);}
"-="                                                 {return new Symbol(sym.MENOSEQ);}
"*="                                                 {return new Symbol(sym.POREQ);}
"/="                                                 {return new Symbol(sym.DIVEQ);}


"if"                                                 {return new Symbol(sym.IF);}
"else"                                               {return new Symbol(sym.ELSE);}

"for"                                                {return new Symbol(sym.FOR);}
"while"                                              {return new Symbol(sym.WHILE);}
"do"                                                 {return new Symbol(sym.DO);}
"switch"                                             {return new Symbol(sym.SWITCH);}
"case"                                               {return new Symbol(sym.CASE);}
"break"                                              {return new Symbol(sym.BREAK);}
"to"                                                 {return new Symbol(sym.TO);}
"downto"                                             {return new Symbol(sym.DOWNTO);}
"step"                                               {return new Symbol(sym.STEP);}


"print"                                              {return new Symbol(sym.PRINT);}
";"                                                  {return new Symbol(sym.PYC);}
","                                                  {return new Symbol(sym.COMA);}

"int"                                                {return new Symbol(sym.INT);}
"float"                                              {return new Symbol(sym.FLOAT);}

//"(int)"                                              {return new Symbol(sym.CASTINT);}
//"(float)"                                            {return new Symbol(sym.CASTFLOAT);}

"("                                                  {return new Symbol(sym.AP);}
")"                                                  {return new Symbol(sym.CP);}
"{"                                                  {return new Symbol(sym.ALL);}
"}"                                                  {return new Symbol(sym.CLL);}
"["                                                  {return new Symbol(sym.AC);}
"]"                                                  {return new Symbol(sym.CC);}

"||"                                                 {return new Symbol(sym.OR);}
"&&"                                                 {return new Symbol(sym.AND);}
"<"                                                  {return new Symbol(sym.LT);}
"<="                                                 {return new Symbol(sym.LEQ);}
">"                                                  {return new Symbol(sym.GT);}
">="                                                 {return new Symbol(sym.GEQ);}
"=="                                                 {return new Symbol(sym.EQ);}
"!="                                                 {return new Symbol(sym.NEQ);}
"!"                                                  {return new Symbol(sym.NOT);}

{Comment}                                            {}
"/*"                                                 {yybegin(COMMENT);}

[_a-zA-Z][_a-zA-Z0-9]*                               {return new Symbol(sym.IDENT,yytext());}
[1-9][0-9]*|0                                        {return new Symbol(sym.NUM,yytext());}
[-]?[0-9]*"."[0-9]*(E("+"|"-")?[0-9]+)?              {return new Symbol(sym.RNUM,yytext());}
[-]?[0-9]+E("+"|"-")?[0-9]+                          {return new Symbol(sym.RNUM,yytext());}
[\ \t\n]                                             {;}
[^]                                                  {throw new Error("Argumento no reconocido <<"+yytext()+" >>");}

<COMMENT>{
  ~"*/"                                              {yybegin(YYINITIAL);}
  [^*]                                               {}
  "/*"                                               {TS.error(1);}

}
