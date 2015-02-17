package main

import (
	"fmt"
	"regexp"
	"strings"
)

func main() {
	/*
	texto := "Johni tem 29 anos"
	expr := regexp.MustCompile("\\d")

	fmt.Println(expr.ReplaceAllString(texto, "3"))
	*/

	texto := "bom dia a todos"
	expr := regexp.MustCompile("\\b\\w")

	transformadora := func(s string) string {
			return strings.ToUpper(s)
		}

	processado := expr.ReplaceAllStringFunc(
		texto,
		transformadora)

	fmt.Println(transformadora(texto))
	fmt.Println(processado)
	

}
