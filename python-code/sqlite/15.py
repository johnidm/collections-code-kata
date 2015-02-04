import sqlite3
import datetime

hoje = datetime.date.today()

hoje60dias = hoje + datetime.timedelta(days=120)

with sqlite3.connect("agenda.db", detect_types=sqlite3.PARSE_DECLTYPES) as conexão:

	conexão.row_factory = sqlite3.Row

	for registro in conexão.execute("select * from feriados where data >= ? and data <= ?", (hoje, hoje60dias)):
		print("{0} {1}".format(registro["data"].strftime("%d/%m"), registro["descricao"]))

