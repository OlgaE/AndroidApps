package com.example.lists;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StatusMessages extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.statusmessages);
		
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				NotificationManager man = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
				Notification notification = new Notification(android.R.drawable.stat_notify_more, "Our new notification", System.currentTimeMillis());
				
				Context context = StatusMessages.this;
				CharSequence title = "Title";
				CharSequence details = "details go here";
				
				Intent intent = new Intent(context,StatusMessages.class);
				PendingIntent pend = PendingIntent.getActivity(context, 0, intent, 0);
				notification.setLatestEventInfo(context, title, details, pend);
				
				notification.sound = Uri.parse("android.resourse://com.example.lists" + R.raw.windowsding);				
				man.notify(0,notification);
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
