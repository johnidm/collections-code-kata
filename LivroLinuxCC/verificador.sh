#!/bin/bash

echo "Informe o arquivo que deseja buscar"

read ARQUIVO

CONSULTA=$(ls ~ | grep $ARQUIVO)

if [ -z $CONSULTA ]; then
  echo "$ARQUIVO não encontrado!"
else
  echo "Arquivo encontrado"
fi

