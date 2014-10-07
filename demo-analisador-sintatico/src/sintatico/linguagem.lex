package sintatico;

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
CONSTANTE_NUMERICA = 0|[1-9][0-9]*
PONTO_FUTUANTE = {CONSTANTE_NUMERICA}\.{CONSTANTE_NUMERICA}

ID = [A-Za-z_][A-Za-z_0-9]*

%%

"inicio" 	{ log("Palavra reservada", yytext()); return new Symbol(sym.INICIO); }
"fim"		{ log("Palavra reservada", yytext()); return new Symbol(sym.FIM); }
"para"		{ log("Palavra reservada", yytext()); return new Symbol(sym.PARA); }
"ate"		{ log("Palavra reservada", yytext()); return new Symbol(sym.ATE); }
"faca"		{ log("Palavra reservada", yytext()); return new Symbol(sym.FACA); }
"se"		{ log("Palavra reservada", yytext()); return new Symbol(sym.SE); }

"verdadeiro"		{ log("Contante booleana", yytext()); return new Symbol(sym.VERDADEIRO); }


{CONSTANTE_NUMERICA} 	{ log("Constante numerica", yytext()); return new Symbol(sym.NUMERO); }
{PONTO_FUTUANTE}		{ log("Ponto flutuante", yytext()); return new Symbol(sym.PONTO_FLUTUANTE); }

{ID}					{ log("Id", yytext()); return new Symbol(sym.ID); }
"*"						{ log("Operador de multiplicacao", yytext()); return new Symbol(sym.MULTIPLICACAO); }
"<-" 					{ log("Sinal de atribuicao", yytext()); return new Symbol(sym.ATRIBUICAO); }

{BRANCO} {  }

. {  }

