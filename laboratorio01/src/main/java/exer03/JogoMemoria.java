package exer03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class JogoMemoria {
	
	public ArrayList<String> caracteres = new ArrayList<String>();
	
	private ArrayList<String> selecionar(Integer quantidade) {
		
		ArrayList<String> listaCaracteres = tiposCaracters();
		
		ArrayList<String> retorno = new ArrayList<String>();
		
		Random randon = new Random();
		
		for (int index = 1; index <= quantidade; index++) {		
			retorno.add( listaCaracteres.get(randon.nextInt(listaCaracteres.size())) );
		}		
		
		return retorno;					
	}
	
	public void iniciar() {
		caracteres = selecionar(5);
	}
	
	public String caracteres() {
		String retorno = "";
		
		for (String caractere : caracteres) {
			retorno += caractere + " ";		
		}
		
		return retorno.trim();
	}
	
	public boolean acertou(ArrayList<String> caracteresDigitados) {
		
		if (caracteresDigitados.size() != caracteres.size()) return false;
		
		Collections.sort(caracteres);
		Collections.sort(caracteresDigitados);
					
		caracteres.retainAll( caracteresDigitados );
		
		return true;
		
	}
	
	protected abstract ArrayList<String> tiposCaracters();
	

}
