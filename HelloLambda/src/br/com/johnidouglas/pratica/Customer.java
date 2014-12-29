package br.com.johnidouglas.pratica;

public class Customer {

	private String name;
	
	public Customer(String name) {
		
		this.setName(name);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
	
		return this.name;
	}
	
	
}
