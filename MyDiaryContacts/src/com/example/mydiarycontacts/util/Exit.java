package com.example.mydiarycontacts.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Exit {

	public static final void execute(final Activity activity, String title,
			String message) {

		AlertDialog.Builder alertDialog = new AlertDialog.Builder(activity);
		alertDialog.setTitle(title);
		alertDialog.setMessage(message);

		DialogInterface.OnClickListener onClick = new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				if (which == DialogInterface.BUTTON_POSITIVE) {
					activity.finish();
					System.exit(0);
				}
			}

		};

		alertDialog.setNegativeButton("Não", null);
		alertDialog.setPositiveButton("Sim", onClick);

		/*
		 * alertDialog.setNegativeButton("Não", null);
		 * alertDialog.setPositiveButton("Sim", new
		 * DialogInterface.OnClickListener() {
		 * 
		 * @Override public void onClick(DialogInterface dialog, int which) {
		 * activity.finish(); System.exit(0); } } );
		 */

		alertDialog.show();
	}

}
