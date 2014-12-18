package com.example.mydiarycontacts.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mydiarycontacts.R;
import com.example.mydiarycontacts.model.Contato;

public class ContatoAdapter extends ArrayAdapter<Contato> {

	public ContatoAdapter(Context context, ArrayList<Contato> contatos) {
		super(context, 0, contatos);	
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {	
		
		Contato contato = getItem(position);
		
		if (convertView == null) {
			convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_contato, null);
		}
		
		TextView txtNome = (TextView) convertView.findViewById(R.id.txtNome);		
		TextView txtTelefone = (TextView) convertView.findViewById(R.id.txtTelefone);
		
		ImageView imgFoto = (ImageView)convertView.findViewById(R.id.itemFoto);
		
		txtNome.setText(contato.getNome());
		txtTelefone.setText(contato.getTelefone());
		
		// usar o carrgar foto
		
		return convertView;				
	}
	
}
