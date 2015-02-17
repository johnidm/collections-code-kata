package main

import (
	"fmt"
)

func main() {
	
	fib := []int{1, 1, 2, 3, 5, 8, 13}
	fmt.Println(fib)
	fmt.Println(fib[:3])
	fmt.Println(fib[2:])
	fmt.Println(fib[:])

}

