package com.example.lists;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SQLiteDataBase extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sqlitedatabase);
		
		SQLiteDatabase db = openOrCreateDatabase("NewDB", MODE_PRIVATE, null);	
		db.execSQL("CREATE TABLE IF NOT EXISTS NewTable (Name VARCHAR, Number Int);");
		db.execSQL("INSERT INTO NewTable VALUES ('Ivan', 40);");
		
		final Cursor cursor = db.rawQuery("SELECT * FROM NewTable", null);
		cursor.moveToFirst();		
				
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				TextView text = (TextView) findViewById(R.id.textView1);
				text.setText(cursor.getString(cursor.getColumnIndex("Name")));
			}
		});
		
		db.close();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
