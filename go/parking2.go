package main

import (
	"fmt"
	"sort"
)

func main() {

	var num int
	fmt.Scan(&num)

	for i := 0; i < num; i++ {
		var stores int
		fmt.Scan(&stores)

		stores_array := make([]int, stores)

		sum := 0

		for j := 0; j < stores; j++ {
			var store int
			fmt.Scan(&store)

			stores_array[j] = store
			sum += store
		}

		sort.Ints(stores_array)

		distance := 0

		for i := 0; i < stores-1; i++ {
			distance += stores_array[i+1] - stores_array[i]
		}

		fmt.Println(distance * 2)
	}

}

func abs(x int) int {
	if x < 0 {
		return x * -1
	}

	return x
}
