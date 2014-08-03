package br.edu.unoesc.lp.oop;

public class ClienteEspecial extends Cliente {
	
	private Double saldoBonus;
	
	
	public Double getSaldoBonus() {
		return saldoBonus;
	}


	public void setSaldoBonus(Double saldoBonus) {
		this.saldoBonus = saldoBonus;
	}


	public ClienteEspecial(String nome) {
		super(nome);
	}
}
