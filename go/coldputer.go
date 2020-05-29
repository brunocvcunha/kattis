package main

import (
	"fmt"
)

func main() {

	var num int
	fmt.Scan(&num)

	var negs int

	for i := 0; i < num; i++ {
		var temp int
		fmt.Scan(&temp)

		if temp < 0 {
			negs++
		}

	}

	fmt.Println(negs)
}
