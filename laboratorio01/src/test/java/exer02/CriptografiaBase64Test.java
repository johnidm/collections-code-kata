package exer02;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

import exer01.CalculadoraBasica;

public class CriptografiaBase64Test extends TestCase {

	CriptografiaBase64 cripto;
	
	@BeforeClass
    public void setUp() {
		cripto = new CriptografiaBase64();
    }	
		
	@Test
	public void testCriptografar() {
		assertEquals("MTIzNA==", cripto.criptografar("1234"));
		assertEquals("YWJjZA==", cripto.criptografar("abcd"));
		
	}

	@Test
	public void testDescriptografar() {
		assertEquals("1234", cripto.descriptografar("MTIzNA=="));
		assertEquals("abcd", cripto.descriptografar("YWJjZA=="));
	}

}
