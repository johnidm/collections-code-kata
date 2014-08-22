package br.edu.unoesc.lp.oop.exercicios;

public class Testes {
	
	
	public static void main( String[] args )
    {
		
		//EntradaDados entrada = new EntradaDadosConsole();
		EntradaDados entrada = new EntradaDadosGUI();				
		//String nome = entrada.lerNome();
		//entrada.mostrarNome(nome);
		
		
		CobrancaAluguel aluguel = new CobrancaAluguelAtrasado(200.00);	
		Double valorAluguel = aluguel.calculaValorAluguel(20);
		
		System.out.println("Valor da divida do aluguel " + valorAluguel);
		
		
    }

}
