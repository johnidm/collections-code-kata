package br.com.johnidouglas.tdd;

public class Produto {
	
	private Double valor;
	private String descricao;
	
	public Produto( String descricao, Double valor ) 
	{
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
