package br.com.johnidouglas.lexicalanaliser.comment;

%%
%{
  private void log(String lexeme) {
	  System.out.println("Lexeme ---> " + lexeme );  
  }	
  
  private void notFoundLog(String lexeme) {
	  System.out.println( "Lexeme not found ---> " + lexeme );  
  }	
  
%}

%public
%class Lexer
%type void

comment_type_one	= \{[^}]*\}
comment_type_two	= "/*" [^*] ~"*/" | "/*" "*"+ "/"
comment_type_tree	= "//"[^]*[\r|\n|\n|\r]
blank			= [\n| |\t|\r]

%%

{comment_type_one}  	{ log("Comment between { ... } - " + yytext() ); }
{comment_type_two}  	{ log("Comment between /* ... */ - " + yytext() ); }
{comment_type_tree}  	{ log("Comment between // ... - " + yytext() ); }

{blank} { }

. { notFoundLog(yytext()); }
