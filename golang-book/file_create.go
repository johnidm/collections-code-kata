package main

import (
	"os"
)

func main() {
	file, err := os.Create("main.txt")

	if err != nil {
		return
	}

	defer file.Close()

	file.WriteString("Johni")
}


