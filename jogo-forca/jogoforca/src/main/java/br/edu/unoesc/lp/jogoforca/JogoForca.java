package br.edu.unoesc.lp.jogoforca;

import java.io.IOException;

public class JogoForca {

	Palavras palavras = new PalavrasFacil();

	InterfaceGrafica grafico = new InterfaceGraficaConsole();
	InterfaceGrafica grafico = new InterfaceGraficaGUI();

	public void play() {

		String palavra = palavras.sorteio();

		grafico.exibir("Dica: a quantidade de palavras e: " + palavra.length());
		grafico.exibir("Dica: " + palavras.pesquisarDica(palavra));

		grafico.imprimirUnderscore(palavra.length());

		String letra = null;

		while ((letra = grafico.solicitarLetra(palavras.letradigitadas))
				.length() > 0) {

			palavras.letradigitadas.add(letra);

			if (palavras.esgotouTentativa()) {
				grafico.exibir("Voce esgotou as tentativas");

				System.exit(0);
			}

			if (palavra.contains(letra)) {

				grafico.exibir("Voce ACERTOU a letra " + letra);

				grafico.imprimirAcerto(palavra, palavras.letradigitadas);

				if (palavras.acertou(palavra, palavras.letradigitadas)) {
					grafico.exibir("Parabens voce venceu");
					System.exit(0);
				}

			} else {
				--palavras.tentativas;
				grafico.exibir("Voce ERROU a letra " + letra);
				grafico.exibir("Voce ainda tem " + palavras.tentativas
						+ " tentativa(s)");

				grafico.imprimirAcerto(palavra, palavras.letradigitadas);
			}

		}
	}
}
