package main

import (
	"fmt"
)

func main() {

	m := make(map[byte][2]int)
	m['A'] = [2]int{11, 11}
	m['K'] = [2]int{4, 4}
	m['Q'] = [2]int{3, 3}
	m['J'] = [2]int{20, 2}
	m['T'] = [2]int{10, 10}
	m['9'] = [2]int{14, 0}
	m['8'] = [2]int{0, 0}
	m['7'] = [2]int{0, 0}

	var hands int
	fmt.Scan(&hands)

	var suit string
	fmt.Scan(&suit)

	sum := 0
	for i := 0; i < hands; i++ {
		for j := 0; j < 4; j++ {
			var pair string
			fmt.Scan(&pair)

			hand_card := pair[0]
			hand_suit := pair[1]

			index := 1
			if hand_suit == suit[0] {
				index = 0
			}
			sum += m[hand_card][index]

		}
	}

	fmt.Println(sum)
}
