package br.com.johnidouglas;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Capitulo9 {
	
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
		
		
		
		/*
		Map<Path, Long> linesPerFile = new HashMap<Path, Long>();
		 
		Files.list(Paths.get("/home/johni/Projetos/collections-code-kata/HelloLambda/src/"))
				.filter(p -> p.toString().endsWith(".java"))
				.forEach(p -> linesPerFile.put(p, lines(p).count() ));
		
		System.out.println(linesPerFile);
		*/
		/*						
		Map<Path, Long> linesPerFile = 
				Files.list(Paths.get("/home/johni/Projetos/collections-code-kata/HelloLambda/src/"))
				.filter(p -> p.toString().endsWith(".java"))
				.collect(Collectors.toMap(p -> p, p->lines(p).count()));
		
		System.out.println(linesPerFile);
		*/
			
		/*
		Map<Path, List<String>> contents = 
				Files.list(Paths.get("/home/johni/Projetos/collections-code-kata/HelloLambda/src/"))
				.filter(p -> p.toString().endsWith(".java"))
				.collect(Collectors.toMap(
						Function.identity(), 
						p -> lines(p).collect(Collectors.toList())));
						
						
					
	
		*/		
	
		
		/*
		List<Long> lines = 
				Files.list(Paths.get("/home/johni/Projetos/collections-code-kata/HelloLambda/src/"))
					.filter(p -> p.toString().endsWith(".java"))
					.map(p -> lines(p).count())
					.collect(Collectors.toList());			
				
		lines.forEach(e -> System.out.println(e));
		*/
		
		//Map<Integer, List<Usuario>> pontuacao = 
		//		usuarios.stream().collect(Collectors.groupingBy(Usuario::getPontos));
		
		//Map<Boolean, List<Usuario>> pontuacao = 
		//		usuarios.stream().collect(Collectors.partitioningBy(Usuario::isModerador));
		
		/*
		Map<Boolean, Integer> pontuacaoPorTipo = 
				usuarios.stream().collect(Collectors.partitioningBy(Usuario::isModerador, Collectors.summingInt(Usuario::getPontos)));
				*/
		/*
		List<Usuario> filtro = 
				usuarios.parallelStream().filter(u -> u.getPontos() > 0)
				.sorted(Comparator.comparing(Usuario::getNome))
				.collect(Collectors.toList());
		
		filtro.forEach(e -> System.out.println(e.getNome()));				
		*/
		
		/*
		long sum =
				LongStream.range(0, 1_000_000_000)
				.parallel()
				.filter(x -> x % 2 == 0)
				.sum();
		
		System.out.println(sum);
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
