package br.com.johnidouglas;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;



public class Capitulo6 {

	private static Usuario factoryUsuario(String nome, int pontos) {
		return new Usuario(nome, pontos);
	}
	
	public static void main(String[] args) {
				
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(factoryUsuario("Johni", 100));
		usuarios.add(factoryUsuario("Douglas", 100));
		usuarios.add(factoryUsuario("Marangon", 900));
				
		
		//usuarios.forEach(u -> u.tornaModerador());
		
		// Method reference
		
		//usuarios.forEach(Usuario::tornaModerador);
		
		//Consumer<Usuario> tornaModerador = Usuario::tornaModerador;
		//usuarios.forEach(tornaModerador);
		
		//usuarios.sort(Comparator.comparing(Usuario::getNome));
		
		//Function<Usuario, String> byNome = Usuario::getNome;
		//usuarios.sort(Comparator.comparing(byNome));
		
		Comparator<Usuario> c = Comparator.comparingInt(Usuario::getPontos).thenComparing(Usuario::getNome).reversed();
		usuarios.sort(c);
		usuarios.forEach(System.out::println);			
		
		/*
		Supplier<Usuario> criadorDeUsuario = Usuario::new;
		Usuario johni = criadorDeUsuario.get();
		*/
		
		BiFunction<String, Integer, Usuario> criadorDeUsuarios = Usuario::new;
		Usuario dani = criadorDeUsuarios.apply("Dani", 200);
		Usuario fernanda = criadorDeUsuarios.apply("Fernanda", 200);
			
		usuarios.add(dani);
		usuarios.add(fernanda);
			
		
	}
	
}


