package main

import (
	"html/template"
	//	"encoding/json"
	"net/http"
)

type Book struct {
	Title  string `json:title`
	Author string `json:author`
}

func main() {
	http.HandleFunc("/", ShowBook)
	http.HandleFunc("/html", ShowBookHTML)

	http.ListenAndServe(":8080", nil)
}

func ShowBook(w http.ResponseWriter, r *http.Request) {
	book := Book{"Programe em Go", "Johni"}

	js, err := json.Marshal(book)
	if err != err {
		http.Error(w, err.Error(), http.StatusInternalServerError)
		return
	}

	w.Header().Set("Content-Type", "application/json")
	w.Write(js)

}

func ShowBookHTML(w http.ResponseWriter, r *http.Request) {

	book := Book{"Programe em Go", "Johni"}

	//fp := path.join("templates", "index.html")

	teml, err := template.ParseFiles("templates/index.html")
	if err != err {
		http.Error(w, err.Error(), http.StatusInternalServerError)
		return
	}

	if err := teml.Execute(w, book); err != nil {
		http.Error(w, err.Error(), http.StatusInternalServerError)
	}
}
