package main

import (
	"fmt"
)

func main() {

	need := []int{1, 1, 2, 2, 2, 8}

	for i := 0; i < len(need); i++ {
		var piece int
		fmt.Scan(&piece)

		fmt.Print(need[i]-piece, " ")

	}
}
