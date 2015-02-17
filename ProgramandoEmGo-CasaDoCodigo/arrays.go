package main

import "fmt"

func main() {

	var a [3]int
	
	numeros := [5]int{1, 2, 3, 4, 5}

	primos := [...]int{2, 3, 5, 7, 11, 13}
	
	nomes := [2]string{}
	texto := [3]string{"Ola", "Bom", "Dia"}
	
	fmt.Println(a, numeros, primos, nomes, texto)

	var multiA [2][2]int
	multiA[0][0], multiA[0][1] = 3, 5 
	multiA[1][0], multiA[1][1] = 7, -2 

	multiB := [2][2]int{{2, 13}, {-1, 6}}

	fmt.Println("Multi A", multiA)
	fmt.Println("Multi B", multiB)

}
