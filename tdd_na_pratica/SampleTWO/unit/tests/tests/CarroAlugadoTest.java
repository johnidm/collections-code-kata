package tests;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import source.AlugaCarro;
import source.CarroAlugado;
import source.Cliente;


public class CarroAlugadoTest {

	
	@Mock
	private AlugaCarro alugaCarro;
	
	public CarroAlugadoTest() {
		alugaCarro = Mockito.mock(Cliente.class);
	}
	
	@Test
	public void testAlugaCarroParaCliente() {
		
		CarroAlugado carro = new CarroAlugado(alugaCarro);
		
		String resultadoEsperado = "Johni Camaro";		
		
		Mockito.when(alugaCarro.getNomeCliente()).thenReturn("Johni");
	    Mockito.when(alugaCarro.getModeloCarro()).thenReturn("Camaro");
	    
	    String resultado = carro.getAlugaCarro().getNomeCliente() + " " + carro.getAlugaCarro().getModeloCarro();
	    
	    Mockito.verify(alugaCarro).getNomeCliente();
	    
	    assertEquals(resultadoEsperado, resultado);
		
	}

}
