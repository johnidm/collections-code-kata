package br.edu.unoesc;

import java.io.IOException;
import java.io.StringReader;

public class TesteAnalisadorLexico {
		
	public static void main( String[] args ) throws IOException {
		
		//String expr = "if ( 2+3+a) == ( valor + 3 ) then ";
		
		
		String expr = "for each( 0, 10, item, itens ) print item";
				
		AnalisadorLexico lexico = new AnalisadorLexico (new StringReader(expr));		
		lexico.yylex();
		
		
	}		
}


