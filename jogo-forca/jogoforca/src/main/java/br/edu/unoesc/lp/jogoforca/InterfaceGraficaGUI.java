package br.edu.unoesc.lp.jogoforca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class InterfaceGraficaGUI implements InterfaceGrafica {

	public void exibir(String frase) {
				
		JOptionPane.showMessageDialog(null, frase);
		
	}

	public void imprimirUnderscore(Integer tamanho) {
		exibir(Utils.montarUnderscore(tamanho));
	}

	public void imprimirAcerto(String palavra, ArrayList<String> letras) {
		exibir(Utils.montarUnderscore(palavra, letras));
		
	}

	public String solicitarLetra(ArrayList<String> letradigitadas) {
		
		String letra = null;

		Utils.montarLista(letradigitadas);
		
		letra = JOptionPane.showInputDialog("Letras digitadas " +
				Utils.montarLista(letradigitadas) +  
				"\nDigite a letra ou ENTER para sair?");
		
		return letra;
	}
	
	

}
