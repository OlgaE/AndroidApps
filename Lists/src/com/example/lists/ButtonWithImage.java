package com.example.lists;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ButtonWithImage extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imagebutton);
		
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(this);
		
		ImageButton ibutton = (ImageButton) findViewById(R.id.imageButton1);
		ibutton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		TextView text = (TextView) findViewById(R.id.textView1);
		if(v.getId() == R.id.button1){
			text.setText("Simple button pressed.");
		}
		else if(v.getId() == R.id.imageButton1){
			text.setText("Image button pressed.");
		}	
	}
}
