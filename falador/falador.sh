#!/bin/bash

# post - http://elcio.com.br/faca-o-google-falar-por-voce/
# executar o seguinte comando: sudo apt-get install curl mpg123
# de permissão ao arquivo chmod +x falador

# exemplos de uso
# ./falador.sh "Onde está o futuro que nos prometeram?"
# ./falador.sh -l en "Luke, I am your father."

language=pt-BR
if [ "$1" == "-l" ];then
  shift
  language=$1
  shift
fi

curl -A "Falador" translate\.google\.com/translate_tts -d "tl=$language&ie=UTF-8&q=$@" |mpg123 -;