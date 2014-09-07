package br.com.johnidouglas.lexicalanaliser.pascal;

// http://users.csc.calpoly.edu/~gfisher/classes/330/examples/jflex/pascal.jflex
// https://github.com/fillipejsilva/C-to-Dalvik-Compiler/blob/master/src/Lexer/Lexer.flex 
// http://users.csc.calpoly.edu/~gfisher/classes/330/examples/jflex/PascalLexerTest.java
// http://users.csc.calpoly.edu/~gfisher/classes/330/examples/jflex/

import java.io.File;

public class GeradorPascal {
	public static void main(String[] args) {

		String path = "/home/johni/Projects/collections-code-kata/AnalisadorLexicoJFlex/lexicalanaliser/src/main/java/br/com/johnidouglas/lexicalanaliser/";
		String arquivo = path + "pascal/Pascal.lex";

		File file = new File(arquivo);
		jflex.Main.generate(file);

	}
}
