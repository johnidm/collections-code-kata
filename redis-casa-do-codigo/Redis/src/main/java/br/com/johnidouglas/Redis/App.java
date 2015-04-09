package br.com.johnidouglas.Redis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;


public class App 
{
    public static void main( String[] args )
    {
    	
    	//exemple01();    	
    	//exemplo05();
    	//exemplo06();
    	exemplo10();
    	
    }

	private static void exemple01() {
		
		Jedis jedis = new Jedis("localhost");
		String resultado = jedis.echo("Hello redis!");
		
		System.out.println(resultado);	
		
	}
	
	private static void exemplo02() {
		Jedis jedis = new Jedis("localhost");
		String resultado = jedis.set("ultimo_logado", "Johni Douglas");
		
		System.out.println(resultado);	

	}
	
	private static void exemplo03() {
		Jedis jedis = new Jedis("localhost");
		String valor = jedis.get("ultimo_logado");
		
		System.out.println(valor);

	}
	
	private static void exemplo04() {
		Jedis jedis = new Jedis("localhost");
		
		Long resultado = jedis.del("ultimo_logado");
		
		System.out.println(resultado);	

	}
	
	private static void exemplo05() {
		
		String formato = "resultado:%s:megasena";
		
		String dataSorteio1 = "04-09-2013";
		String numerosSorteio1 = "11, 25, 47, 85, 74, 96";
		String chave1 = String.format(formato, dataSorteio1);
		
		String dataSorteio2 = "04-11-2014";
		String numerosSorteio2 = "52, 47, 87, 12, 45, 95";
		String chave2 = String.format(formato, dataSorteio2);
		
		String dataSorteio3 = "04-10-2015";
		String numerosSorteio3 = "";
		String chave3 = String.format(formato, dataSorteio3);
		
		Jedis jedis = new Jedis("localhost");
		
		String resultado = jedis.mset(
				chave1, numerosSorteio1,
				chave2, numerosSorteio2,
				chave3, numerosSorteio3	);
		
		System.out.println(resultado);	
		
	}
	
	private static void exemplo06() {
		
		String ganhadores = "22";
		String dataSorteio = "09-11-2013";
		String numeros = "8,9,41,54,36,47";
		
		String chave = String.format("resultado:%s:megasena", dataSorteio);
		
		Jedis jedis = new Jedis("localhost");
		long resultado1 = jedis.hset(chave, "ganhadores", ganhadores);
		long resultado2 = jedis.hset(chave, "numeros", numeros);
		
		
		String _ganhadores = jedis.hget(chave, "ganhadores");
		String _numeros = jedis.hget(chave, "numeros");
		
		System.out.println(_ganhadores);
		System.out.println(_numeros);
				
		
	}
	
	private static void exemplo07() {
		
		final String codigoUsuario = "1986";
		final String nomeDoUsuario = "Peter Parker";
		final String emailDoUsuario = "spider@spider.com";
		
		String chave = "sessao:usuario" + codigoUsuario;
		
		Map<String, String> campos = new HashMap<String, String>() {{
			put("codigo", codigoUsuario);
			put("nome", nomeDoUsuario);
			put("email", emailDoUsuario);
		}};
		
		Jedis jedis = new Jedis("localhost");		
		String resultado = jedis.hmset(chave, campos);		
		System.out.println(resultado);
	}
	
	
	private static void exemplo08() {
		
		Jedis jedis = new Jedis("localhost");	
		
		String codigoUsuario = "1986";			
		String chave = "sessao:usuario" + codigoUsuario;
		
		int tempoEmSegundos = 1800;
		
		
		long resultado = jedis.expire(chave, tempoEmSegundos);
		System.out.println(resultado);
		

	}
	
	private static void exemplo09() {
	
		String chave = "ultimas_paginas_visitadas";
		
		String[] paginasVisitadas = { 
				"/inicio",
				"/contato",
				"/sobre-mim",
				"/todos-os-posts",
				"/armazenamento-dados-no-redis"
		};
		
		Jedis jedis = new Jedis("localhost");
		
		Long resultado = jedis.lpush(chave, paginasVisitadas);
		
		System.out.println(String.format("A lista %s contém %d elementos", chave, resultado));
			
	}
	
	private static void exemplo10() {
	
		String chave = "ultimas_paginas_visitadas";
		
		Jedis jedis = new Jedis("localhost");
		
		List<String> paginas = jedis.lrange(chave, 0, 2);
		
		for (String pagina: paginas) {
			System.out.println(pagina);
		}
		
	}
	
}

