package main

import "fmt"

func main() {

	fmt.Print("Enter a number: ")

	var input float64

	fmt.Scanf("%f", &input)

	output := input * 2

	fmt.Print(output)

	x := [6]string{"a", "b", "c", "d", "e", "f"}
	fmt.Println(x[2:5])

}
