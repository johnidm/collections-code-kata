package com.example.mydiarycontacts.util;

import android.os.StrictMode;

public class AppliedPolicy {

	// soluciona o problema de erros ao realizar a cosulta  via HTTP
	public static void run() {
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
				.permitAll().build();
		
		StrictMode.setThreadPolicy(policy);
	}

}
