package br.com.johnidouglas.compiler;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
     	
    	
    	ArrayList<Token> tokens = new ArrayList<Token>();
    	
    	   	   
    	/*
    	File arquivo = new File("c:\\linguagem.johni");
        StringBuilder conteudo = new StringBuilder();
        BufferedReader reader;        
        reader = new BufferedReader(new FileReader(arquivo));
        String text;
             
        while ((text = reader.readLine()) != null) {
            conteudo.append(text);
        } 
        System.out.println(conteudo.toString());
        reader.close();
        */    	
    	
    	// remover comentários
    	//String linhaDeCodigo = "boolean <Esse e um comentário> exibir()";
    	//System.out.println(linhaDeCodigo.replaceAll("<.*?>", ""));
    		
    	// remove espaços desnecessários
    	//String linhaDeCodigo = "   nome : string;      idade : int    ";
    	linhacoidigo = (linhaDeCodigo.trim().replaceAll(" +", " "));
    	
    	
    	// gera a lista de lexemas
    	String linhaDeCodigo="string { = exibir()";
    	ArrayList<String> lexemas= new ArrayList<String>(Arrays.asList(linhaDeCodigo.split(" ")));    	
    	for(String lexema : lexemas )
    	{
    	    if (lexema.matches("-?\\d*\\.?\\d*") {
    	    	
    	    	tokens.add( "numero", lexema );
    	    	
    	    	
    	    	
    	    }
    	
    	
    	
    	
    	
    	
    	}
    	
    	
    	// identificar o token de cada lexema
    	/*
    	String numero = "-?\\d*\\.?\\d*";       	
    	if ( "123456".matches(numero) ) {
    		System.out.println("casou");
    	}
    	*/
    	
    	/*
    	ArrayList<String> palavrasReservadas = new ArrayList<String>();    	
    	palavrasReservadas.add("while");
    	
    	if (palavrasReservadas.contains("while")) {
    		System.out.println("achou");    		
    	} else {
    		System.err.println("nao achou");
    	} 
    	*/
    	
    	String texto = "1exibir44___msg1";
    	if (texto.matches("([_]|[a-z]|[A-Z][0-9])([_]|[a-z]|[A-Z]|[0-9])*")) {
    		System.out.println("Casou");
    	}
    	
    	
    	   	
    	
    	//System.out.println("    lorem       ipsum        dolor \n sit.   ".trim().replaceAll("\\s+", " "));
    	
    	
    	//String valor = "<comentário da linguagen de programação>";    	
    	//System.out.println( valor.replaceAll("(\\s?<[^>]*>\\s?)+", "") );
    	
    	
    	/*
    	String mytext = " hello     there   ";
    	mytext = mytext.replaceAll("( )+", " ");
    	System.out.println(mytext);
    	*/
       	  
    	
    	//String str = "Hi <friends> and <family>";
    	//String newStr = str.replaceAll("<[^>]*>", "");
    	//System.err.println(newStr);
    	
    	/*
    	
    	  	   	
    	   	
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
