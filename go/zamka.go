package main

import (
	"fmt"
	"strconv"
)

func main() {

	var l, d, x int
	fmt.Scan(&l, &d, &x)

	for i := l; i <= d; i++ {
		ls := strconv.Itoa(i)

		sum := 0
		for _, char := range ls {
			sum += int(char - 48)
		}

		if sum == x {
			fmt.Println(i)
			break
		}
	}

	for i := d; i >= l; i-- {
		ls := strconv.Itoa(i)

		sum := 0
		for _, char := range ls {
			sum += int(char - 48)
		}

		if sum == x {
			fmt.Println(i)
			break
		}
	}

}
