package main

import "fmt"

type Arquivo struct {
	nome string
	tamanho float64
	caracteres int
	palavras int
	linhas int
}

func main() {
	arquivo := Arquivo{"arquivo.txt", 12.68, 12986, 1862, 220}
	fmt.Println(arquivo)
	fmt.Printf("Média de palavras por linha %.2f\n", arquivo.MediaDePalavrasPorLinha())
	fmt.Printf("Tamanho médio de palavras %.2f\n", arquivo.TamanhoMedioDePalavras())
	



	codigoFonte := Arquivo{tamanho: 1.12, nome: "programa.go"}
	codigoFonte.tamanho = 34.3
	fmt.Println(codigoFonte)
}

func (arq *Arquivo) TamanhoMedioDePalavras() float64 {
	return float64(arq.caracteres) / float64(arq.palavras)
}

func (arq *Arquivo) MediaDePalavrasPorLinha() float64 {
	return float64(arq.palavras) / float64(arq.linhas)
}




