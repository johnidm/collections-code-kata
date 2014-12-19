package com.example.mydiarycontacts;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mydiarycontacts.db.UsuarioHelper;
import com.example.mydiarycontacts.recognizer.Recognizer;
import com.example.mydiarycontacts.rest.Resposta;
import com.example.mydiarycontacts.util.CrazyHTTPRequest;
import com.example.mydiarycontacts.util.ExCrazyHTTPRequest;
import com.example.mydiarycontacts.util.Exit;
import com.google.gson.Gson;

public class LoginActivity extends Activity implements OnClickListener, OnFocusChangeListener {

	private EditText activeControl = null;
	
	private EditText edtPassword;
	private EditText edtUserName;
	private Button btnOK;
	private Button btnCancel;	
		
	private void executeRecognizer() {		
		new Recognizer(this).execute();
		
	}
	
	private void defineTextActiveControl(String value)
	{
		if (activeControl != null) {
			activeControl.setText(value);
		}
	
	}
	
	private void mesage(String message) {		
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		Button btnConsultaCEP = (Button) findViewById(R.id.btnConsultaCEP);
		Button btnRecordUsername = (Button) findViewById(R.id.btnRecordUsername);	
		
		edtPassword = (EditText) findViewById(R.id.edtPassword);
		edtUserName = (EditText) findViewById(R.id.edtUserName);
		
		btnOK = (Button) findViewById(R.id.btnOk);
		btnCancel = (Button) findViewById(R.id.btnCancel);
		
		btnOK.setOnClickListener(this);
		btnCancel.setOnClickListener(this);
		
		edtPassword.setOnFocusChangeListener(this);
		edtUserName.setOnFocusChangeListener(this);
		
		
		btnConsultaCEP.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {			
				
				//showMesage(CrazyHTTPRequest.request("http://cep.republicavirtual.com.br/web_cep.php?cep=89900000&formato=json"));
				try {		
					String text = Uri.encode(edtUserName.getText().toString());
					String url = "https://translate.yandex.net/api/v1.5/tr.json/translate?key=trnsl.1.1.20141209T234029Z.5803500de6528911.910b9783819255adca607af43de6e63205762aca&lang=pt-en&text=" + text;
					
					mesage(url);
					
					String data = CrazyHTTPRequest.request(url);
					
										
					Gson g = new Gson();
					Resposta rc = g.fromJson(data, Resposta.class);
									
					
					List<String> texto = rc.getText();
					
					mesage("O texto traduzido é: " + texto.get(0));
					
					
										
					
				} catch (ExCrazyHTTPRequest e) {					
					e.printStackTrace();
				}
										
			}

		});
		
		btnRecordUsername.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {				
				executeRecognizer();				
			}
		});
				
	}
	
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		switch (requestCode) {
			case Recognizer.RETORNO: {
				if (resultCode == RESULT_OK && null != data) {
					defineTextActiveControl("");								
					ArrayList<String> text = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);															
					defineTextActiveControl(text.get(0));
				}
				break;
			}
		}
	}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		
		case R.id.btnOk:
			
			String password = edtPassword.getText().toString();
			String username = edtUserName.getText().toString();
			UsuarioHelper usuarioHelper = new UsuarioHelper(this);
			
			if (usuarioHelper.isLoginValido(username, password)) {							
				show(username);							
			} else {
				fail();								
			}
			
			break;
		case R.id.btnCancel:			
			Exit.execute(this, getString(R.string.msg_question), getString(R.string.msg_confirm_exit));		
		}	
				
	}
	
	private void fail() {
		
		mesage(getString(R.string.msg_fail_login));							
		
		edtPassword.setText("");
		edtUserName.setText("");
	}

	private void show(String username) {
		Intent it = new Intent(LoginActivity.this, 
				ListaContatoActivity.class);
						
		it.putExtra("username", username);		
		
		startActivity(it);				
		finish();
	}

	@Override
	public void onFocusChange(View v, boolean hasFocus) {
		activeControl = null;
		if ( v instanceof EditText ) {
			activeControl = (EditText) v;						
		}
	}
	
	
	public String readJSONFeed(String URL) {
		return "";
    }
	
}
