package br.edu.unoesc.lp.oop.exercicios;

import javax.swing.JOptionPane;

public class EntradaDadosGUI implements EntradaDados {

	public void mostrarNome(String nome) {
		JOptionPane.showMessageDialog(null, "Seu nome não é " + nome);		
	}

	public String lerNome() {
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		return nome;
	}
	
	

}
