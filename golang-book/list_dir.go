package main

import (
	"os"
	"fmt"
	"path/filepath"
)

func main() {
	filepath.Walk(".", func(path string, info os.FileInfo, err error) error{
		fmt.Println(path)
		return nil
	})
}



