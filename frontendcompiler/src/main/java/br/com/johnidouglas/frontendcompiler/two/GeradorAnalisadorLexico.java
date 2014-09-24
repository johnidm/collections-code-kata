package br.com.johnidouglas.frontendcompiler.two;

import java.io.File;

import br.com.johnidouglas.frontendcompiler.one.Init;

public class GeradorAnalisadorLexico {
	
	public static String path = "/home/johni/Projects/collections-code-kata/frontendcompiler/src/main/java/br/com/johnidouglas/frontendcompiler/two/";
	
	public static void main(String[] args) {
		String arquivo = GeradorAnalisadorLexico.path + "linguagem.lex";
	    
	    File file = new File(arquivo );        
	    jflex.Main.generate(file);
	}	
	  

}
