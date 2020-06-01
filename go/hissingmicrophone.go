package main

import (
	"fmt"
	"strings"
)

func main() {

	var word string
	fmt.Scan(&word)

	if strings.Contains(word, "ss") {
		fmt.Println("hiss")
	} else {
		fmt.Println("no hiss")
	}

}
