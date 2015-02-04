import sqlite3

conexão = sqlite3.connect("agenda.db")

conexão.row_factory = sqlite3.Row

cursor = conexão.cursor()

print("%3s %-20s %12s" % ("Id", "Nome", "Poulação"))
print("="*37)

for estado in conexão.execute("select * from estados order by nome desc"):
	print("%3s %-20s %12s" % 
		(	estado["id"],
			estado["nome"],
			estado["populacao"]))

cursor.close()
conexão.close()




	
