package main

import (
	"fmt"
)

func main() {

	var a[]int

	primos := []int{2, 3, 5, 7, 11, 13}
	nomes := []string{}

	fmt.Println(a, primos, nomes)

	b := make([]int, 10)
	fmt.Println(b, len(b), cap(b))

	c := make([]int, 10, 20)
	fmt.Println(c, len(c), cap(c))

}


