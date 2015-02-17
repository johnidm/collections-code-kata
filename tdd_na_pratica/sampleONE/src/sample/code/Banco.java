package sample.code;

public class Banco {

	private double debito = 1000.0;
	private double debitoPendente;
	
	public double saldoDivida(double valorpago) {
		
		debitoPendente = debito - valorpago;
		
		return debitoPendente;		
		
	}	
}
