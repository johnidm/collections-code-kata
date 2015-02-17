package main

import (
	"fmt"
	"encoding/json"
	"time"

)

type Url struct {
	Id      string    `json:"_id_"`
	Criacao time.Time `json:"criacao"`
	Destino string    `json:"destino"`
}

func main() {
	
	url := Url{"er545", time.Now(), "http://johnidouglas.com.br"}

	json, err := json.Marshal(url)	

	if err == nil {
		fmt.Println(string(json))
	}

}
