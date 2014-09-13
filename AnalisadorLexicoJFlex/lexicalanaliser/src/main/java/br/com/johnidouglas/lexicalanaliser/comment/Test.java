package br.com.johnidouglas.lexicalanaliser.comment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		
		String path_level_one = "/home/johni/Projects/collections-code-kata/AnalisadorLexicoJFlex/";
		String path_level_two = "lexicalanaliser/src/main/java/br/com/johnidouglas/lexicalanaliser/";
		String path_level_tree = "comment/source.source";
		
		String sourcecode = path_level_one + path_level_two + path_level_tree;
		
        Lexer lexer = new Lexer( new FileReader( sourcecode ) );   	                                                                              
        lexer.yylex();
	}

}
