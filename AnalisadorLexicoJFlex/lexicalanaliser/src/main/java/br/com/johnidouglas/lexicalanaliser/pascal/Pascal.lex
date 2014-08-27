
package br.com.johnidouglas.lexicalanaliser.pascal;
import java_cup.runtime.*;

%%

%{

  private void log(String lexema, Integer linha, Integer coluna) {
	  System.out.println(lexema + " Linha: " + linha + " Coluna: " + coluna );  
  }	
	
%}


%public
%class PascalLexer
%type PascalToken

%line
%column

inteiro          	= 0|[1-9][0-9]*
brancos      		= [\n| |\t]

%%

{inteiro} {  log(yytext(), yyline, yycolumn); return new PascalToken( "numero", yytext()); }
{brancos} {  /**/ }

. { throw new RuntimeException("Caractere invalido \""+yytext() + 
						"\" na linha "+yyline+", coluna "+yycolumn); }
