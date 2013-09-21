package com.example.lists;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class TweenAnimation extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tweenanimation1);
		
		final Button button1 = (Button) findViewById(R.id.button1);
		final Button button2 = (Button) findViewById(R.id.button2);
		
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation animation = AnimationUtils.loadAnimation(TweenAnimation.this, R.anim.tweenanimation);
				button1.startAnimation(animation);
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation animation = AnimationUtils.loadAnimation(TweenAnimation.this, R.anim.tweenanimation2);
				button2.startAnimation(animation);
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
