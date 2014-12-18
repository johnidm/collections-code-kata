package  com.example.mydiarycontacts.db;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.example.mydiarycontacts.model.Contato;


/**
 * Classe auxiliar para manipular dados de contato
 * 
 * @author roberson
 */
public class ContatoHelper extends GenericTableHelper {

	public ContatoHelper(Context context) {
		this.db = DataBaseHelper.getHelper(context).getWritableDatabase();
		this.tableName = "contato";
	}

	/**
	 * Método genérico para inserts
	 * 
	 * @param values
	 */
	public void insert(Contato contato) {
		ContentValues values = new ContentValues();
		//values.put("codcon", contato.getCodigo());
		values.put("nomcon", contato.getNome());
		values.put("telcon", contato.getTelefone());
		values.put("lat", contato.getLatitude());
		values.put("lng", contato.getLongitude());
		values.put("foto", contato.getFoto());

		this.insert(values);
	}

	/**
	 * Método genérico para inserts
	 * 
	 * @param values
	 */
	public void update(Contato contato) {
		ContentValues values = new ContentValues();
		
		//values.put("codcon", contato.getCodigo());
		values.put("nomcon", contato.getNome());
		values.put("telcon", contato.getTelefone());
		values.put("lat", contato.getLatitude());
		values.put("lng", contato.getLongitude());
		values.put("foto", contato.getFoto());

		this.update(values, "codcon = ?", new String[] { contato.getCodigo()
				.toString() });
	}

	@Override
	public Contato getById(String idName, int idValue) {
		Contato contato = null;
		Cursor c = this.db.query(this.getTableName(), null, idName + " = ?",
				new String[] { "" + idValue }, null, null, null);
		if (c != null) {
			c.moveToFirst();
			while (!c.isAfterLast()) {
				contato = this.fillContato(c);
				break;
			}
			c.close();
		}

		return contato;
	}

	@Override
	public List<Contato> getAll() {
		List<Contato> contatos = new ArrayList<Contato>();
		Cursor c = this.db.query(this.getTableName(), null, null, null, null,
				null, "nomcon COLLATE LOCALIZED ASC");
		if (c != null) {
			c.moveToFirst();
			while (!c.isAfterLast()) {
				contatos.add(this.fillContato(c));
				c.moveToNext();
			}
			c.close();
		}

		return contatos;
	}

	private Contato fillContato(Cursor c) {
		Contato contato = new Contato();
		
		contato.setCodigo(c.getInt(c.getColumnIndex("codcon")));
		contato.setNome(c.getString(c.getColumnIndex("nomcon")));
		contato.setTelefone(c.getString(c.getColumnIndex("telcon")));
		contato.setLatitude(c.getDouble(c.getColumnIndex("lat")));
		contato.setLongitude(c.getDouble(c.getColumnIndex("lng")));
		
		return contato;
	}

	public void delete(Contato c) {
		
		this.db.delete(this.getTableName(), "codcon = ?", new String[] { c.getCodigo()
			.toString() });		
	}
}
