package main

import "fmt"

func main() {
	var xs = []float64{1.0, 5.0}
	fmt.Println(average(xs))
}

func average(xs []float64) float64 {
	
	total := 0.0

	for _, v := range xs {
		total += v
	}

	return total / float64(len(xs))

}

