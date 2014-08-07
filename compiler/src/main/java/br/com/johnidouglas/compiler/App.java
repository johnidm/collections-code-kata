package br.com.johnidouglas.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//System.out.println("    lorem       ipsum        dolor \n sit.   ".trim().replaceAll("\\s+", " "));
    	
    	/*
    	String mytext = " hello     there   ";
    	mytext = mytext.replaceAll("( )+", " ");
    	System.out.println(mytext);
    	*/
    	
    	/*  
    	String before = "   sdfsdf sf    sdf      sd f sdf s dfs    ";
    	String after = before.trim().replaceAll(" +", " ");
    	System.out.println(after);
    	*/
    	    	  
    	//String valor = "este é um teste> teste01 <este é outro teste> teste02 <último teste> teste03 ";
    	//System.out.println( valor.replaceAll("(\\s?<[^>]*>\\s?)+", "") );
    	//String s = "Hi<friends>and<family>";
    	//System.out.println(s.replaceAll("<.*?>", ""));
    	
    	//String str = "Hi <friends> and <family>";
    	//String newStr = str.replaceAll("<[^>]*>", "");
    	//System.err.println(newStr);
    	
    	/*
    	
    	List<String> palavrasChaves = new ArrayList<String>();    	
    	palavrasChaves.add("while");
    	
    	if (palavrasChaves.contains("while")) {
    		System.out.println("achou");    		
    	} else {
    		System.err.println("nao achou");
    	}   	   	
    	   	
    	*/
    	/*
    	// gera os lexemas
    	String str="string with comma";
    	ArrayList aList= new ArrayList(Arrays.asList(str.split(" ")));
    	for(int i=0;i<aList.size();i++)
    	{
    	    System.out.println(" --> "+aList.get(i));
    	}
    	*/
    	/*
    	String commaSeparated = "item1 , item2 , item3";    	 	
    	ArrayList<String> items = new ArrayList<String>(Arrays.asList(commaSeparated.split("\\s*,\\s*")));   	
    	
    	for(String string: items){
			System.out.println(" --> "+ string)
		}    	
    	*/
    	
    	
    	
    	
    	// percorre os lexemas e tenta identificar ca um deles.
    	// usar expressoes regulares
    	/*
    	class Token {    		
    		private String token;
    		private String valor;  	    	

			public Token(String token, String valor) {    		
    			this.token = token;
    			this.valor = valor;    			
    		}

			public String getValor() {
				return valor;
			}
			
			public String getToken() {
				return token;
			}   		
    	}
    	*/
    	//List<Token> tokens = new ArrayList<Token>();
    	// loop ideitificando cada tipo de operacao
    	// verifica se é palavra reservada
    	// verifica se é um numero
    	// verifica se é uma string
    	// vrifica se é um identificador
    	// verifica se é um comando de atribuicao 
    	   	
    	/*
    	String n = "-?\\d*\\.?\\d*";       	
    	if ( "123456".matches(n) ) {
    		System.out.println("1 - casou");
    	}
    	
    	if ( "123.456".matches(n) ) {
    		System.out.println("2 - casou");
    	}
    	
    	if ( ".123456".matches(n) ) {
    		System.out.println("3 - casou");
    	}
    	
    	if ( "123456.".matches(n) ) {
    		System.out.println("4 - casou");
    	}
    	
    	if ( ".123.456.".matches(n) ) {
    		System.out.println("5 - casou");
    	}
    	
    	if ( "-123456".matches(n) ) {
    		System.out.println("6 - casou");
    	}
    	
    	if ( "12asda3456".matches(n) ) {
    		System.out.println("7 - casou");
    	}
    	
    	if ( "-.444".matches(n) ) {
    		System.out.println("8 - casou");
    	}
    	
    	if ( "-444.".matches(n) ) {
    		System.out.println("9 - casou");
    	}
    	  	
    	if ( "-44.4".matches(n) ) {
    		System.out.println("10 - casou");
    	}
    	*/ 	    	
    	
    }
    
}
