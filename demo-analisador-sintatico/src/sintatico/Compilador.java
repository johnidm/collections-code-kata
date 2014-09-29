package sintatico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Compilador {

	public static void main(String[] args) throws Exception {
		
		String path = "/home/johni/Projects/collections-code-kata/demo-analisador-sintatico/src/sintatico/";
		
		String sourcecode = path + "programa.ptg"; 
			
		File in =  new File(sourcecode);
		
		InputStreamReader r = new InputStreamReader(new FileInputStream(in));
		
		/*
		AnalisadorLexico lexico = new AnalisadorLexico( r );	
		AnalisadorSintatico sintatico = new AnalisadorSintatico(lexico);
		sintatico.parse();
		*/
		
		
	}	
	
	
}
