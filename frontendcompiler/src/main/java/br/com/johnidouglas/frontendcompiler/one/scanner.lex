package br.com.johnidouglas.frontendcompiler.one;

import java_cup.sym;
import java_cup.runtime.Symbol;

%%
%cup
%ignorecase
%type java_cup.runtime.Symbol
%class scanner
%implements Scanner
%{
  public void PrintToken(String str){
    System.out.println(str);
  }
%}
%eofval{
System.out.println("Fin del archivo");
return null;
%eofval}
DIGITO = [0-9]
LETRA = [a-zA-Z]
ID = {LETRA}({LETRA}|{DIGITO})*
INT = {DIGITO}+
%%

"(" {PrintToken("Parentecis_Abre");return new Symbol(sym.PARENA);}
")" {PrintToken("Parentecis_Cierra");return new Symbol(sym.PARENC);}
"if" {PrintToken("IF");return new Symbol(sym.IF);}
"=" {PrintToken("Asignacion");return new Symbol(sym.ASIGN);}
"+" {PrintToken("Operador_Suma");return new Symbol(sym.SUMA);}
"*" {PrintToken("Operador_Multiplicacion");return new Symbol(sym.MULTP);}
"/" {PrintToken("Operador_Division");return new Symbol(sym.DIV);}
{INT} {PrintToken("Entero");return new Symbol(sym.INT, new Integer(Integer.parseInt(yytext())));}
{ID} {PrintToken("Identificador");return new Symbol(sym.ID, yytext());}
[\t\r\f]  {}
[\n] {}
" " {}
. {PrintToken("Caracter_no_valido");}