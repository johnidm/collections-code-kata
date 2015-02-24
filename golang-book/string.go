package main

import "fmt"

func main() {

	fmt.Println("My name is:\nJohni")

	fmt.Println(
		`Hello, 
		My name is Johni.
		Thanks!`)

	hello := "Hello Word!"

	fmt.Println(len(hello))
	fmt.Println(hello[2])
	fmt.Println(hello + " Okay.")

	fmt.Println((true && false) || (false && true) || !(false && false))

}
