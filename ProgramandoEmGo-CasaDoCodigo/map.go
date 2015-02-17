package main

import (
	"fmt"
)


func main() {

	//vazio1 := map[int]string{}
	//vazio2 := make(map[int]string)

	//mapaGrande := make(map[int]string, 4096)

	capitais := map[string]string{
		"GO": "Goiânia",
		"PB": "João Pessoa",
		"PR": "Curitiba"}

	fmt.Println(len(capitais))
	capitais["RM"] = "Natal"
	capitais["AM"] = "Manaus"
	capitais["SE"] = "Aracaju"

	fmt.Println(capitais)



}
