package main

import (
	"fmt"
	"strings"
)

func main() {
	
	fmt.Println(

		strings.Contains("test", "es"),

		strings.Count("test", "t"),

		strings.HasPrefix("test", "te"),

		strings.HasSuffix("test", "st"),

		strings.Index("test", "e"),

		strings.Join([]string{"a", "b"}, "-"),

		strings.Repeat("a", 5),

		strings.Replace("aaaa", "a", "b", 2),

		strings.Split("a-b-c-d-e-f", "-"),

		strings.ToLower("TEST"),

		strings.ToUpper("test"),
	)

	arr := []byte("test")
	fmt.Println(arr)

	fmt.Println(string([]byte{'t', 'a', 'b'}))



}

