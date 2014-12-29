package br.com.johnidouglas;

import java.util.List;


public class Capitulo12 {
	
	public static void addiciona(List<Usuario> lista) {
		
	}
	
	public static void main(String[] args) {
		
		/*
		System.out.println("Iniciando");	
		
		List<Usuario> lista = new ArrayList<>();
		
		addiciona(Collections.emptyList());
		*/
		
		new Thread(() -> { System.out.println("Init thread"); } ).start();
		
		
		
		
	}

}
