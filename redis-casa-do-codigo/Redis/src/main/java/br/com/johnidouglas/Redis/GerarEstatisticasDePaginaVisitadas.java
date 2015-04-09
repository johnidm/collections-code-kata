package br.com.johnidouglas.Redis;

import redis.clients.jedis.Jedis;

public class GerarEstatisticasDePaginaVisitadas {

	public void gerarEstatistica(String pagina, String data) {
		
		String chave = String.format("pagina:%s:%s", pagina, data);
		
		Jedis jedis = new Jedis("localhost");
		
		long resultado = jedis.incr(chave);
		
		System.out.println(
				String.format("Página %s teve %d acesso(s) em %s",
						pagina, resultado, data) );
				
	}
	
	public static void main(String[] args) {
		
		String data = "02/09/2013";
		
		String[] paginasVisitadas = { 
				"/inicio",
				"/contato",
				"/sobre-mim",
				"/todos-os-posts",
				"/armazenamento-dados-no-redis"
		};
		
		GerarEstatisticasDePaginaVisitadas gerados = new GerarEstatisticasDePaginaVisitadas();
		gerados.gerarEstatistica(paginasVisitadas[0], data);
		gerados.gerarEstatistica(paginasVisitadas[1], data);
		gerados.gerarEstatistica(paginasVisitadas[2], data);
		gerados.gerarEstatistica(paginasVisitadas[1], data);
		gerados.gerarEstatistica(paginasVisitadas[1], data);
		gerados.gerarEstatistica(paginasVisitadas[1], data);
	}
	
	
}
