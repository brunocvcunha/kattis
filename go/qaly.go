package main

import (
	"fmt"
)

func main() {

	var periods int
	fmt.Scan(&periods)

	var total float64

	for i := 0; i < periods; i++ {
		var weight, score float64
		fmt.Scan(&weight, &score)

		total += (weight * score)

	}

	fmt.Println(total)

}
