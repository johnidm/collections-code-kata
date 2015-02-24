package main

import (
	"fmt"
)

func main() {
	
	elements := map[string]string{
		"a": "A",
		"b": "B",
		"c": "C",
		"d": "D",
	}

	if letter, ok := elements["x"]; ok {
		fmt.Println(letter)
	}
}