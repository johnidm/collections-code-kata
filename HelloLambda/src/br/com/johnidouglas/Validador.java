package br.com.johnidouglas;


@FunctionalInterface
public interface Validador<T> {

	
	boolean valida(T t);
	
}
