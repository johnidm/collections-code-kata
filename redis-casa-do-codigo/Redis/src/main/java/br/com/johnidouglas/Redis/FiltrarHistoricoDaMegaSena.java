package br.com.johnidouglas.Redis;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class FiltrarHistoricoDaMegaSena {
	
	private Jedis jedis;

	public Set<String> filtarResultados(int mes, int ano) {
		
		String chave = "resultado:*-%02d-%04d:megasena";
		
		jedis = new Jedis("localhost");
		
		return jedis.keys(String.format(chave, mes, ano));		
		
	}
	
	public static void main(String[] args) {
		int mes = 10;
		int ano = 2015;
		Set<String> chaves = new FiltrarHistoricoDaMegaSena().filtarResultados(mes, ano);
		
		chaves.forEach( c -> System.out.println(c) );
		
	}
	
}
