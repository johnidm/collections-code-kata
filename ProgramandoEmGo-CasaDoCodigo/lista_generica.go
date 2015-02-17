package main

import "fmt"

type ListaGenerica []interface{}

func main() {
	lista := ListaGenerica{1, "Café", 42, true, 23, "Bola", 3.14, false}

	fmt.Printf("Lista original\n%v\n\n", lista)
	
	fmt.Printf("Removendo do ínicio: %v, após remoção: \n%v\n", lista.RemoverInicio(), lista)

	fmt.Printf("Removendo do fim: %v, após remoção: \n%v\n", lista.RemoverFim(), lista)
	
	fmt.Printf("Removendo índice 3: %v, após remoção: \n%v\n", lista.RemoverIndice(3), lista)


	
}

func (lista *ListaGenerica) RemoverIndice(indice int) interface{} {
	l := *lista
	removido := l[indice]
	*lista = append(l[0:indice], l[indice + 1:]...)
	return removido
}

func (lista *ListaGenerica) RemoverInicio() interface{} {
	return lista.RemoverIndice(0)
}

func (lista *ListaGenerica) RemoverFim() interface{} {
	return lista.RemoverIndice(len(*lista)-1)
}