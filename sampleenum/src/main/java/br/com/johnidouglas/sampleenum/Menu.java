package br.com.johnidouglas.sampleenum;


public enum Menu {

	
	SAVE(1), DELETE(2), UPDATE(3), READ(4);
	
	private int option;
	
	Menu( int option ) {
		this.option = option;		
	}
	
	public int getOption() {
		return this.option;
	}
}
