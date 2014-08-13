package br.edu.unoesc.lp.oop.exercicios;

public class CobrancaAluguelAtrasado extends CobrancaAluguel {
	
	public CobrancaAluguelAtrasado(Double valorAluguel) {
		super(valorAluguel);		
	}

	@Override
	protected Double calculaValorAluguel(int dias) {		
		return valorAluguel + (valorAluguel * ( dias * 0.01 ));  		
	}

	
	
}
