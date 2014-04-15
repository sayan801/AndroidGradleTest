package com.app.mycuratioui;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class UserDetailsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_details);
		
		EditText UFNS =(EditText)findViewById(R.id.UserFirstNameToSignUp);
		UFNS.addTextChangedListener(ufnsTextEditorWatcher);
		
		EditText ULNS =(EditText)findViewById(R.id.UserLastNameToSignUp);
		ULNS.addTextChangedListener(ulnsTextEditorWatcher);
		
		EditText UZCS =(EditText)findViewById(R.id.UserZipCodeToSignUp);
		UZCS.addTextChangedListener(uzcsTextEditorWatcher);
		
		EditText UPNS =(EditText)findViewById(R.id.UserPhoneNoToSignUp);
		UPNS.addTextChangedListener(upnsTextEditorWatcher);
		
	}
	
	
			public final TextWatcher  ufnsTextEditorWatcher = new TextWatcher() { 
				 public void beforeTextChanged(CharSequence m, int start, int count, int after)
		       {
					// When Field Empty
					// image.setImageResource(R.drawable.error);
		       }
				 public void onTextChanged(CharSequence m, int start, int before, int count)
		       {
					 EditText UFNS =(EditText)findViewById(R.id.UserFirstNameToSignUp);
					 UFNS.setTextColor(Color.parseColor("#26AB69"));
		       }
				 public void afterTextChanged(Editable m)
		       {
				                  
		       }
				 
		    };
		    
		    public final TextWatcher  ulnsTextEditorWatcher = new TextWatcher() { 
				 public void beforeTextChanged(CharSequence m, int start, int count, int after)
		      {
					// When Field Empty
					// image.setImageResource(R.drawable.error);
		      }
				 public void onTextChanged(CharSequence m, int start, int before, int count)
		      {
					 EditText ULNS =(EditText)findViewById(R.id.UserLastNameToSignUp);
					 ULNS.setTextColor(Color.parseColor("#26AB69"));
		      }
				 public void afterTextChanged(Editable m)
		      {
				                  
		      }
				 
		   };
		   
		   public final TextWatcher  uzcsTextEditorWatcher = new TextWatcher() { 
				 public void beforeTextChanged(CharSequence m, int start, int count, int after)
		    {
					// When Field Empty
					// image.setImageResource(R.drawable.error);
		    }
				 public void onTextChanged(CharSequence m, int start, int before, int count)
		    {
					 EditText UZCS =(EditText)findViewById(R.id.UserZipCodeToSignUp);
					 UZCS.setTextColor(Color.parseColor("#26AB69"));
		    }
				 public void afterTextChanged(Editable m)
		    {
				                  
		    }
				 
		 };
		 
		 public final TextWatcher  upnsTextEditorWatcher = new TextWatcher() { 
			 public void beforeTextChanged(CharSequence m, int start, int count, int after)
		  {
				// When Field Empty
				// image.setImageResource(R.drawable.error);
		  }
			 public void onTextChanged(CharSequence m, int start, int before, int count)
		  {
				 EditText UPNS =(EditText)findViewById(R.id.UserPhoneNoToSignUp);
				 UPNS.setTextColor(Color.parseColor("#26AB69"));
		  }
			 public void afterTextChanged(Editable m)
		  {
			                  
		  }
			 
		};
			
	public void gotodob(View v)
    {
    	Intent intent = new Intent(this,UserDob .class);
		startActivity(intent);	
		
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.user_details, menu);
		return true;
	}

}
