package com.example.lists;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//
		// ******** Connecting with button1:
		//
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, ListSimple.class);
				startActivity(intent);
				
			}
		});
		// *********************************
		
		//
		// ******** Connecting with button2:
		//
		Button button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, ListImages.class);
				startActivity(intent);
				
			}
		});
		// *********************************
		
		//
		// ******** Connecting with button3:
		//
		Button button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, SendingData.class);
				startActivity(intent);				
			}
		});
		// *********************************
		
		//
		// ******** Connecting with button4:
		//
		Button button4 = (Button) findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, SimpleGraphics.class);
				startActivity(intent);				
			}
		});
		// *********************************
		
		//
		// ******** Connecting with button4:
		//
		Button button5 = (Button) findViewById(R.id.button5);
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, ButtonWithImage.class);
				startActivity(intent);				
			}
		});
		// *********************************
		
		//
		// ******** Connecting with button4:
		//
		Button button6 = (Button) findViewById(R.id.button6);
		button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, AlertDialogs.class);
				startActivity(intent);				
			}
		});
		// *********************************
		
		//
		// ******** Connecting with button4:
		//
		Button button7 = (Button) findViewById(R.id.button7);
		button7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, TweenAnimation.class);
				startActivity(intent);				
			}
		});
		// *********************************
		
		//
		// ******** Connecting with button4:
		//
		Button button8 = (Button) findViewById(R.id.button8);
		button8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, StatusMessages.class);
				startActivity(intent);				
			}
		});
		// *********************************
		
		//
		// ******** Connecting with button4:
		//
		Button button9 = (Button) findViewById(R.id.button9);
		button9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, SoundButton.class);
				startActivity(intent);				
			}
		});
		// *********************************
		
		//
		// ******** Connecting with button4:
		//
		Button button10 = (Button) findViewById(R.id.button10);
		button10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, SQLiteDataBase.class);
				startActivity(intent);				
			}
		});
		// *********************************
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
