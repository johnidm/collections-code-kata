package br.edu.unoesc.lp.jogoforca;

import java.util.ArrayList;

public class Utils {

	public static String montarLista(ArrayList<String> letras) {
		String lista = "";

		for (String letra : letras) {
			lista += letra + " ";
		}

		return lista;

	}

	public static String montarUnderscore(Integer tamanho) {
		return new String(new char[tamanho]).replace("\0", " _ ");
	}

	public static String montarUnderscore(String palavra,
			ArrayList<String> letras) {

		String linha = "";

		for (Character letra : palavra.toCharArray()) {

			if (letras.contains(letra.toString())) {
				linha += " " + letra + " ";
			} else {
				linha += " _ ";
			}
		}
		return linha;
	}

}
