package br.edu.unoesc.lp.jogoforca;


import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceGraficaConsole implements InterfaceGrafica  {
	
	public void exibir(String frase) {
		
		
		System.out.println(frase);
		
		
		
	}
	
	public void imprimirUnderscore(Integer tamanho) {
		exibir(Utils.montarUnderscore(tamanho));	
	}
	
	public void imprimirAcerto(String palavra, ArrayList<String> letras) {
					
		exibir(Utils.montarUnderscore(palavra, letras));
	}
	
	public String solicitarLetra(ArrayList<String> letradigitadas) {
		
		Scanner in = new Scanner(System.in);		
		System.out.println("Letras digitadas : " + Utils.montarLista(letradigitadas));		
		System.out.println("Digite a letra ou ENTER para sair?");       
		String letra = in.nextLine( );
			   
	    return letra;
	   			
	}


}
