package sample.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sample.code.Banco;

public class BancoTest {
	
	private static final double DELTA = 1e-15;

	
	@Test
	public void testSaldoDivida() {
		
		Banco banco = new Banco();
		assertEquals(700.0, banco.saldoDivida(300.0), DELTA);		
	}

}
