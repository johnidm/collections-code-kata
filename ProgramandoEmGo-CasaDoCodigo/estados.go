package main

import "fmt"

type Estado struct {
	nome	string
	populacao	int
	capital	string
}


func main() {
	estados := make(map[string]Estado, 2)

	estados["GO"] = Estado{"Goias", 6434052, "Goiânia"}	
	estados["PB"] = Estado{"Paraíba", 6434052, "João Pessoa"}

	for sigla, estado := range estados {
		fmt.Printf("%s, (%s) possui %d habitantes.\n", estado.nome, sigla, estado.populacao)
	}

	fmt.Println(estados)

	delete(estados, "PB")

	fmt.Println(estados)

	goias := estados["GO"]
	fmt.Println(goias)
	sc, encontrado := estados["SC"]
	if encontrado {
		fmt.Println(sc)	
	}
	

}
