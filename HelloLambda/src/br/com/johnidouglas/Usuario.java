package br.com.johnidouglas;
public class Usuario {

	private String nome;
	private int pontos;
	private boolean moderador;
	
	public Usuario(String nome, int pontos) {		
		this.pontos = pontos;
		this.nome = nome;
		this.moderador = true;		
	}
		
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public boolean isModerador() {
		return moderador;
	}
	
	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}

	public void tornaModerador() {
		if (!this.moderador) this.moderador = true;		
		
	}	
	
	@Override
	public String toString() {
	
		return "Nome " + getNome();
	}
	
}
