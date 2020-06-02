package main

import (
	"fmt"
)

func main() {

	var num int
	fmt.Scan(&num)

	for i := 0; i < num; i++ {
		var r, e, c int
		fmt.Scan(&r, &e, &c)

		if e-c == r {
			fmt.Println("does not matter")
		} else if e-c < r {
			fmt.Println("do not advertise")
		} else {
			fmt.Println("advertise")
		}
	}

}
