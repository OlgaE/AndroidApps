package com.example.lists;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AlertDialogs extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alertdialogs);
		
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		Button button3 = (Button) findViewById(R.id.button3);
		Button button4 = (Button) findViewById(R.id.button4);
		
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder alert1 = new AlertDialog.Builder(AlertDialogs.this);
				alert1.setMessage("Do you really want to close this application?");
				alert1.setCancelable(false);
				alert1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						AlertDialogs.this.finish();						
					}
				});
				alert1.setNegativeButton("No", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						dialog.cancel();
					}
				});
				AlertDialog alertcreate = alert1.create();
				alertcreate.show();
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ProgressDialog progr1 = new ProgressDialog(AlertDialogs.this);
				progr1.setProgressStyle(ProgressDialog.STYLE_SPINNER);
				progr1.setMessage("wait please..");
				progr1.setIndeterminate(true);
				progr1.setCancelable(true);
				progr1.show();
			}
		});
		
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ProgressDialog progr1 = new ProgressDialog(AlertDialogs.this);
				progr1.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
				progr1.setMessage("wait please..");
				progr1.setIndeterminate(false);
				progr1.setCancelable(true);

				progr1.show();
				progr1.setProgress(50);
			}
		});
		
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Dialog dialog = new Dialog(AlertDialogs.this);
				dialog.setContentView(R.layout.customdialog);
				dialog.setTitle("This is owr dialog.");
				dialog.show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
