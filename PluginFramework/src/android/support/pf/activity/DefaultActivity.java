package android.support.pf.activity;

import android.os.Bundle;
import android.app.Activity;
import android.support.pf.R;
import android.support.pf.R.layout;
import android.view.Menu;

public class DefaultActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_default);
	}
}
