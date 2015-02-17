package sample.tests;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import sample.code.Fatura;

/*
 * Dado uma data de vencimento e uma data de pagamento, informar se o 
 * pagamento foi fento em dia ou se foi feito com atraso, se positivo, quandos dias
 */

public class FaturaTest {

	@Test
	public void testPagamentoEmAtraso() {
				
		assertTrue("Pagamento em atraso(1)", new Fatura().emAtraso(
				LocalDate.of(2014, Month.NOVEMBER, 27),
				LocalDate.of(2014, Month.NOVEMBER, 28) ) );	
		
		
		assertFalse("Pagamento em atraso(2)", new Fatura().emAtraso(
				LocalDate.of(2014, Month.NOVEMBER, 29),
				LocalDate.of(2014, Month.NOVEMBER, 29) ) );
		
		assertFalse("Pagamento em atraso(3)", new Fatura().emAtraso(
				LocalDate.of(2014, Month.NOVEMBER, 30),
				LocalDate.of(2014, Month.NOVEMBER, 29) ) );
		
		assertTrue("Pagamento em atraso(4)", new Fatura().emAtraso(
				LocalDate.of(2013, Month.NOVEMBER, 30),
				LocalDate.of(2014, Month.NOVEMBER, 30) ) );
		
		assertFalse("Pagamento em atraso(5)", new Fatura().emAtraso(
				LocalDate.of(2015, Month.NOVEMBER, 30),
				LocalDate.of(2014, Month.NOVEMBER, 30) ) );
				
	}

	@Test
	public void testDiasAtrasado() {	
		
		assertEquals("Dias em atraso (1)", 0, (int) new Fatura().diasEmAtraso(
				LocalDate.of(2014, Month.MARCH, 30),
				LocalDate.of(2014, Month.MARCH, 29))) ;	
							
		assertEquals("Dias em atraso (2)", 0, (int) new Fatura().diasEmAtraso(
				LocalDate.of(2014, Month.MARCH, 30),
				LocalDate.of(2014, Month.MARCH, 30))) ;	
		
		assertEquals("Dias em atraso (3)", 1, (int) new Fatura().diasEmAtraso(
				LocalDate.of(2014, Month.MARCH, 12),
				LocalDate.of(2014, Month.MARCH, 13))) ;
		
		assertEquals("Dias em atraso (4)", 10, (int) new Fatura().diasEmAtraso(
				LocalDate.of(2014, Month.MARCH, 12),
				LocalDate.of(2014, Month.MARCH, 22))) ;	
		
		
	}
			
}
