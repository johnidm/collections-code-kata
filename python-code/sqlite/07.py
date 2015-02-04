import sqlite3

conexão = sqlite3.connect("agenda.db")
cursor = conexão.cursor()

cursor.execute('''
	update agenda 
	set telefone = '5214-8957'
	where nome = 'Johni'
''')

print("Registros alterados ", cursor.rowcount)

conexão.commit()

cursor.close()
conexão.close()