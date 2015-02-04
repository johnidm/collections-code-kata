import sqlite3

dados = [
	["SP", "SE", "São Paulo"],
	["SP", "SE", "Minas Gerais"],
	["SP", "SL", "Paraná"],
	["SP", "SL", "Rio Grande do Sul"],
	["SP", "SL", "Rio de Janeiro"] ]

	
with sqlite3.connect("agenda.db") as conexão:
	conexão.executemany("""
		update estados set sigla = ?, regiao = ? where nome = ?	""", dados)


	
