package com.example.mydiarycontacts;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ContatoActivity extends Activity implements OnClickListener {

	private EditText edtNome;
	private EditText edtTelefone;
	private EditText edtLatitude;
	private EditText edtLongitude;
	private ImageView imgFoto;
	private Button mapa;
	private Button salvar;
	private Button voltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contato);
		
		edtNome = (EditText ) findViewById(R.id.edtNome);
		edtTelefone = (EditText ) findViewById(R.id.edtTelefone);
		edtLatitude = (EditText ) findViewById(R.id.edtLatitude);
		edtLongitude = (EditText )findViewById(R.id.edtLongitude);
		imgFoto = (ImageView ) findViewById(R.id.imageView1);
		mapa = (Button) findViewById(R.id.btnMapa);
		salvar = (Button) findViewById(R.id.btnSalvar);
		voltar = (Button) findViewById(R.id.btnVoltar);
		
		mapa.setOnClickListener(this);
		salvar.setOnClickListener(this);
		voltar.setOnClickListener(this);
		imgFoto.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.btnMapa:
		

			break;
			
		case R.id.btnSalvar:
			
			break;
			
		case R.id.btnVoltar:
			finish();
			break;
			
		case R.id.imageView1:
			capturaFoto();
			break;	

		default:
			break;
		}
	}
	
	
	private Uri getFotoUri(String nomeArquivo) {
		
		File imageDir =
				new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + 
				File.separator + "agendacontatos");
				
		if (!imageDir.exists()) {
			imageDir.mkdirs();
		}
				
		return Uri.fromFile(new File(imageDir.getPath() + File.separator + nomeArquivo));		
		
	}
	
	private void capturaFoto() {
		Intent itCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		itCamera.putExtra(MediaStore.EXTRA_OUTPUT, getFotoUri("foto.jpg"));
		
		startActivityForResult(itCamera, 1000);		
	}
	

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
		if ((requestCode == 1000) && (resultCode == RESULT_OK)) {
			Bitmap bitFoto = BitmapFactory.decodeFile(getFotoUri("foto.jpg").getPath());
			imgFoto.setImageBitmap(bitFoto);
			
		}
			
		
	}
	
	
	
}
