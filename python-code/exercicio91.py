#coding: utf-8

import sys
import os.path

print("Números de prametros: %d" % len(sys.argv))
for n, p in enumerate(sys.argv):
	print("Parâmetro %d = %s" % (n, p))


if (len(sys.argv) == 4):
	filename = sys.argv[1]
	inicio = int(sys.argv[2])
	fim = int(sys.argv[3])
		
	if (os.path.exists(filename)) and  (os.path.isfile(filename)):	
		arquivo = open(filename, "r")
		for linha in arquivo.readlines()[inicio-1:fim]:
			print(linha[:-1] + "\n")
	else:
		print("Arquivo não encotrado")

else:
	print("Parametros incorretos")




