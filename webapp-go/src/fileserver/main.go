package main

import (
	"fmt"
	"github.com/russross/blackfriday"
	"io/ioutil"
	"net/http"
	"os"
)

func main() {

	http.HandleFunc("/markdown", GenerateMarkdown)
	http.Handle("/", http.FileServer(http.Dir("public")))

	port := os.Getenv("PORT")
	if port == "" {
		port = "8080"
	}

	http.ListenAndServe(":"+port, nil)

	//http.ListenAndServe(":8080", http.FileServer(http.Dir(".")))
}

func GenerateMarkdown(rw http.ResponseWriter, r *http.Request) {

	contents, err := ioutil.ReadAll(r.Body)
	if err != nil {
		fmt.Printf("%s", err)
		os.Exit(1)
	}
	fmt.Printf("Recebido %s\n", string(contents))

	markdown := blackfriday.MarkdownCommon([]byte(contents))

	rw.Write(markdown)
}
