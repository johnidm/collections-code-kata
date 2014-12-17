package com.example.mydiarycontacts;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mydiarycontacts.db.ContatoHelper;
import com.example.mydiarycontacts.model.Contato;
import com.example.mydiarycontacts.util.Exit;

public class ListaContatoActivity extends Activity {

	private ListView lstContatos;
	
	private ContatoHelper contatoHelper;
	ArrayAdapter<Contato> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_contato);

		if (getIntent() != null) {
			String username = getIntent().getStringExtra("username");

			Toast.makeText(this, getString(R.string.msg_wellcome, username),
					Toast.LENGTH_SHORT).show();
		}
		
		contatoHelper = new ContatoHelper(this);
							
		adapter = new ArrayAdapter<Contato>(this,
				android.R.layout.simple_list_item_1, new ArrayList<Contato>());
		lstContatos = (ListView) findViewById(R.id.lstContacts);
		
		
		registerForContextMenu(lstContatos);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		
		atualizaListaContatos();

		
	}

	private void atualizaListaContatos() {
		adapter = new ArrayAdapter<Contato>(this,
				android.R.layout.simple_list_item_1, contatoHelper.getAll());
		
		lstContatos.setAdapter(adapter);
		adapter.setNotifyOnChange(true);
		
		adapter.notifyDataSetChanged();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		new MenuInflater(this).inflate(R.menu.menu_llistacontatos, menu);
		return super.onCreateOptionsMenu(menu);

	}
	
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		new MenuInflater(this).inflate(R.menu.menu_lstcontato, menu);
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()) {

		case R.id.mnConsultarCEP:

			break;
		case R.id.mnTradutor:

			break;

		case R.id.mnNovoContato:

			Intent it = new Intent(this, ContatoActivity.class);
			startActivity(it);

			break;

		case R.id.mnSair:
			Exit.execute(this, getString(R.string.msg_question),
					getString(R.string.msg_confirm_exit));
			break;

		case R.id.mnSobre:

			break;

		}
		return super.onMenuItemSelected(featureId, item);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public boolean onContextItemSelected(MenuItem item) {

		AdapterContextMenuInfo info = (AdapterContextMenuInfo) item.getMenuInfo();
		
		Contato contato = adapter.getItem(info.position);
		
		

		switch (item.getItemId()) {

		case R.id.mnuEditar:
			
			Intent it = new Intent(this, ContatoActivity.class);
			it.putExtra("contato", contato);
			startActivity(it);
			

			break;

		case R.id.mnuRemover:

			
			contatoHelper.delete(contato);
			atualizaListaContatos();
			
			break;

		case R.id.mnuChamar:

			Toast.makeText(this,
					"Chamar" + lstContatos.getAdapter().getItem(info.position),
					Toast.LENGTH_SHORT).show();

			String tel = "tel:" + contato.getTelefone();

			Uri uri = Uri.parse(tel);

			Intent i = new Intent(Intent.ACTION_VIEW, uri);

			startActivity(i);

			break;

		case R.id.mnuSms:

			Toast.makeText(this,
					"Sms" + lstContatos.getAdapter().getItem(info.position),
					Toast.LENGTH_SHORT).show();

			break;

		default:

			break;

		}

		return super.onContextItemSelected(item);

	}
	
	
}
