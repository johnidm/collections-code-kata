package br.edu.unoesc.lp.oop;

public class ContaCorrentePoupanca extends ContaCorrente {

	@Override
	public double saldo() {
		return saldoConta + (saldoConta * 0.03 );	
	}	

}
