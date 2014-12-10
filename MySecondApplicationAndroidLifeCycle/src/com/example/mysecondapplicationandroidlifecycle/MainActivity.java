package com.example.mysecondapplicationandroidlifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	private static final String TAG = "Log";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.i(TAG, "Estou sendo CRIADO!");		
		
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onStart() {
	
		super.onStart();		
		Log.i(TAG, "Estou sendo INICIADO");
	}
	
	@Override
	protected void onRestart() {	
		super.onRestart();
		Log.i(TAG, "Estou sendo REINICIADO");
	}
	
	
	@Override
	protected void onDestroy() {
	
		super.onDestroy();
		
		Log.i(TAG, "Estou sendo DESTRUIDO");		
	}
	
	@Override
	protected void onResume() {	
		super.onResume();
		Log.i(TAG, "Estou sendo REINICIADO depois de uma PARADA");
	}
	
	@Override
	protected void onPause() {	
		super.onPause();
		Log.i(TAG, "Estou sendo PARADO temporiamente");
		
	}
	
	@Override
	protected void onStop() {
	
		super.onStop();	
		
		Log.i(TAG, "Estou sendo PARADO");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
