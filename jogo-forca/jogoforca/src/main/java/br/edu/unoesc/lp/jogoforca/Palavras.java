package br.edu.unoesc.lp.jogoforca;

import java.util.ArrayList;
import java.util.Random;

public abstract class Palavras {
	
	private ArrayList<String> lista = new ArrayList<String>();	
	public Integer tentativas;
	
	public ArrayList<String> letradigitadas = new ArrayList<String>();
	
	public Palavras() {		
		lista = montarListaPalvras();		
		tentativas = definirTentativas();
	}
	
	
	public abstract String pesquisarDica(String palavra);
	
	protected abstract ArrayList<String> montarListaPalvras();
	protected abstract Integer definirTentativas();
	
	
	
	public String sorteio() {
			
		Random gerador = new Random();		 
        int indice = gerador.nextInt( lista.size());                
		        
        return lista.get(indice);  
	}
	
	public Boolean esgotouTentativa() {
		return tentativas.equals(0) ;
	}

	public boolean acertou(String palavra, ArrayList<String> letradigitadas2) {
		
		for (Character letra : palavra.toCharArray()) {
						
			if ( letradigitadas2.contains( letra.toString() ) ) {
				
			} else {
				return false ;
			}
		}		
		return true;		
	}

}
