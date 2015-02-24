package main

import (
	"os"
	"fmt"
)

func main() {
	dir, err := os.Open(".")

	if err != nil {
		return
	}

	defer dir.Close()

	fileInfos, err := dir.Readdir(-1)

	if err != nil {
		return
	}

	for _, fi := range fileInfos {
		fmt.Println(fi.Name())
	}

}


