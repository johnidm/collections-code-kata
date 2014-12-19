package com.example.mydiarycontacts;

import java.io.File;
import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mydiarycontacts.adapter.ContatoAdapter;
import com.example.mydiarycontacts.db.ContatoHelper;
import com.example.mydiarycontacts.model.Contato;
import com.example.mydiarycontacts.util.Exit;

public class ListaContatoActivity extends Activity {

	private ListView lstContatos;
	
	private ContatoHelper contatoHelper;
	
	private ContatoAdapter adapter;

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
							
		lstContatos = (ListView) findViewById(R.id.lstContacts);
		
		registerForContextMenu(lstContatos);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		
		atualizaListaContatos();

		
	}

	private void atualizaListaContatos() {
		adapter = new ContatoAdapter(this, contatoHelper.getAll());
		
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
			if (!contato.getFoto().trim().equals("")) {
				File f = new File(contato.getFoto());
				if (f.exists())
					f.delete();				
			}
						
			contatoHelper.delete(contato);			
			
			atualizaListaContatos();
			
			break;

		case R.id.mnuChamar:
			
			
			String tel = "tel:" + contato.getTelefone();

			Uri uri = Uri.parse(tel);

			Intent i = new Intent(Intent.ACTION_VIEW, uri);

			startActivity(i);

			break;

		case R.id.mnuSms:

			final Intent itSMS = new Intent(Intent.ACTION_VIEW);
			
			itSMS.setData(Uri.parse("smsto:"));
			itSMS.setType("vnd.android-dir/mms-sms");
			itSMS.putExtra("address", contato.getTelefone());
			
			final EditText edtMensagem = new EditText(this);
			AlertDialog.Builder mensagem = new AlertDialog.Builder(this);
			
			mensagem.setTitle("SMS");
			mensagem.setMessage("Digite a mensagem");
			mensagem.setView(edtMensagem);
			mensagem.setCancelable(false);
			mensagem.setPositiveButton("OK", new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					
					itSMS.putExtra("msg_boby", edtMensagem.getText().toString());
					
					startActivity(itSMS);
					
				}
			});
			mensagem.show();
			
			break;

		default:

			break;

		}

		return super.onContextItemSelected(item);

	}
	
	
}
