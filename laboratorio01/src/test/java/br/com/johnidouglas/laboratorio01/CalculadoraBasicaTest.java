package br.com.johnidouglas.laboratorio01;


import org.junit.BeforeClass;


import exer01.CalculadoraBasica;
import junit.framework.TestCase;

public class CalculadoraBasicaTest extends TestCase {

	CalculadoraBasica calculadora;
	
	@BeforeClass
    public void setUp() {
		calculadora = new CalculadoraBasica();
    }
		
	public void testSoma(){					
		assertEquals(1, calculadora.soma(1, 0));
		assertEquals(2, calculadora.soma(1, 1));
		assertEquals(3, calculadora.soma(1, 2));
	}
	
	public void testDivisao(){
		assertEquals(1, calculadora.divisao(1, 1));
		assertEquals(2, calculadora.divisao(6, 3));
		assertEquals(2, calculadora.divisao(4, 2));		
	}
	
	public void testSubtracao() {
		assertEquals(0, calculadora.subtracao(1, 1));
		assertEquals(0, calculadora.subtracao(2, 2));
		assertEquals(2, calculadora.subtracao(4, 2));
		
	}	
	
	public void testMultiplicao() {
		assertEquals(1, calculadora.multiplicao(1, 1));
		assertEquals(4, calculadora.multiplicao(2, 2));
		assertEquals(8, calculadora.multiplicao(4, 2));
	}
	
	public void testModulo() {
		assertEquals(0, calculadora.modulo(1, 1));
		assertEquals(0, calculadora.modulo(4, 2));
		assertEquals(1, calculadora.modulo(3, 2));
	}
	
	

}

