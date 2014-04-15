package com.app.mycuratioui;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}
	
	public void gotosignin(View v)
    {
    	Intent intent = new Intent(this,SignupActivity .class);
		startActivity(intent);	
		
    }
	
	public void gotosignup(View v)
    {
    	Intent intent = new Intent(this,UserDetailsActivity .class);
		startActivity(intent);	
		
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
