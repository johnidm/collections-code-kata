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

inteiro          	= 0|[1-9][0-9]*
brancos			= [\n| |\t|\r]
delimitadores		= (":" | ";" | ".")
identificadores		= [A-Za-z_][A-Za-z_0-9]*

leftbrace       = \{
rightbrace      = \}
comment_body    = {nonrightbrace}*
nonrightbrace   = [^}]
comentario_1	= {leftbrace}{comment_body}{rightbrace}

comentario_2	= "/*" [^*] ~"*/" | "/*" "*"+ "/"

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r|\n|]
comentario_3	= "//" {InputCharacter}* {LineTerminator}





%%

"real"			{ log(yytext(), yyline, yycolumn); return new PascalToken( "real", "" ); }
"integer"		{ log(yytext(), yyline, yycolumn); return new PascalToken( "integer", "" ); }
">"			{ log(yytext(), yyline, yycolumn); return new PascalToken( ">", "" ); }
"*"			{ log(yytext(), yyline, yycolumn); return new PascalToken( "*", "" ); }
":="			{ log(yytext(), yyline, yycolumn); return new PascalToken( ":=", "" ); }
"program" 	{ log(yytext(), yyline, yycolumn); return new PascalToken( "program", "" ); }		
"var"		{ log(yytext(), yyline, yycolumn); return new PascalToken( "var", "" ); }
"begin"		{ log(yytext(), yyline, yycolumn); return new PascalToken( "begin", "" ); }
"if"		{ log(yytext(), yyline, yycolumn); return new PascalToken( "if", "" ); }
"then"		{ log(yytext(), yyline, yycolumn); return new PascalToken( "then", "" ); }
"else"		{ log(yytext(), yyline, yycolumn); return new PascalToken( "else", "" ); }
"end" 		{ log(yytext(), yyline, yycolumn); return new PascalToken( "end", "" ); }


{comentario_1}  { log("Comentario tipo 1 " + yytext() , yyline, yycolumn);  }
{comentario_2}  { log("Comentario tipo 2" + yytext() , yyline, yycolumn);  }
{comentario_3}  { log("Comentario tipo 3" + yytext() , yyline, yycolumn);  }


{identificadores}	{ log(yytext(), yyline, yycolumn); return new PascalToken( "id", yytext() ); }
{delimitadores}		{ log(yytext(), yyline, yycolumn); return new PascalToken( yytext(), "" ); }
{inteiro} 		{ log(yytext(), yyline, yycolumn); return new PascalToken( "numero", yytext() ); }
{brancos} 		{ /**/ }

. { log(yytext(), yyline, yycolumn); }
