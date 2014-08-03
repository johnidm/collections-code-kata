package br.edu.unoesc.lp.oop;

public class Cliente {
	
	public static String nomeClasse = "Cliente";

	private String nome;
	
	public static String getNomeClasse(){
		return nomeClasse;  
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cliente(String nome) {
		this.nome = nome;		
	}

	
}
