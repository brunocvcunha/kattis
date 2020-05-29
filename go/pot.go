package main

import (
	"fmt"
	"math"
	"strconv"
)

func main() {

	var nums int
	fmt.Scan(&nums)

	var total int

	for i := 0; i < nums; i++ {
		var digit string
		fmt.Scan(&digit)

		digits := []rune(digit)

		base, _ := strconv.Atoi(string(digits[0 : len(digits)-1]))
		exp, _ := strconv.Atoi(string(digits[len(digits)-1]))

		total += int(math.Pow(float64(base), float64(exp)))

	}

	fmt.Println(total)

}
