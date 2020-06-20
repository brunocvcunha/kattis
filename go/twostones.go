package main

import (
	"bufio"
	"os"
)

func main() {

	reader := bufio.NewReader(os.Stdin)
	for {
		b, err := reader.ReadBytes()
		if err != nil {
			break
		}

		if b == 10 {
			break
		}

		if b == 'A' {
			if ball == 0 {
				ball = 1
			} else if ball == 1 {
				ball = 0
			}
		}

		if b == 'B' {
			if ball == 1 {
				ball = 2
			} else if ball == 2 {
				ball = 1
			}
		}

		if b == 'C' {
			if ball == 0 {
				ball = 2
			} else if ball == 2 {
				ball = 0
			}
		}

	}

}
