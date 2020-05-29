package main

import (
	"fmt"
)

func main() {

	var i int
	fmt.Scan(&i)

	for j := 1; j <= i; j++ {
		fmt.Println(j, "Abracadabra")
	}
}
