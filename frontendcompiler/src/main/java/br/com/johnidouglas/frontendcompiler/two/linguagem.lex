package br.com.johnidouglas.frontendcompiler.two;

import java_cup.runtime.*;

%%

%{

private void log(String descricao, String lexema) {
	 System.out.println(lexema + " - " + descricao);
	 
}

%}


%cup
%public
%class AnalisadorLexico
%type java_cup.runtime.Symbol

BRANCO = [\n| |\t\r]

%%

"while" { log("Palavra reservada", yytext()); return new Symbol(sym._WHILE); }

"true" { log("Constante logica", yytext()); return new Symbol(sym._TRUE); }

"false" { log("Constante logica", yytext()); return new Symbol(sym._FALSE); }

"<>" { log("Constante logica", yytext()); return new Symbol(sym._SEPARADOR_BOOL); }

";" { log("ponto e virgula", yytext()); return new Symbol(sym._PONTO_E_VIRGULA); }

<<EOF>> { log("Final analise lexica", ""); return new Symbol(sym.EOF); }

{BRANCO} {  }

. { throw new RuntimeException("Caractere invalido \""+yytext() + "\" na linha "+yyline+", coluna "+yycolumn); }