import java_cup.runtime.*;
%%
%cup
%xstate COMMENT
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
EndOfLineComment     = {InputCharacter}* {LineTerminator}?
%%

//Palabras y simbolos reservados
"print"                                              {return new Symbol(sym.PRINT);}
"while"                                              {return new Symbol(sym.WHILE);}
":"                                                  {return new Symbol(sym.DP);}
"="                                                  {return new Symbol(sym.ASIG);}
"("                                                  {return new Symbol(sym.AP);}
")"                                                  {return new Symbol(sym.CP);}
"if"                                                 {return new Symbol(sym.IF);}
"elif"                                               {return new Symbol(sym.ELIF);}
"else"                                               {return new Symbol(sym.ELSE);}
"for"                                                {return new Symbol(sym.FOR);}
"in"                                                 {return new Symbol(sym.IN);}
"range"                                              {return new Symbol(sym.RANGE);}
","                                                  {return new Symbol(sym.COMA);}

//Operadores
"+"                                                  {return new Symbol(sym.MAS);}
"-"                                                  {return new Symbol(sym.MENOS);}
"*"                                                  {return new Symbol(sym.POR);}
"/"                                                  {return new Symbol(sym.DIV);}
"//"                                                 {return new Symbol(sym.DIV);}
"**"                                                 {return new Symbol(sym.POT);}
"%"                                                  {return new Symbol(sym.MOD);}
"<"                                                  {return new Symbol(sym.LT);}
"<="                                                 {return new Symbol(sym.LEQ);}
">"                                                  {return new Symbol(sym.GT);}
">="                                                 {return new Symbol(sym.GEQ);}
"=="                                                 {return new Symbol(sym.EQ);}
"!="                                                 {return new Symbol(sym.NEQ);}

//Variables
[_a-zA-Z][_a-zA-Z0-9]*                               {return new Symbol(sym.IDENT,yytext());}

//Numeros enteros
[1-9][0-9]*|0                                        {return new Symbol(sym.NUM,yytext());}

//Separadores
[\ \t\n]                                             {;}


//Comentarios
"#"{EndOfLineComment}                                {;}
"\'\'\'"                                             {yybegin(COMMENT); }
<COMMENT>{
  [^]                                                {;}
  "\'\'\'"                                           {yybegin(YYINITIAL); }
}
//Error
[^]                                                  {throw new Error("Argumento no reconocido << "+yytext()+" >>");}
