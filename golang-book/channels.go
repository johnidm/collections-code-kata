package main

import (
	"fmt"
	"time"
	)

func pinger(c chan string) {
	for i := 0; ; i++ {
		c <- "ping"		
	}	
}

func ponger(c chan string) {
	for i := 0; ; i++ {
		c <- "pong"		
	}	
}

func printer(c chan string) {
	for {
		msg := <- c
		fmt.Println(msg)
		time.Sleep(time.Second * 1)
	}	
}

func main() {
	
	var c chan string = make(chan string)

	go pinger(c)
	go printer(c)
	go ponger(c)

	var input string
	fmt.Scanln(&input)
	
}

