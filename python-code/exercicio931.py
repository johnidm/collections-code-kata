numeros = []

def file_pares():
	return open("pares.txt")	

def file_impares():
	return open("impares.txt")

def insert_na_lista(arquivo):
	for linha in arquivo.readlines():		
		numero = int(linha.strip())			
		numeros.append(numero)

def post_paresimpares(numeros):
	arquivo = open("paresimpares.txt", "w")
	for linha in numeros:
		arquivo.write("%d\n" % linha)
		#print(linha)
	arquivo.close()


insert_na_lista(file_impares())
insert_na_lista(file_pares())

post_paresimpares(sorted(numeros))


