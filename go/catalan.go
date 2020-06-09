package main

import (
	"fmt"
	"math/big"
)

var facts [10001]*big.Int

func factorial(n int64) *big.Int {

	if facts[n] != nil {
		return facts[n]
	}

	fact := big.NewInt(1).Mul(big.NewInt(n), factorial(n-1))
	facts[n] = fact
	return fact
}

func catalan(num int64) *big.Int {
	n := big.NewInt(1)

	factor2 := factorial(num * 2)
	factorplus1 := factorial(num + 1)
	factor := factorial(num)

	return n.Div(factor2, n.Mul(factorplus1, factor))
}

func main() {

	facts[0] = big.NewInt(1)
	facts[1] = big.NewInt(1)

	var q int
	fmt.Scan(&q)

	for i := 0; i < q; i++ {
		var n int64
		fmt.Scan(&n)

		fmt.Println(catalan(n))
	}

}
