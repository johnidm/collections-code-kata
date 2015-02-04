pares = open("pares.txt")
multiplos_de_4 = open("multiplos de 4.txt", "w")

print("Iniciando")

for l in pares.readlines():
	print("Read line " + l)
	if int(l) % 4 == 0:
		multiplos_de_4.write(l)

pares.close();
multiplos_de_4.close();