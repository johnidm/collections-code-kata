arquivo = open("numeros.txt", "r")

for linha in arquivo.readlines():
	print(linha)

arquivo.close()


