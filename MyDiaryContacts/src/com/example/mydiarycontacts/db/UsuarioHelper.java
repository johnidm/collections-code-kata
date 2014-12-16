package com.example.mydiarycontacts.db;

import java.util.List;

import android.content.Context;
import android.database.Cursor;

public class UsuarioHelper extends GenericTableHelper {

	public UsuarioHelper(Context context) {
		// define o nome do banco de dados
		this.tableName = "usuario";
		// conecta/abre o banco de dados
		// para leitura e escrita
		this.db = DataBaseHelper.getHelper(context).getWritableDatabase();
	}

	@Override
	public Object getById(String idName, int idValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Método para validar login
	 * 
	 * @param login
	 * @param senha
	 * @return boolean
	 */
	public boolean isLoginValido(String login, String senha) {
		boolean isValido = false;
		// definindo objeto cursor para receber o
		// resultado da busca
		Cursor c = this.db.query(this.tableName, null,
				"logusu = ? and pwdusu = ?", new String[] { login, senha },
				null, null, null);
		// verifica se o cursor não é nulo
		if (c != null) {
			// verifica se existem registros no cursor
			if (c.getCount() > 0) {
				isValido = true;
			}
		}

		return isValido;
	}
}