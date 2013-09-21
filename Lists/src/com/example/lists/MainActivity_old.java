package com.example.lists;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_old extends ListActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_simple);
		
		setListAdapter(new MyAdapter(this, android.R.layout.simple_list_item_1, R.id.textView1, getResources().getStringArray(R.array.wallpapers)));
	}

	private class MyAdapter extends ArrayAdapter<String>{

		public MyAdapter(Context context, int resource, int textViewResourceId,
				String[] strings) {
			super(context, resource, textViewResourceId, strings);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			LayoutInflater inflator = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View row = inflator.inflate(R.layout.list_images, parent, false);
			
			String[] items = getResources().getStringArray(R.array.wallpapers);
			
			ImageView image1 = (ImageView) row.findViewById(R.id.imageView1);
			TextView text1 = (TextView) row.findViewById(R.id.textView1);
			
			text1.setText(items[position]);
			
			if (items[position].equals("tulips")){
				image1.setImageResource(R.drawable.tulips);
			}
			else if (items[position].equals("rose")){
				image1.setImageResource(R.drawable.rose);
			}
			else if (items[position].equals("heart")){
				image1.setImageResource(R.drawable.tulips);
			}
			
			return row;
			
			
			// TODO Auto-generated method stub
			//return super.getView(position, convertView, parent);
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


}
