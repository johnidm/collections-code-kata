package br.com.johnidouglas.sampleenum;

public enum SO {

	LINUX("Linux OS"), WINDOWS("Microsift Windows"), MAC("Applet MAC OS");
	
	public String description; 
	
	SO(String description) {
		this.description = description;
	}
	
}
