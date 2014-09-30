package br.com.johnidouglas.frontendcompiler.two;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

// java -cp /home/johni/Projects/collections-code-kata/frontendcompiler/lib/jflex-1.6.0/lib/java-cup-11a.jar java_cup.Main -parser AnalisadorSintatico  linguagem.cup 

public class TesteAnalisadorSintatico {
	
	public static void main(String[] args) throws Exception {			 		
		execute_two();
	}
	
	private static void execute_two() throws Exception {
		
		String path = "/home/johni/Projects/collections-code-kata/frontendcompiler/src/main/java/br/com/johnidouglas/frontendcompiler/two/";
								
		String sourcecode = path + "code.code"; 
			
		File in =  new File(sourcecode);
    	InputStreamReader r = new InputStreamReader(new FileInputStream(in));
		
		AnalisadorLexico lexico = new AnalisadorLexico( r );
		
		AnalisadorSintatico sintatico = new AnalisadorSintatico(lexico);
		
		sintatico.parse();			
		
	}
	
	
}
