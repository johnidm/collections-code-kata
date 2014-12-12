package com.example.mydiarycontacts.recognizer;

import java.lang.reflect.Constructor;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;

public class Recognizer {

	public static final int RETORNO = 1;
	
	private Activity activity;
	
	public Recognizer(Activity activity) {
		this.activity = activity;
				
	}
	
	public void execute() {
		
		Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
		intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "pt-BR");
		try {
			activity.startActivityForResult(intent, RETORNO);
		} catch (ActivityNotFoundException a) {
			throw new ActivityNotFoundException("Opss! NÃo foi possével reconhecer sua voz");				
		}
		
	}
	
	

}
