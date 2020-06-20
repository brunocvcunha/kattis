package main

import (
	"fmt"
	"math"
)

func main() {

	var h, v float64
	fmt.Scan(&h, &v)

	fmt.Println(math.Ceil(h / math.Sin((v*math.Pi)/180)))

}
