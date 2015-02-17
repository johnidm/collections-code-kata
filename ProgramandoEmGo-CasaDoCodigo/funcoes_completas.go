package main

import (
	"fmt"
)

func ImprimirVersao() {
	fmt.Println("1.12")
}

func ImprimirSaudacao(nome string) {
	fmt.Printf("Olá, %s\n", nome)
}

func ImprimirDados(nome string, idade int) {
	fmt.Printf("%s, %d anos.\n", nome, idade)
}

func ImprimirSoma(a, b int) {
	fmt.Println(a + b)
}

func Somar(a, b int) int {
	return a + b
}

func PrecoFinal_(precoCusto float64) (float64, float64) {
	fatorLucro := 1.33
	taxaConversao := 2.34

	precoFinalDolar := precoCusto * fatorLucro

	return precoFinalDolar, precoFinalDolar * taxaConversao
}

func PrecoFinal(precoCusto float64) (precoDolar float64, precoReal float64) {
	fatorLucro := 1.33
	taxaConversao := 2.34

	precoDolar := precoCusto * fatorLucro
	precoReal := precoDolar * taxaConversao

	return precoDolar, precoReal
}

func main() {
	ImprimirVersao()
	ImprimirSaudacao("Johni")
	ImprimirSoma(1, 2)
}

