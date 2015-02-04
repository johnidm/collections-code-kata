import sqlite3

from contextlib import closing

with sqlite3.connect("agenda.db") as conexão:
	with closing(conexão.cursor()) as cursor:
		cursor.execute("select * from agenda")
		while True:
			resultado = cursor.fetchone()
			if (resultado == None):
				break

			print("Nome: %s\nTelefone: %s" % (resultado))
