package main

import (
	"fmt"
	"sort"
)

func main() {

	nums := make([]int, 3)

	fmt.Scan(&nums[0], &nums[1], &nums[2])
	sort.Ints(nums)

	var order string
	fmt.Scan(&order)
	for i := 0; i < 3; i++ {
		fmt.Print(nums[order[i]-65], " ")
	}
	fmt.Println()

}
