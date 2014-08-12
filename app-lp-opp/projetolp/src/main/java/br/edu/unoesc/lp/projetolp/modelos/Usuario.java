package br.edu.unoesc.lp.projetolp.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Usuario {

	private Integer id;        // chave primaria
	private String nome;    // nome
	private Boolean ativo;  // se o cadastro esta ativo
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	

}
