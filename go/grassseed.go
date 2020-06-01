package main

import (
	"fmt"
)

func main() {

	var cost float64
	fmt.Scan(&cost)

	var lawns int
	fmt.Scan(&lawns)

	var total float64

	for i := 0; i < lawns; i++ {
		var width, length float64
		fmt.Scan(&width, &length)

		total += (width * length) * cost

	}

	fmt.Println(total)

}
