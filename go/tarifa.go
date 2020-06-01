package main

import (
	"fmt"
)

func main() {

	var x int
	fmt.Scan(&x)

	var n int
	fmt.Scan(&n)

	var leftover int

	for i := 0; i < n; i++ {
		var spent int
		fmt.Scan(&spent)

		leftover += x - spent

	}

	fmt.Println(leftover + x)

}
