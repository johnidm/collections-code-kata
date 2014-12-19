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
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mydiarycontacts.db.ContatoHelper;
import com.example.mydiarycontacts.model.Contato;

public class ContatoActivity extends Activity implements OnClickListener {

	private EditText edtNome;
	private EditText edtTelefone;
	private EditText edtLatitude;
	private EditText edtLongitude;
	private ImageView imgFoto;
	private Button mapa;
	private Button salvar;
	private Button voltar;

	private Contato contato;

	private ContatoHelper contatoHelper;
	
	private volatile String nomeFoto;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contato);

		edtNome = (EditText) findViewById(R.id.edtNome);
		edtTelefone = (EditText) findViewById(R.id.edtTelefone);
		edtLatitude = (EditText) findViewById(R.id.edtLatitude);
		edtLongitude = (EditText) findViewById(R.id.edtLongitude);
		imgFoto = (ImageView) findViewById(R.id.itemFoto);
		mapa = (Button) findViewById(R.id.btnMapa);
		salvar = (Button) findViewById(R.id.btnSalvar);
		voltar = (Button) findViewById(R.id.btnVoltar);

		mapa.setOnClickListener(this);
		salvar.setOnClickListener(this);
		voltar.setOnClickListener(this);
		imgFoto.setOnClickListener(this);

		edtLatitude.setEnabled(false);
		edtLongitude.setEnabled(false);

		contatoHelper = new ContatoHelper(this);
		
		if (getIntent() != null) {

			if (getIntent().getSerializableExtra("contato") != null) {
				contato = (Contato) getIntent().getSerializableExtra("contato");
				
				edtNome.setText(contato.getNome());
				edtTelefone.setText(contato.getTelefone());	
				
								
			    if ((contato.getFoto() != null) && (!contato.getFoto().trim().equals(""))) {
			    	carregaFoto( contato.getFoto() );
			    }				
						
				
			} else {
				contato = new Contato();
			}
		}

	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.btnMapa:
			
			Intent itMapa = new Intent(this, MapaActivity.class);			
			itMapa.putExtra("contato", contato);
			
			startActivityForResult(itMapa, 1001);
			//startActivity(itMapa);
			
			break;

		case R.id.btnSalvar:
			
			String nome = edtNome.getText().toString();
			String telefone = edtTelefone.getText().toString();
			/// TODO incluir outras opções			
			if (nome != null && !nome.trim().equals("")) {
				
				contato.setNome(nome);
				
				Log.i("IS", contato.getNome());
				
				contato.setTelefone(telefone);
				
				if (contato.getCodigo() == null) {
					Log.i("IN", "Insert");
					contatoHelper.insert(contato);
				} else {
					Log.i("IN", "Update");
					contatoHelper.update(contato);
				}
			
				Toast.makeText(this, "Contato salvo con sucesso",
						Toast.LENGTH_SHORT).show();
				
				finish();
				
			} else {
				// TODO exibir os campos que devem ser obrigatórios
			}				
			
			break;

		case R.id.btnVoltar:
			finish();
			break;

		case R.id.itemFoto:
			capturaFoto();
			break;

		default:
			break;
		}
	}

	private Uri getFotoUri(String nomeArquivo) {

		File imageDir = new File(
				Environment
						.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
						+ File.separator + "agendacontatos");

		if (!imageDir.exists()) {
			imageDir.mkdirs();
		}

		Toast.makeText(this, imageDir.toString(),
				Toast.LENGTH_SHORT).show();
		
		
		return Uri.fromFile(new File(imageDir.getPath() + File.separator
				+ nomeArquivo));

	}

	private void capturaFoto() {
		
		nomeFoto = gerarNomeFoto();
		
		Intent itCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		
		itCamera.putExtra(MediaStore.EXTRA_OUTPUT, getFotoUri(nomeFoto));
		
		itCamera.putExtra("return-data", true);

		startActivityForResult(itCamera, 1000);
	}
	
	
	private void carregaFoto(String path) {
		
		Bitmap bitFoto = BitmapFactory.decodeFile(path);
				
		Bitmap bitScaleFoto = Bitmap.createScaledBitmap(bitFoto, imgFoto.getLayoutParams().width,
				imgFoto.getLayoutParams().height, false);
		
		imgFoto.setImageBitmap(bitScaleFoto);		
		
	}
	

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (resultCode == RESULT_OK) {
		
			switch (requestCode) {
			case 1000:
				String path = getFotoUri(nomeFoto).getPath();
				contato.setFoto(path);
				carregaFoto(path);
				
				break;
			case 1001:
				contato = (Contato) data.getSerializableExtra("contato");
				
				edtLatitude.setText(contato.getLatitude().toString());
				edtLongitude.setText(contato.getLongitude().toString());
				
				break;	
			}
		}
	}
	
	private String gerarNomeFoto() {
		long i = (long) (Math.random() * 1000000) + 1;
		return i + ".jpg";
	}

}
