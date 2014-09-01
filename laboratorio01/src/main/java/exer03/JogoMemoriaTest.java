package exer03;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

public class JogoMemoriaTest extends TestCase {

	@Test
	public void testOne() {
		JogoMemoria jogo = new JogoMemoriaNumeros();
		jogo.iniciar();
		
	  	System.out.println(jogo.caracteres());
		
	  	ArrayList<String> digitados = new ArrayList<String>();	  		  	
	  	digitados = jogo.caracteres;
	  	
		if (jogo.acertou(digitados)) {
	  		System.out.println("PARABENS!!! Voce ganhou");
	  	} else {
	  		System.out.println("QUE PENA!!! Voce perdeu");
	  	}
	  		
		ArrayList<String> digitados_one = new ArrayList<String>();	  		  	
		digitados_one.add("1");
	  	
		if (jogo.acertou(digitados_one)) {
	  		System.out.println("PARABENS!!! Voce ganhou");
	  	} else {
	  		System.out.println("QUE PENA!!! Voce perdeu");
	  	}
	  	
	}

}
