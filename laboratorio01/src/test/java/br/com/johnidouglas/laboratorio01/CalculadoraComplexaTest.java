package br.com.johnidouglas.laboratorio01;


import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

import exer01.CalculadoraComplexa;

public class CalculadoraComplexaTest extends TestCase {

	CalculadoraComplexa calculadora;
	
	@BeforeClass
    public void setUp() {
		calculadora = new CalculadoraComplexa();
    }
	
	
	@Test
	public void testElevarAoQuadrato() {
		assertEquals(16, calculadora.elevarAoQuadrato(4) );
		assertEquals(1,  calculadora.elevarAoQuadrato(1) );
		assertEquals(9,  calculadora.elevarAoQuadrato(3) );
	}

	@Test
	public void testEPar() {
		assertEquals(false, calculadora.ePar(1));
		assertEquals(true, calculadora.ePar(2));
		assertEquals(false, calculadora.ePar(3));
		assertEquals(true, calculadora.ePar(4));
	}

	@Test
	public void testEImpar() {
		assertEquals(true, calculadora.eImpar(1));
		assertEquals(false, calculadora.eImpar(2));
		assertEquals(true, calculadora.eImpar(3));
		assertEquals(false, calculadora.eImpar(4));
	}

	@Test
	public void testElevarAPotencia() {
		assertEquals(1, calculadora.elevarAPotencia(1, 1));
		assertEquals(4, calculadora.elevarAPotencia(2, 2));
		assertEquals(8, calculadora.elevarAPotencia(2, 3));
		assertEquals(27, calculadora.elevarAPotencia(3, 3));
		assertEquals(3125, calculadora.elevarAPotencia(5, 5));
		
	}

	@Test
	public void testEPrimo() {
		assertEquals(false, calculadora.ePrimo(0));
		assertEquals(false, calculadora.ePrimo(1));
		assertEquals(true, calculadora.ePrimo(2));
		assertEquals(true, calculadora.ePrimo(3));
		assertEquals(true, calculadora.ePrimo(5));
		assertEquals(true, calculadora.ePrimo(11));
		
		assertEquals(false, calculadora.ePrimo(6));
		
	}

}
