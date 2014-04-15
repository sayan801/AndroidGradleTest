package com.app.mycuratioui;


import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;


public class SignupActivity extends Activity implements OnClickListener {
	
	public Dialog dialog;
	public Button BtnTryagain, BtnForgotinfo;
	
	public Dialog email_dialog;
	public Button ButtonSendEmail;
	
	public Dialog account_dialog ;
	public Button ButtonCreateAccount,ButtonCancel ;
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		
		
		
		EditText UEL =(EditText) findViewById(R.id.UserEmailToLogin) ;
		UEL.addTextChangedListener(uelTextEditorWatcher);
		
		EditText UPL =(EditText) findViewById(R.id.UserPasswordToLogin) ;
		UPL.addTextChangedListener(uplTextEditorWatcher);
		
		
		
		Button BtnSignin =(Button) findViewById(R.id.ButtonSignup);
		BtnSignin.setOnClickListener(this);
		
	}
	
  public void showAccountCustomDialog()
	
	{
	  account_dialog = new Dialog(SignupActivity.this,android.R.style.Theme_DeviceDefault_Light_Dialog);
		 
	  account_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
	  account_dialog.setCancelable(true);
	  account_dialog.setContentView(R.layout.custom_account_dialog);
	  account_dialog.getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, Color.parseColor("#FFFFFF"));      
        
	  ButtonCreateAccount=(Button) account_dialog.findViewById(R.id.ButtonCreateAccount);  
	  ButtonCancel = (Button) account_dialog.findViewById(R.id.ButtonCancel);
	  ButtonCancel.setOnClickListener(this);
	  ButtonCreateAccount.setOnClickListener(this);
      account_dialog.show();
         
         
	}
	
	
	public void showEmailCustomDialog()
	
	{
         email_dialog = new Dialog(SignupActivity.this,android.R.style.Theme_DeviceDefault_Light_Dialog);
		 
         email_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
         email_dialog.setCancelable(true);
         email_dialog.setContentView(R.layout.custom_email_dialog);
         email_dialog.getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, Color.parseColor("#FFFFFF"));      
        
         ButtonSendEmail = (Button) email_dialog.findViewById(R.id.ButtonSendEmail);
         ButtonSendEmail.setOnClickListener(this);
         email_dialog.show();
         
         
	}
	
	
	public void showCustomDialog() {

		 dialog = new Dialog(SignupActivity.this,android.R.style.Theme_DeviceDefault_Light_Dialog);
		 
		 dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		 dialog.setCancelable(true);
		 dialog.setContentView(R.layout.custom_dialog);
		 dialog.getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, Color.parseColor("#FFFFFF"));

		 BtnTryagain = (Button) dialog.findViewById(R.id.ButtonTryAgain);
		 BtnForgotinfo  = (Button) dialog.findViewById(R.id.ButtonForgotInfo);

		 BtnTryagain.setOnClickListener(this);
		 BtnForgotinfo.setOnClickListener(this);

		 dialog.show();
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.ButtonSignup:
			showCustomDialog();
			break;
		case R.id.ButtonTryAgain:
			Intent intent = new Intent(this.getApplicationContext(),SignupActivity .class);
			startActivity(intent);	
			
            dialog.dismiss();
			break;
		case R.id.ButtonForgotInfo:
			showEmailCustomDialog();
			
			break;
		case R.id.ButtonSendEmail:
			showAccountCustomDialog();
			
			break;
		case R.id.ButtonCreateAccount:
			Intent i = new Intent(this,UserDetailsActivity.class);
			startActivity(i);	
			
			break;	
		case R.id.ButtonCancel:
			Intent s = new Intent(this,SignupActivity.class);
			startActivity(s);
			break;
			
		default:
			break;
		}

	}
	
	 public final TextWatcher  uelTextEditorWatcher = new TextWatcher() { 
		 public void beforeTextChanged(CharSequence m, int start, int count, int after)
         {
			
         }
		 public void onTextChanged(CharSequence m, int start, int before, int count)
         {
			 EditText UEL =(EditText) findViewById(R.id.UserEmailToLogin) ;
			 UEL.setTextColor(Color.parseColor("#26AB69"));
         }
		 public void afterTextChanged(Editable m)
         {
		                  
         }
		 
    };
    
    public final TextWatcher  uplTextEditorWatcher = new TextWatcher() { 
		 public void beforeTextChanged(CharSequence n, int start, int count, int after)
        {
			
        }
		 public void onTextChanged(CharSequence n, int start, int before, int count)
        {
			 EditText UPL =(EditText) findViewById(R.id.UserPasswordToLogin) ;
			 UPL.setTextColor(Color.parseColor("#26AB69"));
        }
		 public void afterTextChanged(Editable n)
        {
		                  
        }
		 
   };
   
   
 

	public void gotoaccountrecovery(View v)
    {
    	Intent intent = new Intent(this,AccountRecovery .class);
		startActivity(intent);	
		
    }
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.signup, menu);
		return true;
	}

	

}
