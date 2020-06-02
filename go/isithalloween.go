package main

import (
	"fmt"
	"strings"
)

func main() {

	var month string
	var day int

	fmt.Scanf("%s %d", &month, &day)

	date := fmt.Sprint(month, " ", day)

	if strings.Compare(date, "OCT 31") == 0 || strings.Compare(date, "DEC 25") == 0 {
		fmt.Println("yup")
	} else {
		fmt.Println("nope")
	}

}
