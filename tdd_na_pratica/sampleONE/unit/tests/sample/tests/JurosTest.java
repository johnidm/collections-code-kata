package sample.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sample.code.Juros;

public class JurosTest {
	
	private static final double DELTA = 1e-15;

	@Test
	public void testCalculaJuros() {
		
		Juros juros = new Juros();
		
		assertEquals(500.0, juros.calculaJuros(250.0), DELTA);
				
		
	}

}
