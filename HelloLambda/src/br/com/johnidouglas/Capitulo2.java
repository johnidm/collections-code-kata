package br.com.johnidouglas;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Capitulo2 {

	
	private static Usuario factoryUsuario(String nome, int pontos) {
		return new Usuario(nome, pontos);
	}
	
	public static void main(String ... args) {
	
		Usuario user1 = factoryUsuario("Johni", 100);
		Usuario user2 = factoryUsuario("Douglas", 500);
		Usuario user3 = factoryUsuario("Marangon", 900);
		
		//List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);		
		
		
		/*
		Consumer<Usuario> mostraMensagem = u -> System.out.println("Antes de imprimir");
		Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());
		Consumer<Usuario> imprimePontos = u -> System.out.println(u.getPontos());
		
		
		usuarios.forEach( mostraMensagem.andThen(imprimeNome).andThen(imprimePontos) );
		*/
		
		Predicate<Usuario> predicado = new Predicate<Usuario>() {
			
			public boolean test(Usuario u) {
				return u.getPontos() < 160;
			}
			
		};
		
		//usuarios.removeIf(predicado);
		usuarios.removeIf(u -> u.getPontos() < 160);
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		/*
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);
		*/
		/*
		for (Usuario u : usuario) {
			System.out.println(u.getNome());
		}*/
		
		/*
		usuarios.forEach(new Consumer<Usuario>() {
			@Override
			public void accept(Usuario t) {
				System.out.println(t.getNome());				
			}			
		});
		*/		
		
		/*
		Consumer<Usuario> mostrador = u -> System.out.println(u.getNome());
		usuarios.forEach(mostrador);
		*/
		
		//usuarios.forEach(u -> System.out.println(u.getNome()));
			
		
	}
	
}
