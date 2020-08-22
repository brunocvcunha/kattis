package main

import (
	"fmt"
)

func main() {

	var n, s, t int
	fmt.Scan(&n, &s, &t)

	D := make([][]int, n);

	for i := 0; i < n; i++ {
		D[i] = make([]int, n);

		for j := 0; j < n; j++ {
			fmt.Scan(&D[i][j]);
		}
	}

	// Floyd-Warshall Algorithm
	for k := 0; k < n; k++ {
		for i := 0; i < n; i++ {
			for j := 0; j < n; j++ {
				if D[i][j] > D[i][k] + D[k][j] {
					D[i][j] = D[i][k] + D[k][j];
				}
			}
		}
	}

	fmt.Println(D[s][t]);


}
