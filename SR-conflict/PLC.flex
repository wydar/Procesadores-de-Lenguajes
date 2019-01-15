import java_cup.runtime.*;
%%
%cup
%%

"="                     {return new Symbol(sym.ASIG);}
"+"                     {return new Symbol(sym.MAS);}
"-"                     {return new Symbol(sym.MENOS);}
"*"                     {return new Symbol(sym.POR);}
"/"                     {return new Symbol(sym.DIV);}


"if"                    {return new Symbol(sym.IF);}
"else"                  {return new Symbol(sym.ELSE);}

"for"                   {return new Symbol(sym.FOR);}
"while"                 {return new Symbol(sym.WHILE);}
"do"                    {return new Symbol(sym.DO);}
"switch"                {return new Symbol(sym.SWITCH);}
"case"                  {return new Symbol(sym.CASE);}
"break"                 {return new Symbol(sym.BREAK);}

"print"                 {return new Symbol(sym.PRINT);}
";"                     {return new Symbol(sym.PYC);}


"("                     {return new Symbol(sym.AP);}
")"                     {return new Symbol(sym.CP);}
"{"                     {return new Symbol(sym.ALL);}
"}"                     {return new Symbol(sym.CLL);}

"||"                    {return new Symbol(sym.OR);}
"&&"                    {return new Symbol(sym.AND);}
"<"                     {return new Symbol(sym.LT);}
"<="                    {return new Symbol(sym.LEQ);}
">"                     {return new Symbol(sym.GT);}
">="                    {return new Symbol(sym.GEQ);}
"=="                    {return new Symbol(sym.EQ);}
"!="                    {return new Symbol(sym.NEQ);}
"!"                     {return new Symbol(sym.NOT);}

[_a-zA-Z][_a-zA-Z0-9]*  {return new Symbol(sym.IDENT,yytext());}
[1-9][0-9]*|0           {return new Symbol(sym.NUM,yytext());}
[\ \t\n]                {;}
[^]                     {throw new Error("Argumento no reconocido <<"+yytext()+" >>");}
