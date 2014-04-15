package com.app.mycuratioui;


import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.EditText;

public class AccountRecovery extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_account_recovery);
		
		EditText UER =(EditText)findViewById(R.id.UserEmailToRecovery);
		UER.addTextChangedListener(uerTextEditorWatcher);
		
		EditText UPR =(EditText)findViewById(R.id.UserPasswordToRecovery);
		UPR.addTextChangedListener(uprTextEditorWatcher);
		
		EditText UCPR =(EditText)findViewById(R.id.UserConfirmPasswordToRecovery);
		UCPR.addTextChangedListener(ucprTextEditorWatcher);
		
	 }

	public final TextWatcher  uerTextEditorWatcher = new TextWatcher() { 
		 public void beforeTextChanged(CharSequence m, int start, int count, int after)
        {
			// When Field Empty
			// image.setImageResource(R.drawable.error);
        }
		 public void onTextChanged(CharSequence m, int start, int before, int count)
        {
			 EditText UER =(EditText)findViewById(R.id.UserEmailToRecovery);
			 UER.setTextColor(Color.parseColor("#26AB69"));
        }
		 public void afterTextChanged(Editable m)
        {
		                  
        }
		 
     };
     
     public final TextWatcher  uprTextEditorWatcher = new TextWatcher() { 
		 public void beforeTextChanged(CharSequence m, int start, int count, int after)
        {
			// When Field Empty
			// image.setImageResource(R.drawable.error);
        }
		 public void onTextChanged(CharSequence m, int start, int before, int count)
        {
			 EditText UPR =(EditText)findViewById(R.id.UserPasswordToRecovery);
			 UPR.setTextColor(Color.parseColor("#26AB69"));
        }
		 public void afterTextChanged(Editable m)
        {
		                  
        }
		 
     };
     
     public final TextWatcher  ucprTextEditorWatcher = new TextWatcher() { 
		 public void beforeTextChanged(CharSequence m, int start, int count, int after)
        {
			// When Field Empty
			// image.setImageResource(R.drawable.error);
        }
		 public void onTextChanged(CharSequence m, int start, int before, int count)
        {
			 EditText UCPR =(EditText)findViewById(R.id.UserConfirmPasswordToRecovery);
			 UCPR.setTextColor(Color.parseColor("#26AB69"));
        }
		 public void afterTextChanged(Editable m)
        {
		                  
        }
		 
     };
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.account_recovery, menu);
		return true;
	}

}
