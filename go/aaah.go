package main

import (
	"fmt"
)

func main() {

	var yell, need string
	fmt.Scan(&yell)
	fmt.Scan(&need)

	if len(yell) >= len(need) {
		fmt.Println("go")
	} else {
		fmt.Println("no")
	}
}
