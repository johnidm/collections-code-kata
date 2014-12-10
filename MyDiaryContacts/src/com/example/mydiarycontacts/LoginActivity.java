package com.example.mydiarycontacts;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends Activity {

	private void showMesage(String message) {

		Context context = getApplicationContext();
		CharSequence text = message;
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		Button btnConsultaCEP = (Button) findViewById(R.id.btnConsultaCEP);
		btnConsultaCEP.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
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
				}

			}

		});
	}
}
