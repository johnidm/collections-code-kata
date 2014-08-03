package br.edu.unoesc.lp.oop;

public abstract class ContaCorrente {

	protected double saldoConta;
	
	
	public void deposito( double novoSaldo ) {
		this.saldoConta = novoSaldo;
	}

	public abstract double saldo();


}
