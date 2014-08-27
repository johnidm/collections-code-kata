package br.com.johnidouglas.lexicalanaliser.pascal;

import java.io.FileReader;
import java.io.StringReader;

import java_cup.runtime.Symbol;

public class PascalExecute {

	public static void main(String[] args ) {
		
		
        try {
        	
        	//String sourcecode = "/home/johni/Projects/collections-code-kata/AnalisadorLexicoJFlex/lexicalanaliser/src/main/java/br/com/johnidouglas/lexicalanaliser/pascal/pascal.pas";
        	//new FileReader( sourcecode );
        	        	        	
            PascalLexer lexer = new PascalLexer( new StringReader("111\n   2222  55"));
            
            PascalToken token;
            
            System.out.println("Inicio analise lexica");      
                 
                      
            while ((token = lexer.yylex()) != null)  {
            	System.out.println( "<" + token.nome + "," + token.valor + ">");
            }
            
            
        }
        catch (Exception e) {
        	e.printStackTrace();        	        	        	
        }
		
	}
	
}
