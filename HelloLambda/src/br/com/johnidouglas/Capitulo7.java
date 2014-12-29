package br.com.johnidouglas;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public class Capitulo7 {

	private static Usuario factoryUsuario(String nome, int pontos) {
		return new Usuario(nome, pontos);
	}

	public static void main(String[] args) {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();

		usuarios.add(factoryUsuario("Johni", 100));
		usuarios.add(factoryUsuario("Douglas", 100));
		usuarios.add(factoryUsuario("Marangon", 900));

		BiFunction<String, Integer, Usuario> criadorDeUsuarios = Usuario::new;
		Usuario dani = criadorDeUsuarios.apply("Dani", 200);
		Usuario fernanda = criadorDeUsuarios.apply("Fernanda", 200);

		usuarios.add(dani);
		usuarios.add(fernanda);
			
		
		
		//usuarios.sort(Comparator.comparing(Usuario::getNome));		
		//usuarios.subList(0, 3).forEach(System.out::println);
		
		//usuarios.stream().filter(u -> u.getPontos() >= 200 ).forEach(System.out::println);
			
		//usuarios.stream().filter(Usuario::isModerador).forEach(System.out::println);
	
		//List<Usuario> maisQue100 = new ArrayList<Usuario>();
		//usuarios.stream().filter(u-> u.getPontos() > 100).forEach(maisQue100::add);
		
		//List<Usuario> maisQue100 = usuarios.stream().filter(u-> u.getPontos() > 100).collect(Collectors.toList());
					
		//maisQue100.forEach(System.out::println);
		
		//List<Integer> pontos = usuarios.stream().map(Usuario::getPontos).collect(Collectors.toList());
		//pontos.forEach(u-> System.out.println(u));
		
		
		//IntStream stream = usuarios.stream().mapToInt(Usuario::getPontos);
		
		//double media = usuarios.stream().mapToInt(Usuario::getPontos).average().getAsDouble();
		
		//System.out.println(media);

		
		//double media = usuarios.stream().mapToInt(Usuario::getPontos).average().orElse(0.0);		
		//System.out.println(media);
		
		//double media = usuarios.stream().mapToInt(Usuario::getPontos).average().orElseThrow(IllegalStateException::new);
		
		//usuarios.stream().mapToInt(Usuario::getPontos).average().ifPresent(valor -> atualizar(valor);
		
		//Optional<Usuario> max = usuarios.stream().max(Comparator.comparingInt(Usuario::getPontos));
		//System.out.println(max.toString());
		
		//Optional<String> maxNome = usuarios.stream().max(Comparator.comparingInt(Usuario::getPontos)).map(u -> u.getNome());
		//System.out.println(maxNome);
		
				
		
						
			
		
		
	}

}
