// GSON
// HttpClient



package com.example.mydiarycontacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
				
		callWaitApp();	
		
	}

	private void callWaitApp() {
		Handler h = new Handler();
				
		// aguarda a tela de login
		h.postDelayed(new Runnable() {			
			@Override
			public void run() {
				// cria uma mesagem para o Android
				Intent itLogin = new Intent(SplashActivity.this, 
						LoginActivity.class);
				
				// chama tela de login
				startActivity(itLogin);
				
				//finalia a tela de splash
				finish();
			}
		}, 4000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {	
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
		
		
		
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
