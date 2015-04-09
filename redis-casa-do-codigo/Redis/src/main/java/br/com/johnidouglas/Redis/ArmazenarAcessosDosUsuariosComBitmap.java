package br.com.johnidouglas.Redis;

import java.util.Arrays;
import java.util.Random;

import redis.clients.jedis.Jedis;

public class ArmazenarAcessosDosUsuariosComBitmap {
	
	final static String CHAVE = "acesso:%s"; 

	public static void armazenar(long codigoUsuario, String data) {
		
		Jedis jedis = new Jedis("localhost");
			
		String chave = String.format(CHAVE, data);
				
		jedis.setbit(chave, codigoUsuario, true);
		
		
	}
	
	public static void gerarAcessos() {
		
		int quantidadeUsuarios = 500;
		int quantidadeAcessos = 1000;
		int quantidadeDias = 30;
		
		Random random = new Random();
				
		for(Integer numero = 1; numero <= quantidadeAcessos; numero++) {
			long usuario = (random.nextInt(quantidadeUsuarios) + 1);
			
			String data = String.format("%02d/11/2013", random.nextInt(quantidadeDias) + 1);
							
			armazenar(usuario, data);					
					
		}					
	}
	
	
	public static long acessoPorPeriodo(String...datas) {
		Jedis jedis = new Jedis("localhost");
		
		long total = 0;
		
		for (String data : datas) {
			
			String chave = String.format(CHAVE, data);
			
			total =+ jedis.bitcount(chave);
			
		}
		
		return total;
		
	}
	
	
	public static void main(String[] args) {
		
		gerarAcessos();
		
		String[] diario = { "05/11/2013"};
		String[] semanal = { 
				"16/11/2013",
				"17/11/2013",
				"18/11/2013",
				"19/11/2013",
				"20/11/2013",
				"21/11/2013",
				"22/11/2013" };
		
		long totalDiario = acessoPorPeriodo(diario);
		long totalSemanal= acessoPorPeriodo(semanal);
		
		System.out.println(
					String.format("Total de usuários únicos no dia %s foi: %d", Arrays.asList(diario), totalDiario)				
				);
		
		System.out.println(
				String.format("Total de usuários únicos no dia %s foi: %d", Arrays.asList(semanal), totalSemanal)				
			);
		
		
		
		
		
		
		
		
	}
	
}
