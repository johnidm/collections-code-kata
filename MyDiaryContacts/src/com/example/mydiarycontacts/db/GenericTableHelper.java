package com.example.mydiarycontacts.db;

import java.util.List;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Classe que representa um helper generico
 * 
 * @author robersonjfa
 * 
 */
public abstract class GenericTableHelper {
	protected SQLiteDatabase db;
	protected String tableName = "table_name";

	/**
	 * Metodo generico para inserts
	 * 
	 * @param values
	 */
	public void insert(ContentValues values) {
		this.db.insert(this.getTableName(), null, values);
	}

	/**
	 * MÃ©todo genÃ©rico para os updates
	 * 
	 * @param values
	 * @param whereClause
	 * @param whereArgs
	 */
	public void update(ContentValues values, String whereClause,
			String[] whereArgs) {
		this.db.update(this.getTableName(), values, whereClause, whereArgs);
	}

	/**
	 * Metodo para excluir todos os registros
	 */
	public void deleteAll() {
		this.db.delete(this.getTableName(), null, null);
	}

	/**
	 * Retorna uma linha baseado no id/codigo
	 * 
	 * @param idName
	 * @param idValue
	 * @return
	 */
	public abstract Object getById(String idName, int idValue);

	/**
	 * Retorna uma lista de registros
	 * 
	 * @return List
	 */
	public abstract List<?> getAll();

	/**
	 * Retorna o nome da tabela
	 * 
	 * @return
	 */
	protected String getTableName() {
		return this.tableName;
	}

	/**
	 * Metodo para fechamento da conexao, caso esteja aberta
	 */
	public void close() {
		if (this.db != null && this.db.isOpen()) {
			this.db.close();
		}
	}

	/**
	 * Método para iniciar uma transação.
	 */
	public void beginTransaction() {
		if (this.db != null && this.db.isOpen()) {
			this.db.beginTransaction();
		}
	}

	/**
	 * Metodo para confirmar a transacao.
	 */
	public void setTransactionSuccessful() {
		if (this.db != null && this.db.isOpen()) {
			this.db.setTransactionSuccessful();
		}
	}

	/**
	 * Metodo para finalizar uma transacao.
	 */
	public void endTransaction() {
		if (this.db != null && this.db.isOpen()) {
			this.db.endTransaction();
		}
	}
}