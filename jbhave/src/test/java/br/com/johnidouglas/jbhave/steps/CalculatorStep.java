package br.com.johnidouglas.jbhave.steps;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.steps.Steps;

public class CalculatorStep extends Steps  {

	int x;
	
	public void dadoX(@Named("value") int value) {
		x = value;
	}
	
	public void quandoX(@Named("value") int value) {
		x = x * value;
	}
	
	public void entaoX(@Named("value") int value) {
		if (value != x) {
			throw new RuntimeException("Erro no teste");
		}
		 
	}
	
	
}
