package exer02;


import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

public class CriptografiaCesarTest  extends TestCase {

	
    CriptografiaCesar cripto;
	
	@BeforeClass
    public void setUp() {
		cripto = new CriptografiaCesar();
    }	
	
	@Test
	public void testCriptografar() {
		assertEquals("def", cripto.criptografar("abc"));
		assertEquals("456", cripto.criptografar("123"));
		assertEquals(":;<", cripto.criptografar("789"));
		
		
	}

	@Test
	public void testDescriptografar() {
		assertEquals("abc", cripto.descriptografar("def"));
		assertEquals("123", cripto.descriptografar("456"));
		assertEquals("789", cripto.descriptografar(":;<"));
	}
	
	

}
