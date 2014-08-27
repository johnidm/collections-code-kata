package br.edu.unoesc;

// http://users.csc.calpoly.edu/~gfisher/classes/330/examples/jflex/pascal.jflex
// https://github.com/fillipejsilva/C-to-Dalvik-Compiler/blob/master/src/Lexer/Lexer.flex 
// http://users.csc.calpoly.edu/~gfisher/classes/330/examples/jflex/PascalLexerTest.java
// http://users.csc.calpoly.edu/~gfisher/classes/330/examples/jflex/

import java.io.File;

public class Gerador 
{
    public static void main( String[] args )
    {    	
    	String path = "/home/johni/Projects/collections-code-kata/AnalisadorLexicoJFlex/lexicalanaliser/src/main/java/br/edu/unoesc/";
    	String arquivo = path + "Linguagem.flex";
          	    
        File file = new File(arquivo );        
        jflex.Main.generate(file);  
                     
    }
}


