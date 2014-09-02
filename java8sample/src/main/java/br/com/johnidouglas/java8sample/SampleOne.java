package br.com.johnidouglas.java8sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SampleOne 
{
	
	private static Integer maior(Integer numero01, Integer numero02) {
		
		if (numero01 > numero02) {
			return numero01; 
		} else {
			return numero02;
		}		
	}	
	
    public static void main( String[] args )
    {    	
    	 	
    	List<Integer> numeros = Arrays.asList( 1, 2, 3, 4, 5, 6);
    	
    	Predicate<Integer> pares = (n -> n % 2 == 0);
    	    	
    	int total = 0;
        
        for (int numero : numeros) {
            if (pares.test(numero)) {
                total += numero;
            }
        }
        
        System.out.print("A soma dos pares e " + total);
    }  
    
    
    private static void four() {
		
    	List<String> palavras = Arrays.asList("Johni", "Douglas", "Marangon", "Mano");
    	
    	palavras.stream().filter(s -> s.length() < 6).forEach(System.out::println);
    	
    	//IntStream intS = palavras.stream().mapToInt(String::length);
    	
    	OptionalDouble media = palavras.stream()
    			.mapToInt(String::length)
    			.average();
    	System.out.println(media.orElse(0));
    			
    	List<String> resultado = palavras.stream()
    			.filter(s -> s.length() < 6)
    			.collect(Collectors.toList()); 
    	
    	resultado.forEach(System.out::println); 	    	    	
	}


	private static void tree() {
		
    	List<String> palavras = Arrays.asList("Marangon", "Douglas", "Johni");
    	
    	/*
    	Comparator<String> comparador = new Comparator<String>() {
    		
    		public int compare(String s1, String s2) {
    			
    			return Integer.compare(s1.length(), s2.length());
    			
    		}
		};
    	Collections.sort(palavras, comparador);
    	*/    	
    	/*
    	Comparator<String> comparador = (s1, s2) -> {
    		return Integer.compare(s1.length(), s2.length());
    	};
    	*/	    	
    	/*
    	Comparator<String> comparador = (s1, s2) -> Integer.compare(s1.length(), s2.length());   	    	
		palavras.sort(comparador);
		*/
    	
    	
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));		
    	//palavras.sort(Comparator.comparing(s -> s.length()));
    	
    	
    	//palavras.sort(Comparator.comparing(String::length));
    	
    	palavras.sort(Comparator.comparingInt(String::length));
    	
    	palavras.forEach( s -> System.out.println("Uauu..." + s));   	
		
	}


	public static void sumLambda() {
    	
    	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    	 	    	        
    	System.out.println(somarTodos(numbers, n -> true));
    	System.out.println(somarTodos(numbers, n -> n % 2 == 0));
    	System.out.println(somarTodos(numbers, n -> n > 3));
    	    	
	}
    
    public static int somarTodos(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
       
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }
    
    public static void loopLambda() {
    	
    	List<Integer> idadeDosFuncionarios = Arrays.asList(18,21,22,23,27,34,45,62);
    	
    	/*
    	for(Integer idade : idadeDosFuncionarios) {
    	    System.out.println(idade);
    	}
    	*/         	
    	
    	//idadeDosFuncionarios.forEach((Integer valor) -> System.out.println(valor));
    	
    	//idadeDosFuncionarios.forEach(System.out::println);
		
	}
}
