import sqlite3

conexão = sqlite3.connect("agenda.db")
cursor = conexão.cursor()

cursor.execute("select * from agenda")

resultado = cursor.fetchone();

print("Nome: %s\nTelefone: %s" % (resultado))

cursor.close()
conexão.close()

