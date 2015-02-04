import sqlite3

conexão = sqlite3.connect("agenda.db")

conexão.row_factory = sqlite3.Row

cursor = conexão.cursor()

for registro in cursor.execute("select * from agenda"):
	print("Nome: %s\nTelefone: %s" % (registro["nome"], registro["telefone"]))

cursor.close()
conexão.close()

