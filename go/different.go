package main

import (
	"fmt"
)

func abs(num int64) int64 {
	if num < 0 {
		return num * -1
	}

	return num
}

func main() {

	var num1, num2 int64
	fmt.Scan(&num1, &num2)

	fmt.Println(abs(num2 - num1))

}
