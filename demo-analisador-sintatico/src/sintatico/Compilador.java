package sintatico;

// java -cp /home/johni/Public/jflex-1.6.0/lib/java-cup-11a.jar java_cup.Main -parser AnalisadorSintatico /home/johni/Projects/collections-code-kata/demo-analisador-sintatico/src/sintatico/linguagem.cup

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
		
		
		AnalisadorLexico lexico = new AnalisadorLexico( r );	
		AnalisadorSintatico sintatico = new AnalisadorSintatico(lexico);
		sintatico.parse();
	
		
		
	}	
	
	
}
