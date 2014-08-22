package br.com.johnidouglas.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App 
{
 
	private final static String ARQUIVO = "c:\\arquivo.txt";
	
	
	public static void main( String[] args ) throws IOException 
    {
		File arquivo = new File(ARQUIVO);
        StringBuilder conteudo = new StringBuilder();
        BufferedReader reader;
      
        reader = new BufferedReader(new FileReader(arquivo));
        String text;
             
        while ((text = reader.readLine()) != null) {
            conteudo.append(text);
        } 
        System.out.println(conteudo.toString());
        reader.close();
        
    }
	
	/*
	public static void gravarArquivo() throws IOException {
		
		File file = new File(ARQUIVO);
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));

		writer.write("1 1 1 1 1 \n");
		
		writer.flush(); //Cria o conteúdo do arquivo.
		writer.close(); //Fechando conexão e escrita do arquivo.
	}
    
    */
    public static void lerAquivo() throws IOException {
    	
    	/*
    	FileInputStream stream = new FileInputStream(ARQUIVO);
    	InputStreamReader reader = new InputStreamReader(stream);
    	BufferedReader br = new BufferedReader(reader);
    	String linha = br.readLine();
    	
    	while(linha != null) {    	   
    	   System.out.println(linha);   	    	   
    	   linha = br.readLine();
    	}
    	*/    	   	   	
    	
    	/*
    	Scanner scanner = new Scanner(new FileReader(ARQUIVO));       
    	while (scanner.hasNext()) {
    		System.out.println(scanner.next());					
		}
		*/    
    	/*
    	String arquivo =  new Scanner(new File(ARQUIVO)).next();
    	System.out.println(arquivo);
    	*/
    	
    	//local do arquivo
    	/*
        File arquivo = new File(ARQUIVO);
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
    	
    	FileReader fileReader = new FileReader(ARQUIVO);
    	BufferedReader reader = new BufferedReader(fileReader);
    	String data = null;
    	while((data = reader.readLine()) != null){
    	    System.out.println(data);
    	}
    	fileReader.close();
    	reader.close();
        
            	
    }
    
    
    
}
