import sqlite3

conexão = sqlite3.connect("agenda.db")
cursor = conexão.cursor()


dados = [
	("João", "8547-9658"),
	("André", "8624-1269"),
	("Maria", "1244-4741")
]

cursor.executemany('''
	insert into agenda(nome, telefone) 
	values(?, ?)	
''', (dados))

conexão.commit()

cursor.close()
conexão.close()

