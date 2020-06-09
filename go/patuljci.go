package main

import (
	"fmt"
)

func check_array(array [9]int) bool {
	sum := 0

	for i := 0; i < 9; i++ {
		sum += array[i]
	}

	return (sum == 100)
}

func main() {

	var dwarves [9]int

	sum := 0
	for i := 0; i < 9; i++ {
		var num int
		fmt.Scan(&num)

		dwarves[i] = num
		sum += num
	}

	extra := sum - 100

	for i := 0; i < 9; i++ {
		for j := 0; j < 9; j++ {
			if dwarves[i]+dwarves[j] == extra {
				dwarves_check := dwarves
				dwarves_check[i] = 0
				dwarves_check[j] = 0

				if check_array(dwarves_check) {
					for i := 0; i < 9; i++ {
						if dwarves_check[i] > 0 {
							fmt.Println(dwarves_check[i])
						}
					}

					return
				}
			}
		}
	}

}
