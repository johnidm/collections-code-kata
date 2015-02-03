#!/bin/bash

# Declraçao de funções
function parse_json()
{	
    echo $1 | sed -e 's/[{}]/''/g' | awk -F=':' -v RS=',' "\$1~/\"$2\"/ {print}" | sed -e "s/\"$2\"://" | tr -d "\n\t" | sed -e 's/\\"/"/g' | sed -e 's/\\\\/\\/g' | sed -e 's/^[ \t]*//g' | sed -e 's/^"//'  -e 's/"$//'	
}

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

traducao=$(curl -A "Tradutor" "https://translate.yandex.net/api/v1.5/tr.json/translate?key=$API_KEY&lang=$lang&text=$texto")

parse_json $traducao code

# Linguagem para fala
tl="pt-BR"

# Texto para fala
q="Oi"

curl -A "Falador" "http://translate.google.com/translate_tts?ie=UTF-8&q=$q&tl=$tl" | mpg123 -;


