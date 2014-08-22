package br.edu.unoesc.lp.jogoforca;

import java.util.ArrayList;

public interface InterfaceGrafica {
		
	public void exibir(String frase);	
	
	public void imprimirUnderscore(Integer tamanho);
		
	public void imprimirAcerto(String palavra, ArrayList<String> letras);
	
	public String solicitarLetra(ArrayList<String> letradigitadas);
	
}
