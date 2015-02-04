import sqlite3

conexão = sqlite3.connect("agenda.db")

conexão.row_factory = sqlite3.Row

cursor = conexão.cursor()

dados = [
	["São Paulo", 43565555],
	["Minas Gerais", 154266],
	["Paraná", 2547888],
	["Rio Grande do Sul", 632555],
	["Rio de Janeiro", 47188]
]


#cursor.execute('''
#		create table estados (
#			id integer primary key autoincrement,
#			nome text,
#			populacao integer )
#	''')

cursor.executemany("insert into estados(nome, populacao) values(?,?)", dados)
conexão.commit()
cursor.close()
conexão.close()




	
