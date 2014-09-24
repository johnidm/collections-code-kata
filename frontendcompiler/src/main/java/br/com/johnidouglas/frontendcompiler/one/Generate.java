package br.com.johnidouglas.frontendcompiler.one;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Generate {

	public static void main(String[] args) {
		//GenerateScanner();
		GenerateParser();
	}
	
	private static void GenerateScanner() {
		
    	String arquivo = Init.path + "scanner.lex";
          	    
        File file = new File(arquivo );        
        jflex.Main.generate(file);  		
		
	}
	
	private static void GenerateParser() {
		String arquivo = Init.path + "parser.cup";
  	    		
        String java_cup_main = "/home/johni/Projects/collections-code-kata/frontendcompiler/lib/jflex-1.6.0/lib/java-cup-11a.jar"; 
		
		String command = "java -cp " + java_cup_main + " java_cup.Main < " + 
		  arquivo;
		
		exec(command);
	}
	
	public static void exec(String cmd) {
        String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec(cmd);
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null)
                System.out.println("line: " + s);
            p.waitFor();
            System.out.println ("exit: " + p.exitValue());
            p.destroy();
        } catch (Exception e) {}
    }
	
	
	
}
