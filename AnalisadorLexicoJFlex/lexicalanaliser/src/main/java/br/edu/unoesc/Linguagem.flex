package br.edu.unoesc;
import java_cup.runtime.*;

%%

%{

/*-*
 * funcoes e variaveis
 */

private void imprimir(String descricao, String lexema) {
	 System.out.println(lexema + " - " + descricao);
	 
}

%}

/*-*
 * informacoes sobre a clase gerada
 */

%public
%class AnalisadorLexico
%type void


/*-*
 * definicaoes de regulares
 */
BRANCO = [\n| |\t]
ID = [_|a-z|A-Z][a-z|A-Z|0-9|_]*
INTEIRO = 0|[1-9][0-9]*
PONTOFLUTUANTE = [0-9][0-9]*"."[0-9]+
OPERADORES_MATEMATICOS = ("+" | "-" | "*" | "/")



%%

"for"							{ imprimir("Palavra reservada for", yytext()); }
"each"							{ imprimir("Palavra reservada each", yytext()); }
"print"							{ imprimir("Palavra reservada print", yytext()); }

"if"                           	{ imprimir("Intrucao if", yytext()); }
"then"                         	{ imprimir("Intrucao then", yytext()); }
{comentario}					{ imprimir("Comenatario", yytext()); }
{BRANCO} 						{ imprimir("Branco", yytext()); }
{ID} 							{ imprimir("Identificador", yytext()); }
{INTEIRO} 						{ imprimir("Numero", yytext()); }
{PONTOFLUTUANTE}				{ imprimir("Ponto plututante", yytext()); }
{OPERADORES_MATEMATICOS} 		{ imprimir("Operadores matematatico", yytext()); }

"("								{ imprimir("Abre parenteses", yytext()); }
")"								{ imprimir("Fecha parenteses", yytext()); }
","								{ imprimir("Separador de instrucoes", yytext()); }

"=="							{ imprimir("Operador igualdade", yytext()); }

. { throw new RuntimeException("Caractere invalido \""+yytext() + 
						"\" na linha "+yyline+", coluna "+yycolumn); }



