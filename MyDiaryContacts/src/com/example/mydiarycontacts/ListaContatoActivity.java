package com.example.mydiarycontacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mydiarycontacts.util.Exit;

public class ListaContatoActivity extends Activity {

	private ListView lstContatos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_contato);
		
			
		if (getIntent() != null) {
			String username = getIntent().getStringExtra("username");
			
			Toast.makeText(this, getString( R.string.msg_wellcome, username), 
					Toast.LENGTH_SHORT).show();
		}
			
		String[] contatos = new String[100];		
		for (int i = 0; i < contatos.length; i++) {
			contatos[i] = "Contato " + i;
		}
				
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, contatos);		
		
		lstContatos = (ListView) findViewById(R.id.lstContacts);
		lstContatos.setAdapter(adapter);
		
		
		
	}	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		
		
		new MenuInflater(this).inflate(R.menu.menu_llistacontatos, menu);
		return super.onCreateOptionsMenu(menu);
		
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {		
		switch (item.getItemId()) {
		
		case R.id.mnConsultarCEP:
			
			break;
		case R.id.mnTradutor:
			
			break;
			
		case R.id.mnNovoContato:
			
			break;
			
		case R.id.mnSair:
			Exit.execute(this, getString(R.string.msg_question), getString(R.string.msg_confirm_exit));
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
}
