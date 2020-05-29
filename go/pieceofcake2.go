package main

import (
	"fmt"
)

func max(a int, b int) int {
	if a > b {
		return a
	}

	return b
}

func main() {

	var side, top, left int
	fmt.Scan(&side, &top, &left)

	fmt.Println((max(top, side-top)) * (max(left, side-left)) * 4)
}
