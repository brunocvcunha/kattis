package main

import (
	"fmt"
)

func main() {

	var winner_index int
	var winner_score int

	for i := 0; i < 5; i++ {

		var current_score int

		for j := 0; j < 4; j++ {
			var score int
			fmt.Scan(&score)

			current_score += score
		}

		if current_score > winner_score {
			winner_score = current_score
			winner_index = i
		}
	}

	fmt.Println(winner_index+1, winner_score)

}
