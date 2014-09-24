package br.com.johnidouglas.frontendcompiler.one;

public class Init {

	public static String path = "/home/johni/Projects/collections-code-kata/frontendcompiler/src/main/java/br/com/johnidouglas/frontendcompiler/one/";
	
	public static void main(String[] args) throws Exception {
					
		String sourcecode = path + "code.code"; 
		
		parser Parser = new parser();
		Parser.cargar(sourcecode);
		
	}
	
}
