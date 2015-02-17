package sample.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sample.code.RG;

public class RGTest {
	
	private RG validaRG;
	
	@Before
	public void setUp() {
		validaRG = new RG();	
	}
	
	@Test
	public void testIsValidRG() {
		
		assertFalse("1 - RG inválido", validaRG.isValidRG("128641011"));
		assertFalse("2 - RG inválido", validaRG.isValidRG(null));
		assertFalse("3 - RG inválido", validaRG.isValidRG(""));
		
		assertTrue("4 - RG válido", validaRG.isValidRG("12864010-43"));			
		assertFalse("5 - RG inválido", validaRG.isValidRG("abc12555-bg"));
	}

}
