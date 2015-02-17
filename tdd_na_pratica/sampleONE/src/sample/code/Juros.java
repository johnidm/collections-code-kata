package sample.code;

public class Juros {
	
	private double taxa = 2.00;
	private double capital;
	
	public double getTaxa() {
		return taxa;
	}
	
	public double calculaJuros(double valor) {
		
		capital = valor * taxa;
		return capital;		
		
	}

}
