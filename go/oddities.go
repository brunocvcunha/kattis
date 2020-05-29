package main

import (
	"fmt"
)

func main() {

	var num int
	fmt.Scan(&num)

	for i := 0; i < num; i++ {
		var temp int
		fmt.Scan(&temp)

		if temp%2 == 0 {
			fmt.Println(temp, "is even")
		} else {
			fmt.Println(temp, "is odd")
		}

	}

}
