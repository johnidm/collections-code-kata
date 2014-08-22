package br.edu.unoesc.lp.jogoforca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PalavrasFacil extends Palavras {

	@Override
	protected ArrayList<String> montarListaPalvras() {
		
		ArrayList<String> lista = new ArrayList<String>();		
		lista.add("peixe");			
		
		return lista;
	}

	@Override
	protected Integer definirTentativas() {	
		return 3;
	}

	@Override
	public String pesquisarDica(String palavra) {
		Map<String,String> dicas = new HashMap<String,String>();
		dicas.put("peixe", "Vive na agua"); 
				
		return dicas.get("peixe");
	}
	

}
