package main

import "fmt"

func main() {

	var x string = "Hello World."

	var y string
	y = "Okay!"

	fmt.Println(x + " " + y)

	const NAME = "JOHNI"

	fmt.Println(NAME)

	var (
		a = 5
		b = 2
		c = 3
	)

	fmt.Println(a + b + c)
}
