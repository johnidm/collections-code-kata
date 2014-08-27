package br.edu.unoesc.lp.oop.exercicios;

import java.util.Scanner;

public class EntradaDadosConsole implements EntradaDados {

	private Scanner digitacao;

	public void mostrarNome(String nome) {
		System.out.println( "Seu nome não é: " + nome);

	}

	public String lerNome() {
		digitacao  = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = digitacao.nextLine();

		return nome;
	}

}
