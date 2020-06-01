package main

import (
	"fmt"
)

func main() {

	var p int
	fmt.Scan(&p)

	for i := 0; i < p; i++ {
		var k, b, n int
		fmt.Scan(&k, &b, &n)

		num := 0
		for n > 0 {
			num_base := (n % b)
			num += num_base * num_base
			n /= b
		}

		fmt.Println(k, num)
	}

}
