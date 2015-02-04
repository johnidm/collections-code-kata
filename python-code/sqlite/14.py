import sqlite3
	
with sqlite3.connect("agenda.db", detect_types=sqlite3.PARSE_DECLTYPES) as conexão:

	conexão.row_factory = sqlite3.Row

	for registro in conexão.execute("select * from feriados"):
		print("{0} {1}".format(registro["data"].strftime("%d/%m"), registro["descricao"]))


	
