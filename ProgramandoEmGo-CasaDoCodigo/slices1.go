package main

import "fmt"

func main() {
	s := make([]int, 0)
	s = append(s, 23)
	fmt.Println(s)

	x := []int{23, 24, 25}
	n := []int{22}
	x = append(n, x...)
	fmt.Println(x)


	y := []int{11, 12, 13, 16, 17, 18}
	z := []int{14, 15}
	y = append(y[:3], append(z, y[3:]...)...)
	fmt.Println(y)

	a := []int{11, 12, 13, 16, 17, 18}
	a = a[1:]
	fmt.Println(a)

	numeros := []int{1, 2, 3, 4, 5}
	dobros := make([]int, len(numeros))

	copy(dobros, numeros)

	for i:= range dobros {
		dobros[i] *= 2 
	}
	fmt.Println(dobros)
	fmt.Println(numeros)


}



