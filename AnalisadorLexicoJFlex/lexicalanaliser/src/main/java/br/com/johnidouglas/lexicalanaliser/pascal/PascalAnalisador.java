package br.com.johnidouglas.lexicalanaliser.pascal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class PascalAnalisador {

	public static void main(String[] args ) {
				
        try {
        	
        	String sourcecode = "/home/johni/Projects/collections-code-kata/AnalisadorLexicoJFlex/lexicalanaliser/src/main/java/br/com/johnidouglas/lexicalanaliser/pascal/";
        	//sourcecode += "pascal.pas";
        	sourcecode += "prj02.pas";
        	
        	File in =  new File(sourcecode);
        	InputStreamReader r = new InputStreamReader(new FileInputStream(in));
        	System.out.println(r.getEncoding());
        	
            //PascalLexer lexer = new PascalLexer( new FileReader( sourcecode ) );
        	PascalLexer lexer = new PascalLexer( r );
            
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
