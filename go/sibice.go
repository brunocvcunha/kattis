package main

import (
	"fmt"
	"math"
)

func main() {

	var num, w, h int
	fmt.Scan(&num, &w, &h)

	max_length := math.Sqrt(math.Pow(float64(w), 2) + math.Pow(float64(h), 2))

	for i := 0; i < num; i++ {
		var len int
		fmt.Scan(&len)

		if float64(len) <= max_length {
			fmt.Println("DA")
		} else {
			fmt.Println("NE")
		}

	}
}
