package main

import (
	"fmt"
)

func main() {

	var a, i int
	fmt.Scan(&a, &i)

	// impact = citations / published
	// citations = impact * published

	fmt.Println((a * i) - (a - 1))

}
