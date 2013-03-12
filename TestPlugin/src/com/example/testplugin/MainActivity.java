package com.example.testplugin;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "Toast from Plugin, \n" + R.class.getName(), Toast.LENGTH_LONG).show();
		TextView text = (TextView) findViewById(R.id.main_r_file_name);
		String name = getApplicationContext().getClass().getName();
		text.setText("getApplicationContext() \n" + name);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
