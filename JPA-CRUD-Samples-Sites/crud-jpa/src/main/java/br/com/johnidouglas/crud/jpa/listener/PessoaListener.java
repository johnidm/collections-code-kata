package br.com.johnidouglas.crud.jpa.listener;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;

import br.com.johnidouglas.crud.jpa.modelo.Pessoa;

public class PessoaListener {
	
	// http://www.arquitecturajava.com/jpa-entity-listener/
	
	@PrePersist
	public void salvar(Pessoa p) {
		System.out.println("Salvando a pessoa [listener] " + p.getNome());		
	}
	
	@PreRemove
	public void excluir(Pessoa p) {
		System.out.println("Excluindo a pessoa [listener]" + p.getNome());
	}

}
