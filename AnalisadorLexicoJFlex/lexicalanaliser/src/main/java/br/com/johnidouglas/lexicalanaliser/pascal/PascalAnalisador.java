package br.com.johnidouglas.lexicalanaliser.pascal;

import java.io.FileReader;
import java.io.StringReader;

import java_cup.runtime.Symbol;

public class PascalAnalisador {

	public static void main(String[] args ) {
				
        try {
        	
        	String sourcecode = "c://programa.pas";
        	        	        	        	
            PascalLexer lexer = new PascalLexer( new FileReader( sourcecode ) );
            
            PascalToken token;                                                                   
            while ((token = lexer.yylex()) != null)  {
            	System.out.println( "<" + token.nome + "," + token.valor + ">");
            }            
            
        }
        catch (Exception e) {
        	e.printStackTrace();        	        	        	
        }
		
	}
	
}
