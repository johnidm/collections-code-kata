#!/bin/bash

# pega o conteúdo do texto passado como parâmetro
texto=$@

#verifica se teve algum texto passado como parâmetro
if [ "$texto" == "" ]; then
	texto="Hey, digite algo para traduzir."
fi

# A API key pode ser gerada nesse link - https://api.yandex.com/key/form.xml?service=trnsl
API_KEY="trnsl.1.1.20141209T234029Z.5803500de6528911.910b9783819255adca607af43de6e63205762aca"

# Defina a linguagem para tradução - https://api.yandex.com/translate/doc/dg/reference/getLangs.xml
lang="pt-en"

traducao=$(curl -s -A "Tradutor" "https://translate.yandex.net/api/v1.5/tr.json/translate?key=$API_KEY&lang=$lang&text=$texto")

# Parse JSON
code=$(echo $traducao | jshon -e code)

if [ "$code" == 200 ]; then
	# Linguagem para fala
	tl="en-us"

	# Texto para fala
	text=$(echo $traducao | jshon -e text -e 0)		

	echo "Tradução -> $text"

	q=$text
	curl -s -A "Falador" translate\.google\.com/translate_tts -d "tl=$tl&ie=UTF-8&q=$q" | mpg123 -q - ;
else
	message=$(echo $traducao | jshon -e message)
	echo "Falha ao realizar a tradução do texto $message" 
fi


