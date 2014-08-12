package br.com.johnidouglas.sampleenum;

public enum Fruit {

	ORANGE(1, "Orange", true), MELON(12, "Melon", false);	
	
	public int code;
	public String description;
	public boolean update; 
	
	Fruit(int code, String description, boolean update) {
		this.code = code;
		this.description = description;
		this.update = update;
	}
	
}
