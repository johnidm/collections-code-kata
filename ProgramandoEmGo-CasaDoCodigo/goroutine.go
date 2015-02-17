package main

import (
"fmt"
"time"
)



func imprimir(n int) {
	for i := 0; i < 3; i++ {
		fmt.Printf("%d ", n)
		time.Sleep(200*time.Millisecond)
	}
	
}

func dormir() {
	fmt.Println("Goroutines dormindo por 5 segundos ...")
	time.Sleep(5 * time.Second)
	fmt.Println("Goroutines finalizadas")

}

func main() {
	
	/*go imprimir(2)
	imprimir(3)

	fmt.Println("")
	*/

	go dormir()

	fmt.Println("Goroutines dormindo por 5 segundos ...")
	time.Sleep(5 * time.Second)
	fmt.Println("Goroutines finalizadas")

}
