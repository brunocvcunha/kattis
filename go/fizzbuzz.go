package main

import (
	"fmt"
)

func main() {

	var x, y, n int
	fmt.Scan(&x, &y, &n)

	for i := 1; i <= n; i++ {

		f := i%x == 0
		b := i%y == 0

		if f || b {
			if f {
				fmt.Print("Fizz")
			}
			if b {
				fmt.Print("Buzz")
			}

		} else {
			fmt.Print(i)
		}

		fmt.Println()
	}
}
