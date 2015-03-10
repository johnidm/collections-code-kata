package br.com.geladaonline.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Cerveja {

	private String nome;
	private String marca;
	private Integer id;
	
	public Cerveja(Integer id, String name, String marca) {		
		this.setNome(name);
		this.setMarca(marca);
		this.setId(id);
	}
	
	
	public Cerveja() {
	}		

	
	public String getNome() {
		return nome;
	}
	public void setNome(String name) {
		this.nome = name;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
}
