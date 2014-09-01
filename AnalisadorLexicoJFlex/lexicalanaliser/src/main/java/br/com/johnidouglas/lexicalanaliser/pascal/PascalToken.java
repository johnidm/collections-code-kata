package br.com.johnidouglas.lexicalanaliser.pascal;

public class PascalToken {
	
	public String valor;
	public String nome;
 
    public PascalToken(String nome, String valor) {
       this.valor = valor;
       this.nome = nome; 
    }	
}
