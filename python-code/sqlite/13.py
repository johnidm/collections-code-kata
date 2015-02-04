import sqlite3

feriados = [
	["2014-01-01", "Confraternização Universal"],
	["2014-04-21", "Tirandentes"],
	["2014-05-01", "Dia do Trabalhados"],
	["2014-09-07", "Indepêndencia"] ]

	
with sqlite3.connect("agenda.db") as conexão:
	conexão.execute("create table feriados(id integer primary key autoincrement, data date, descricao text)")

	conexão.executemany("insert into feriados(data, descricao) values (?, ?)", feriados)


	
