package main

import (
	"fmt"
)

func main() {

	var runs int
	fmt.Scan(&runs)

	for i := 0; i < runs; i++ {
		var num int
		fmt.Scan(&num)

		for j := num - 1; j > 1; j-- {
			num *= j
		}

		fmt.Println(num % 10)
	}

}
