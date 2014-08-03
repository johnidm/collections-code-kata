package br.edu.unoesc.lp.oop;

public class ContaCorrentePoupancaOuro extends ContaCorrente {

	@Override
	public double saldo() {
		return this.saldoConta + (saldoConta * 0.1 );	
	}	
}
