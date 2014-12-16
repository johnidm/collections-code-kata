package com.example.mydiarycontacts.db;


import com.example.mydiarycontacts.R;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class DataBaseHelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "agendacontatos.db";
	private static final int DATABASE_VERSION = 1;

	private static DataBaseHelper instance;
	private Context context;

	public static synchronized DataBaseHelper getHelper(Context context) {
		if (instance == null)
			instance = new DataBaseHelper(context);

		return instance;
	}

	/**
	 * Helper para auxiliar na manipulaÃ§Ã£o da base de dados
	 * 
	 * @author roberson
	 */
	private DataBaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		this.context = context;
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// lendo arquivo de script para criação da base de dados
		String scriptCreate = context.getString(R.string.create_sql);
		String[] instrucoes = scriptCreate.split(";");
		for (int i = 0; i < instrucoes.length; i++) {
			if (instrucoes[i] != null && !instrucoes[i].trim().equals("")) {
				db.execSQL(instrucoes[i]);
			}
		}

		db.execSQL("insert into usuario(logusu,pwdusu) values('agenda', 'agenda')");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// apagando todas as tabelas
			
		this.onCreate(db);
	}
}