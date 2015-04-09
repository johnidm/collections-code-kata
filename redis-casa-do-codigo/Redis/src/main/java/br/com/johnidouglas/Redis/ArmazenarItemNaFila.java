package br.com.johnidouglas.Redis;

import redis.clients.jedis.Jedis;

public class ArmazenarItemNaFila {

	
	public void agendar(String nome, String email) {
		
		
		String chave = "fila:confirmar-usuario";
		String mensagem = String.format("{\"nome\" : \"%s\", \"email\" : \"%s\"}", nome, email);
		
		Jedis jedis = new Jedis("localhost");
		
		Long resultado = jedis.rpush(chave, mensagem);
		
		System.out.println(
				String.format("A fila %s contém %d tarefa(s)", chave, resultado) );
								
		
	}
	
	public static void main(String[] args) {
		ArmazenarItemNaFila fila = new ArmazenarItemNaFila();
		
		fila.agendar("Daenerys Targaryen", "daenerys@targaryen.com");
		
		fila.agendar("Jon Snow", "jon@snow.com");
		
		fila.agendar("Tyrion Lennister", "tyrion@lennister.com");
		
	}
	
	
}
