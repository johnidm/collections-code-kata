package br.com.johnidouglas.lexicalanaliser.comment;

import java.io.File;

public class Generator {
	
	public static void main(String[] args) {
		
		String path_level_one = "/home/johni/Projects/collections-code-kata/AnalisadorLexicoJFlex/";
		String path_level_two = "lexicalanaliser/src/main/java/br/com/johnidouglas/lexicalanaliser/";
		String path_level_tree = "comment/jflex.jflex"; 
		
		String arquivo = path_level_one + path_level_two + path_level_tree;

		File file = new File(arquivo);
		jflex.Main.generate(file);
		
	}

}
