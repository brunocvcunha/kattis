package main

import (
	"fmt"
)

func main() {

	var reps int
	fmt.Scan(&reps)

	var fibs = make([]int, reps+3)
	fibs[0] = 1
	fibs[1] = 1

	for i := 0; i < reps; i++ {
		fibs[i+2] = fibs[i] + fibs[i+1]
	}

	if reps > 1 {
		fmt.Print(fibs[reps-2])
	} else {
		fmt.Print(0)
	}

	fmt.Print(" ")

	if reps > 0 {
		fmt.Println(fibs[reps-1])
	} else {
		fmt.Println(0)
	}
}
