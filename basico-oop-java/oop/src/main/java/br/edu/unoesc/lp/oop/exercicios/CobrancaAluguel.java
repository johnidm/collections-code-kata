package br.edu.unoesc.lp.oop.exercicios;

public abstract class CobrancaAluguel {
	
	protected Double valorAluguel;	
	
	public CobrancaAluguel(Double valorAluguel) {
		this.valorAluguel = valorAluguel;		
	}
		
	protected abstract Double calculaValorAluguel(int dias);
	
}
