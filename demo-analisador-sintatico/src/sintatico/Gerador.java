package sintatico;

import java.io.File;

public class Gerador {
   
	
	public static void main(String[] args) {
	
		String path = "/home/johni/Projects/collections-code-kata/demo-analisador-sintatico/src/sintatico/";		
		String arquivo = path + "linguagem.lex";
	    
	    File file = new File(arquivo );        
	    jflex.Main.generate(file);
	    
	}		
	
}
