package br.com.johnidouglas;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;



public class Capitulo5 {
	
	private static Usuario factoryUsuario(String nome, int pontos) {
		return new Usuario(nome, pontos);
	}

	public static void main(String[] args) {
		
		//List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(factoryUsuario("Johni", 1000));
		usuarios.add(factoryUsuario("Douglas", 500));
		usuarios.add(factoryUsuario("Marangon", 900));
		
		/*
		Comparator<Usuario> comparator = new Comparator<Usuario>() {

			@Override
			public int compare(Usuario o1, Usuario o2) {				
				return o1.getNome().compareTo(o2.getNome());					
			}			
		};		
		
		Collections.sort(usuarios, comparator);
				
		*/
		
		//Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));		
		//usuarios.forEach(u-> System.out.println(u.getNome()));
		
		//usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));		
		
		//usuarios.sort(Comparator.comparing( u-> u.getPontos()));		
		//usuarios.forEach(u-> System.out.println(u.getNome()));
		
		//Function<Usuario, Integer> extraiPontos = u -> u.getPontos();		
		//Comparator<Usuario> comparator = Comparator.comparing(extraiPontos);
		
		usuarios.sort(Comparator.comparingInt(u -> u.getPontos()));
		usuarios.forEach(u-> System.out.println(u.getNome()));
			
		
	}
	
}
