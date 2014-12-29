package br.com.johnidouglas;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Capitulo8 {
	
	private static Usuario factoryUsuario(String nome, int pontos) {
		return new Usuario(nome, pontos);
	}

	public static void main(String[] args) throws IOException {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();

		usuarios.add(factoryUsuario("Johni", 1));
		usuarios.add(factoryUsuario("Douglas", 2));
		usuarios.add(factoryUsuario("Marangon", 4));

		BiFunction<String, Integer, Usuario> criadorDeUsuarios = Usuario::new;
		Usuario dani = criadorDeUsuarios.apply("Dani", 2);
		Usuario fernanda = criadorDeUsuarios.apply("Fernanda", 2);

		usuarios.add(dani);
		usuarios.add(fernanda);
		
		//usuarios.stream().filter(u -> u.getPontos() > 100).sorted(Comparator.comparing(Usuario::getNome)).forEach( System.out::println );;
		
		
		//Usuario maisDe100 = usuarios.stream().filter(u -> u.getPontos() > 10000).collect(Collectors.toList()).get(0);
		//System.out.println(maisDe100.getNome());
		
		
		//Optional<Usuario> usuario = usuarios.stream().filter(u -> u.getPontos() > 10000).findAny();
		//System.out.println( usuario );
		
		//usuarios.stream().filter(u -> u.getPontos() > 0).peek(System.out::println).findAny();
		//usuarios.stream().sorted(Comparator.comparing(Usuario::getNome)).peek(System.out::println).findAny();
		
		
		//int total = usuarios.stream().mapToInt(Usuario::getPontos).sum();
		//System.out.println(total);
		
		/*
		int valorInicial = 0;
		IntBinaryOperator operacao = (a, b) -> a + b;		
		
		int total = usuarios.stream().mapToInt(Usuario::getPontos).reduce(valorInicial, operacao);
		System.out.println(total);
		*/
		
		//double total = usuarios.stream().mapToDouble(Usuario::getPontos).reduce( 1, (a, b) -> a * b);
		//System.out.println(total);
		
		//usuarios.stream().iterator().forEachRemaining(System.out::println);
		
		//boolean hasModerador = usuarios.stream().anyMatch(Usuario::isModerador);
		// allMatch - noneMatch
		//System.out.println(hasModerador);
		
		//Files.list(Paths.get("/home/johni/Projetos/collections-code-kata/HelloLambda/")).forEach(System.out::println);
		
		/*
		Files.list(Paths.get("/home/johni/Projetos/collections-code-kata/HelloLambda/src/"))
			.filter(p -> p.toString().endsWith(".java"))
			.map(p -> lines(p))
			.forEach(System.out::println);
		*/
		/*
		IntStream chars = 
				Files.list(Paths.get("/home/johni/Projetos/collections-code-kata/HelloLambda/src/"))
				.filter(p -> p.toString().endsWith(".java"))
				.flatMap(p -> lines(p))
				.flatMapToInt( (String s) -> s.chars());
		
		
		System.out.println(chars);
		*/
		
		
		
		
		
		
	}
	
	static Stream<String> lines(Path p) {
		try {			
			return Files.lines(p);			
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}				
	}

}
