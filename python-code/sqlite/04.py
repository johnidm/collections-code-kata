import sqlite3

conexão = sqlite3.connect("agenda.db")
cursor = conexão.cursor()

cursor.execute("select * from agenda")

resultado = cursor.fetchall();

for registro in resultado:
	print("Nome: %s\nTelefone: %s" % (registro))

cursor.close()
conexão.close()

