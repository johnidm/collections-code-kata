package br.com.johnidouglas.Redis;

import java.util.List;

import redis.clients.jedis.Jedis;

import com.google.gson.Gson;

public class ConsumirItemNaFila {

	class Mensagem {
		private String nome;
		private String email;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
	}
	
	public void enviarEmailAtivacaoUsuario() {
		int timeout = 2;
		
		String chave = "fila:confirmar-usuario";
		
		Jedis jedis = new Jedis("localhost");
		List<String> mensagens = jedis.blpop(timeout, chave);
		
		if (mensagens == null) {
			System.out.println(String.format("A fila %s está vazia.", chave));
		} else {
			String json = mensagens.get(1);
			
			Mensagem mensagem = new Gson().fromJson(json, Mensagem.class);
			
			System.out.println(String.format(
					"Enviando e-mail para %s (%s).", mensagem.getNome(), mensagem.getEmail()));
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		ConsumirItemNaFila fila = new ConsumirItemNaFila();
		
		while (true) {
			fila.enviarEmailAtivacaoUsuario();
		}
		
	}
			
	
}
