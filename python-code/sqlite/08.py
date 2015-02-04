import sqlite3

conexão = sqlite3.connect("agenda.db")
cursor = conexão.cursor()

cursor.execute('''
	delete from agenda
	 where nome = 'Maria'
''')

print("Registros alterados ", cursor.rowcount)

if cursor.rowcount == 1:
	conexão.commit();
	print("Alterações concluídas")
else:
	conexão.rollback();
	print("Alterações abortadas")


conexão.commit()

cursor.close()
conexão.close()