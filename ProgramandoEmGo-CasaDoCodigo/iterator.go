package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	a, b := 0, 10

	for a < b {
		a += 1
	}

	fmt.Println(a)

	for i := 0; i < 10; i++ {
		fmt.Println(i)
	}

	primos := []int{2, 3, 5, 7, 11, 13}
	for i, n := range primos {
		fmt.Println(i, n)
	}
	for i := range primos {
		fmt.Println(primos[i])
	}

	var i = 0;
	for {
		i += 1
		if i == 6 {
			fmt.Println(i)
			break;
		}

	}

	rand.Seed(time.Now().UnixNano())
	aleatorio := rand.Intn(4200)
	fmt.Println(aleatorio)

	externo:
	for {
		for i = 0; i < 10; i ++ {
			if i == 5 {
				break externo
			}
		}
	}

}
