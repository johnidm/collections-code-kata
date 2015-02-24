package main

import "fmt"

func swap(x *int, y *int) {
	
	temp := *x

	*x = *y
	*y = temp	

	fmt.Println(&y)
}

func main() {
	x := 5
	y := 7
	fmt.Println(x, y)
	swap(&x, &y)
	fmt.Println(x, y)
	
}

