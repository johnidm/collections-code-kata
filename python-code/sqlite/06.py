import sqlite3

nome = input("Digite um nome para a pesquisa: ")

conexão = sqlite3.connect("agenda.db")
cursor = conexão.cursor()

cursor.execute('select * from agenda where nome = ?', (nome,))

while True:
	resultado=cursor.fetchone()
	if resultado == None:
		break

	print("Nome: %s\nTelefone: %s" % (resultado))

cursor.close()
conexão.close()