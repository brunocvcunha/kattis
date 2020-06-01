package main

import (
	"fmt"
	"math"
)

func nfib(n int) float64 {
	return (math.Pow(math.Phi, float64(n)) - math.Pow(math.Phi*-1, float64(n*-1))) / math.Sqrt(5)
}

func main() {

	var reps int
	fmt.Scan(&reps)

	fmt.Print(math.Round(nfib(reps-1)), math.Round(nfib(reps)))

}
