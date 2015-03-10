package br.com.johnidouglas.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class Estoque {

	public Estoque() {
	
		this.cervejas.put("Stella Artois",   new Cerveja("Stella Artois", "A cerveja belga mais francesa do mundo",
				"Artois", Cerveja.Tipo.LARGER));
	
		this.cervejas.put("Erdinger Weissbier", new Cerveja("Erdinger Weissbier", "Cerveja de trigo alemã",
				"Erdinger Weissbier", Cerveja.Tipo.WEIZEN));
		
	}

	private Map<String, Cerveja> cervejas = new HashMap<String, Cerveja>();
	
	public Collection<Cerveja> listarCervejas() {
		return new ArrayList<Cerveja>(this.cervejas.values()); 
	}
	
	public void adicionarCervejas (Cerveja cerveja) {
		this.cervejas.put(cerveja.getNome(), cerveja); 
	}
	
	public Cerveja recuperarCervejaPeloNome(String nome) {
		return this.cervejas.get(nome);
	}
	
}
