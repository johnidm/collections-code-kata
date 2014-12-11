package com.example.mydiarycontacts;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity implements OnClickListener, OnFocusChangeListener {

	private EditText activeControl = null;
	
	private EditText edtPassword;
	private EditText edtUserName;
	private Button btnOK;
	private Button btnCancel;	
	
	protected static final int RETORNO = 1;
	
    private void showDialog(String title, String message) {
    	
    	AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
		alertDialog.setTitle(title);
		alertDialog.setMessage(message);
			
		/*
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				
			}
		});
		*/
		alertDialog.setNegativeButton("Não", null);
		alertDialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				finish();
				System.exit(0);
				
			}
		} );
		
		alertDialog.show();
    	
    }
	
	private void executeRecognizer() {
		Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
		intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "pt-BR");
		try {
			startActivityForResult(intent, RETORNO);
		} catch (ActivityNotFoundException a) {
			showMesage("Opss! Não foi possível reconhecer sua voz.");					
		}
		
	}
	
	private void defineTextActiveControl(String value)
	{
		if (activeControl != null) {
			activeControl.setText(value);
		}
	
	}
	
	private void showMesage(String message) {		
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		StrictMode.ThreadPolicy policy = new StrictMode.
		ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 

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
				/*
				try {

					HttpClient cep = new DefaultHttpClient();

					String url = "http://cep.republicavirtual.com.br/web_cep.php?cep=89900000&formato=xml";

					HttpResponse response;

					response = cep.execute(new HttpGet(url));

					Log.i("Retorno", response.getStatusLine().toString());
				} catch (ClientProtocolException e) {

					showMesage(e.getMessage());
				} catch (IOException e) {
					showMesage(e.getMessage());
				}*/
				//readJSONFeed("http://cep.republicavirtual.com.br/web_cep.php?cep=89900000&formato=json");
				readJSONFeed("https://translate.yandex.net/api/v1.5/tr.json/translate?key=trnsl.1.1.20141209T234029Z.5803500de6528911.910b9783819255adca607af43de6e63205762aca&lang=pt-en&text=" + edtUserName.getText());
				
				
/*
				HttpClient client = new DefaultHttpClient();
				HttpGet request = new HttpGet("http://www.vogella.com");
				try {
					HttpResponse response = client.execute(request);
					
					showMesage("OK");
					
				} catch (ClientProtocolException e) {
					showMesage(e.getMessage());
					
				} catch (IOException e) {
					
					showMesage(e.getMessage());
				}
	*/			
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
			case RETORNO: {
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
						
			if (password.equals("agenda") && username.equals("agenda")) {
				showMesage("OK - Você logou");
				
				// cria uma mesagem para o Android
				Intent it = new Intent(LoginActivity.this, 
						ListaContatoActivity.class);
				
				
				it.putExtra("Login", "agenda");
				//LoginActivity.this.startActivity(it);
				
				LoginActivity.this.finish();
				
			} else {				
				showMesage(getString(R.string.msg_fail_login));							
				
				edtPassword.setText("");
				edtUserName.setText("");				
			}
			
			break;
		case R.id.btnCancel:
			
			showDialog(getString(R.string.msg_question), getString(R.string.msg_confirm_exit));
		default:
			break;
		}	
				
	}

	@Override
	public void onFocusChange(View v, boolean hasFocus) {
		activeControl = null;
		if ( v instanceof EditText ) {
			activeControl = (EditText) v;						
		}
	}
	
	
	public String readJSONFeed(String URL) {
		Log.d("JSON", "Entrada na funcao");
        StringBuilder stringBuilder = new StringBuilder();
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(URL);
        try {
            HttpResponse response = httpClient.execute(httpGet);
            StatusLine statusLine = response.getStatusLine();
            int statusCode = statusLine.getStatusCode();
            if (statusCode == HttpStatus.SC_OK) { 
                HttpEntity entity = response.getEntity();
                InputStream inputStream = entity.getContent();
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null) {
                    showMesage(line);
                }
                inputStream.close();
            	Log.d("JSON", "OK");
            } else {
                Log.d("JSON", "Failed to download file");
            }
            
        } catch (Exception e) {
            Log.d("JSON", e.getMessage());
        }        
        return stringBuilder.toString();
    }
 
	
}
