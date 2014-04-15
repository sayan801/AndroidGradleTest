package com.app.mycuratioui;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;



public class UserPasscode extends Activity implements OnClickListener{
	
	public int nbStep=0;
	public int count = 0;
	
	public Dialog caution_dialog;
	public Button ButtonCautionAlert;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_passcode);		
		
		ActionBar ab = getActionBar(); 
		ab.setDisplayUseLogoEnabled(false);
		ab.setDisplayShowHomeEnabled(true);
        ab.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM); 
        ab.setCustomView(R.layout.actionbar);
        ab.setDisplayHomeAsUpEnabled(true);
	    ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FFFFFF"));     
        ab.setBackgroundDrawable(colorDrawable);
        
        
   
       EditText ed = (EditText) findViewById (R.id.total_click);
       int x = 4;
       ed.setText(""+x);
       ed.setVisibility(View.GONE);
       
       EditText countclick = (EditText) findViewById (R.id.count_click);
	   countclick.setVisibility(View.GONE);
       
	   EditText TextUserPass= (EditText) findViewById(R.id.UserHiddenPass);
       TextUserPass.setVisibility(View.GONE);
       
       Button Imagepassone = (Button) findViewById(R.id.ButtonPassOne);
       Imagepassone.setOnClickListener(ButtonHandlerone); 
       
       Button ImagepassTwo = (Button) findViewById(R.id.ButtonPassTwo);
       ImagepassTwo.setOnClickListener(ButtonHandlerTwo); 
       
       
       
       Button ImagepassThree = (Button) findViewById(R.id.ButtonPassThree);
       ImagepassThree.setOnClickListener(ButtonHandlerThree); 
       
       Button ImagepassFour = (Button) findViewById(R.id.ButtonPassFour);
       ImagepassFour.setOnClickListener(ButtonHandlerFour); 
     
       
       Button ImagepassFive = (Button) findViewById(R.id.ButtonPassFive);
       ImagepassFive.setOnClickListener(ButtonHandlerFive); 
        
       Button ImagepassSix = (Button) findViewById(R.id.ButtonPassSix);
       ImagepassSix.setOnClickListener(ButtonHandlerSix); 
       
       Button ImagepassSeven = (Button) findViewById(R.id.ButtonPassSeven);
       ImagepassSeven.setOnClickListener(ButtonHandlerSeven); 
       
       Button ImagepassEight = (Button) findViewById(R.id.ButtonPassEight);
       ImagepassEight.setOnClickListener(ButtonHandlerEight); 
       
       Button ImagepassNine = (Button) findViewById(R.id.ButtonPassNine);
       ImagepassNine.setOnClickListener(ButtonHandlerNine); 
       
       Button ImagepassZero = (Button) findViewById(R.id.ButtonPassZero);
       ImagepassZero.setOnClickListener(ButtonHandlerZero); 
		
	}
	
View.OnClickListener ButtonHandlerone = new View.OnClickListener() {

	      
    	
    	public void onClick(View v) { 
            
            if(v.getId() == R.id.ButtonPassOne) {
   
                nbStep++;
                count++;
              
                changeStepBackground(nbStep);
            }
        }
   };
   @SuppressWarnings("deprecation")
public void changeStepBackground(int i) { 
	   EditText countclick = (EditText) findViewById (R.id.count_click);
	  
	   EditText ed = (EditText) findViewById (R.id.total_click);
	   
	   EditText TextUserPass= (EditText) findViewById(R.id.UserHiddenPass);
	    // four step switch
	    switch(i) {
	    
	        case 1:
	        	
	           
	        	countclick.setText(String.valueOf(count));
	        	
	        	double commiteduser =Double.parseDouble(countclick.getText().toString());
	        	double totalcommiteduser =Double.parseDouble(ed.getText().toString());
	        	int percent = (int) ((commiteduser/totalcommiteduser)*100);
	        	
	        	 ProgressBar myprogressbar = (ProgressBar) findViewById(R.id.myprogressbar1);
	    	 
	        	 Drawable progressDrawable = getResources().getDrawable(R.drawable.progress_select);
	        	 
	        	 if(percent >= 25)
		        	{
	        	     myprogressbar.setBackgroundDrawable(progressDrawable); 
	        	     TextUserPass.setText(TextUserPass.getText()+"1");  
		        	}
	        	 else
		        	{
	        		 myprogressbar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
		        	}
	        	
	        	     myprogressbar.setProgress(percent);
   
	            
	        break;
	        case 2:
	           
	        	countclick.setText(String.valueOf(count));
	        	
	        	double commiteduser2 =Double.parseDouble(countclick.getText().toString());
	        	double totalcommiteduser2 =Double.parseDouble(ed.getText().toString());
	        	int percent2 = (int) ((commiteduser2/totalcommiteduser2)*100);
	        	
	        	ProgressBar myprogressbar2 = (ProgressBar)findViewById(R.id.myprogressbar2);
	    		
	        	Drawable progressDrawable2 = getResources().getDrawable(R.drawable.progress_select);
	        	 
	        	 if(percent2 >= 25)
		        	{
	        	     myprogressbar2.setBackgroundDrawable(progressDrawable2); 
	        	     TextUserPass.setText(TextUserPass.getText()+"1");  
		        	}
	        	 else
		        	{
	        		 myprogressbar2.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
		        	}
	        	
	        	     myprogressbar2.setProgress(percent2);
	    	  
	        	
	        break;
	        case 3:
	           
	        	countclick.setText(String.valueOf(count));
	        	
	        	double commiteduser3 =Double.parseDouble(countclick.getText().toString());
	        	double totalcommiteduser3 =Double.parseDouble(ed.getText().toString());
	        	int percent3 = (int) ((commiteduser3/totalcommiteduser3)*100);
	        	
	        	ProgressBar myprogressbar3 = (ProgressBar)findViewById(R.id.myprogressbar3);
	    		
	        	Drawable progressDrawable3 = getResources().getDrawable(R.drawable.progress_select);
	        	 
	        	 if(percent3 >= 25)
		        	{
	        	     myprogressbar3.setBackgroundDrawable(progressDrawable3); 
	        	     TextUserPass.setText(TextUserPass.getText()+"1");  
		        	}
	        	 else
		        	{
	        		 myprogressbar3.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
		        	}
	        	
	        	     myprogressbar3.setProgress(percent3);
	        break;
	        case 4:
	            
	        	countclick.setText(String.valueOf(count));
	        	
	        	double commiteduser4 =Double.parseDouble(countclick.getText().toString());
	        	double totalcommiteduser4 =Double.parseDouble(ed.getText().toString());
	        	int percent4 = (int) ((commiteduser4/totalcommiteduser4)*100);
	        	
	        	ProgressBar myprogressbar4 = (ProgressBar)findViewById(R.id.myprogressbar4);
	    		
	        	Drawable progressDrawable4 = getResources().getDrawable(R.drawable.progress_select);
	        	 
	        	 if(percent4 >= 25)
		        	{
	        	     myprogressbar4.setBackgroundDrawable(progressDrawable4); 
	        	     TextUserPass.setText(TextUserPass.getText()+"1");  
		        	}
	        	 else
		        	{
	        		 myprogressbar4.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
		        	}
	        	
	        	     myprogressbar4.setProgress(percent4);
	        break;
	        
	       
	    }
	}
   
   
   View.OnClickListener ButtonHandlerTwo = new View.OnClickListener() {

	      
   	
   	public void onClick(View v) { 
           
           if(v.getId() == R.id.ButtonPassTwo) {
  
               nbStep++;
               count++;
             
               changeStepBackground2(nbStep);
           }
       }
  };
  @SuppressWarnings("deprecation")
public void changeStepBackground2(int i) { 
	   EditText countclick = (EditText) findViewById (R.id.count_click);
	  
	   EditText ed = (EditText) findViewById (R.id.total_click);
	   EditText TextUserPass= (EditText) findViewById(R.id.UserHiddenPass);
	    // four step switch
	    switch(i) {
	    
	        case 1:
	        	
	           
	        	countclick.setText(String.valueOf(count));
	        	
	        	double commiteduser =Double.parseDouble(countclick.getText().toString());
	        	double totalcommiteduser =Double.parseDouble(ed.getText().toString());
	        	int percent = (int) ((commiteduser/totalcommiteduser)*100);
	        	
	        	 ProgressBar myprogressbar = (ProgressBar) findViewById(R.id.myprogressbar1);
	    	 
	        	 Drawable progressDrawable = getResources().getDrawable(R.drawable.progress_select);
	        	 
	        	 if(percent >= 25)
		        	{
	        	     myprogressbar.setBackgroundDrawable(progressDrawable); 
	        	     TextUserPass.setText(TextUserPass.getText()+"2"); 
		        	}
	        	 else
		        	{
	        		 myprogressbar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
		        	}
	        	
	        	     myprogressbar.setProgress(percent);
  
	            
	        break;
	        case 2:
	           
	        	countclick.setText(String.valueOf(count));
	        	
	        	double commiteduser2 =Double.parseDouble(countclick.getText().toString());
	        	double totalcommiteduser2 =Double.parseDouble(ed.getText().toString());
	        	int percent2 = (int) ((commiteduser2/totalcommiteduser2)*100);
	        	
	        	ProgressBar myprogressbar2 = (ProgressBar)findViewById(R.id.myprogressbar2);
	    		
	        	Drawable progressDrawable2 = getResources().getDrawable(R.drawable.progress_select);
	        	 
	        	 if(percent2 >= 25)
		        	{
	        	     myprogressbar2.setBackgroundDrawable(progressDrawable2); 
	        	     TextUserPass.setText(TextUserPass.getText()+"2"); 
		        	}
	        	 else
		        	{
	        		 myprogressbar2.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
		        	}
	        	
	        	     myprogressbar2.setProgress(percent2);
	    	  
	        	
	        break;
	        case 3:
	           
	        	countclick.setText(String.valueOf(count));
	        	
	        	double commiteduser3 =Double.parseDouble(countclick.getText().toString());
	        	double totalcommiteduser3 =Double.parseDouble(ed.getText().toString());
	        	int percent3 = (int) ((commiteduser3/totalcommiteduser3)*100);
	        	
	        	ProgressBar myprogressbar3 = (ProgressBar)findViewById(R.id.myprogressbar3);
	    		
	        	Drawable progressDrawable3 = getResources().getDrawable(R.drawable.progress_select);
	        	 
	        	 if(percent3 >= 25)
		        	{
	        	     myprogressbar3.setBackgroundDrawable(progressDrawable3); 
	        	     TextUserPass.setText(TextUserPass.getText()+"2"); 
		        	}
	        	 else
		        	{
	        		 myprogressbar3.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
		        	}
	        	
	        	     myprogressbar3.setProgress(percent3);
	        break;
	        case 4:
	            
	        	countclick.setText(String.valueOf(count));
	        	
	        	double commiteduser4 =Double.parseDouble(countclick.getText().toString());
	        	double totalcommiteduser4 =Double.parseDouble(ed.getText().toString());
	        	int percent4 = (int) ((commiteduser4/totalcommiteduser4)*100);
	        	
	        	ProgressBar myprogressbar4 = (ProgressBar)findViewById(R.id.myprogressbar4);
	    		
	        	Drawable progressDrawable4 = getResources().getDrawable(R.drawable.progress_select);
	        	 
	        	 if(percent4 >= 25)
		        	{
	        	     myprogressbar4.setBackgroundDrawable(progressDrawable4); 
	        	     TextUserPass.setText(TextUserPass.getText()+"2"); 
		        	}
	        	 else
		        	{
	        		 myprogressbar4.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
		        	}
	        	
	        	     myprogressbar4.setProgress(percent4);
	        break;
	        
	       
	    }
	}
  
  View.OnClickListener ButtonHandlerThree = new View.OnClickListener() {

      
	   	
	   	public void onClick(View v) { 
	           
	           if(v.getId() == R.id.ButtonPassThree) {
	  
	               nbStep++;
	               count++;
	             
	               changeStepBackground3(nbStep);
	           }
	       }
	  };
	  @SuppressWarnings("deprecation")
	public void changeStepBackground3(int i) { 
		   EditText countclick = (EditText) findViewById (R.id.count_click);
		  
		   EditText ed = (EditText) findViewById (R.id.total_click);
		   EditText TextUserPass= (EditText) findViewById(R.id.UserHiddenPass);
		    // four step switch
		    switch(i) {
		    
		        case 1:
		        	
		           
		        	countclick.setText(String.valueOf(count));
		        	
		        	double commiteduser =Double.parseDouble(countclick.getText().toString());
		        	double totalcommiteduser =Double.parseDouble(ed.getText().toString());
		        	int percent = (int) ((commiteduser/totalcommiteduser)*100);
		        	
		        	 ProgressBar myprogressbar = (ProgressBar) findViewById(R.id.myprogressbar1);
		    	 
		        	 Drawable progressDrawable = getResources().getDrawable(R.drawable.progress_select);
		        	 
		        	 if(percent >= 25)
			        	{
		        	     myprogressbar.setBackgroundDrawable(progressDrawable); 
		        	     TextUserPass.setText(TextUserPass.getText()+"3"); 
			        	}
		        	 else
			        	{
		        		 myprogressbar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
			        	}
		        	
		        	     myprogressbar.setProgress(percent);
	  
		            
		        break;
		        case 2:
		           
		        	countclick.setText(String.valueOf(count));
		        	
		        	double commiteduser2 =Double.parseDouble(countclick.getText().toString());
		        	double totalcommiteduser2 =Double.parseDouble(ed.getText().toString());
		        	int percent2 = (int) ((commiteduser2/totalcommiteduser2)*100);
		        	
		        	ProgressBar myprogressbar2 = (ProgressBar)findViewById(R.id.myprogressbar2);
		    		
		        	Drawable progressDrawable2 = getResources().getDrawable(R.drawable.progress_select);
		        	 
		        	 if(percent2 >= 25)
			        	{
		        	     myprogressbar2.setBackgroundDrawable(progressDrawable2);
		        	     TextUserPass.setText(TextUserPass.getText()+"3"); 
			        	}
		        	 else
			        	{
		        		 myprogressbar2.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
			        	}
		        	
		        	     myprogressbar2.setProgress(percent2);
		    	  
		        	
		        break;
		        case 3:
		           
		        	countclick.setText(String.valueOf(count));
		        	
		        	double commiteduser3 =Double.parseDouble(countclick.getText().toString());
		        	double totalcommiteduser3 =Double.parseDouble(ed.getText().toString());
		        	int percent3 = (int) ((commiteduser3/totalcommiteduser3)*100);
		        	
		        	ProgressBar myprogressbar3 = (ProgressBar)findViewById(R.id.myprogressbar3);
		    		
		        	Drawable progressDrawable3 = getResources().getDrawable(R.drawable.progress_select);
		        	 
		        	 if(percent3 >= 25)
			        	{
		        	     myprogressbar3.setBackgroundDrawable(progressDrawable3); 
		        	     TextUserPass.setText(TextUserPass.getText()+"3"); 
			        	}
		        	 else
			        	{
		        		 myprogressbar3.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
			        	}
		        	
		        	     myprogressbar3.setProgress(percent3);
		        break;
		        case 4:
		            
		        	countclick.setText(String.valueOf(count));
		        	
		        	double commiteduser4 =Double.parseDouble(countclick.getText().toString());
		        	double totalcommiteduser4 =Double.parseDouble(ed.getText().toString());
		        	int percent4 = (int) ((commiteduser4/totalcommiteduser4)*100);
		        	
		        	ProgressBar myprogressbar4 = (ProgressBar)findViewById(R.id.myprogressbar4);
		    		
		        	Drawable progressDrawable4 = getResources().getDrawable(R.drawable.progress_select);
		        	 
		        	 if(percent4 >= 25)
			        	{
		        	     myprogressbar4.setBackgroundDrawable(progressDrawable4);
		        	     TextUserPass.setText(TextUserPass.getText()+"3"); 
			        	}
		        	 else
			        	{
		        		 myprogressbar4.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
			        	}
		        	
		        	     myprogressbar4.setProgress(percent4);
		        break;
		        
		       
		    }
		}
	  	
	  
	  View.OnClickListener ButtonHandlerFour = new View.OnClickListener() {

	      
		   	
		   	public void onClick(View v) { 
		           
		           if(v.getId() == R.id.ButtonPassFour) {
		  
		               nbStep++;
		               count++;
		             
		               changeStepBackground4(nbStep);
		           }
		       }
		  };
		  @SuppressWarnings("deprecation")
		public void changeStepBackground4(int i) { 
			   EditText countclick = (EditText) findViewById (R.id.count_click);
			  
			   EditText ed = (EditText) findViewById (R.id.total_click);
			   EditText TextUserPass= (EditText) findViewById(R.id.UserHiddenPass);
			    // four step switch
			    switch(i) {
			    
			        case 1:
			        	
			           
			        	countclick.setText(String.valueOf(count));
			        	
			        	double commiteduser =Double.parseDouble(countclick.getText().toString());
			        	double totalcommiteduser =Double.parseDouble(ed.getText().toString());
			        	int percent = (int) ((commiteduser/totalcommiteduser)*100);
			        	
			        	 ProgressBar myprogressbar = (ProgressBar) findViewById(R.id.myprogressbar1);
			    	 
			        	 Drawable progressDrawable = getResources().getDrawable(R.drawable.progress_select);
			        	 
			        	 if(percent >= 25)
				        	{
			        	     myprogressbar.setBackgroundDrawable(progressDrawable);
			        	     TextUserPass.setText(TextUserPass.getText()+"4"); 
				        	}
			        	 else
				        	{
			        		 myprogressbar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
				        	}
			        	
			        	     myprogressbar.setProgress(percent);
		  
			            
			        break;
			        case 2:
			           
			        	countclick.setText(String.valueOf(count));
			        	
			        	double commiteduser2 =Double.parseDouble(countclick.getText().toString());
			        	double totalcommiteduser2 =Double.parseDouble(ed.getText().toString());
			        	int percent2 = (int) ((commiteduser2/totalcommiteduser2)*100);
			        	
			        	ProgressBar myprogressbar2 = (ProgressBar)findViewById(R.id.myprogressbar2);
			    		
			        	Drawable progressDrawable2 = getResources().getDrawable(R.drawable.progress_select);
			        	 
			        	 if(percent2 >= 25)
				        	{
			        	     myprogressbar2.setBackgroundDrawable(progressDrawable2);
			        	     TextUserPass.setText(TextUserPass.getText()+"4"); 
				        	}
			        	 else
				        	{
			        		 myprogressbar2.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
				        	}
			        	
			        	     myprogressbar2.setProgress(percent2);
			    	  
			        	
			        break;
			        case 3:
			           
			        	countclick.setText(String.valueOf(count));
			        	
			        	double commiteduser3 =Double.parseDouble(countclick.getText().toString());
			        	double totalcommiteduser3 =Double.parseDouble(ed.getText().toString());
			        	int percent3 = (int) ((commiteduser3/totalcommiteduser3)*100);
			        	
			        	ProgressBar myprogressbar3 = (ProgressBar)findViewById(R.id.myprogressbar3);
			    		
			        	Drawable progressDrawable3 = getResources().getDrawable(R.drawable.progress_select);
			        	 
			        	 if(percent3 >= 25)
				        	{
			        	     myprogressbar3.setBackgroundDrawable(progressDrawable3);
			        	     TextUserPass.setText(TextUserPass.getText()+"4"); 
				        	}
			        	 else
				        	{
			        		 myprogressbar3.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
				        	}
			        	
			        	     myprogressbar3.setProgress(percent3);
			        break;
			        case 4:
			            
			        	countclick.setText(String.valueOf(count));
			        	
			        	double commiteduser4 =Double.parseDouble(countclick.getText().toString());
			        	double totalcommiteduser4 =Double.parseDouble(ed.getText().toString());
			        	int percent4 = (int) ((commiteduser4/totalcommiteduser4)*100);
			        	
			        	ProgressBar myprogressbar4 = (ProgressBar)findViewById(R.id.myprogressbar4);
			    		
			        	Drawable progressDrawable4 = getResources().getDrawable(R.drawable.progress_select);
			        	 
			        	 if(percent4 >= 25)
				        	{
			        	     myprogressbar4.setBackgroundDrawable(progressDrawable4);
			        	     TextUserPass.setText(TextUserPass.getText()+"4"); 
				        	}
			        	 else
				        	{
			        		 myprogressbar4.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
				        	}
			        	
			        	     myprogressbar4.setProgress(percent4);
			        break;
			        
			       
			    }
			}
		  	
		  
		  View.OnClickListener ButtonHandlerFive = new View.OnClickListener() {

		      
			   	
			   	public void onClick(View v) { 
			           
			           if(v.getId() == R.id.ButtonPassFive) {
			  
			               nbStep++;
			               count++;
			             
			               changeStepBackground5(nbStep);
			           }
			       }
			  };
			  @SuppressWarnings("deprecation")
			public void changeStepBackground5(int i) { 
				   EditText countclick = (EditText) findViewById (R.id.count_click);
				  
				   EditText ed = (EditText) findViewById (R.id.total_click);
				   EditText TextUserPass= (EditText) findViewById(R.id.UserHiddenPass);
				    // four step switch
				    switch(i) {
				    
				        case 1:
				        	
				           
				        	countclick.setText(String.valueOf(count));
				        	
				        	double commiteduser =Double.parseDouble(countclick.getText().toString());
				        	double totalcommiteduser =Double.parseDouble(ed.getText().toString());
				        	int percent = (int) ((commiteduser/totalcommiteduser)*100);
				        	
				        	 ProgressBar myprogressbar = (ProgressBar) findViewById(R.id.myprogressbar1);
				    	 
				        	 Drawable progressDrawable = getResources().getDrawable(R.drawable.progress_select);
				        	 
				        	 if(percent >= 25)
					        	{
				        	     myprogressbar.setBackgroundDrawable(progressDrawable);
				        	     TextUserPass.setText(TextUserPass.getText()+"5"); 
					        	}
				        	 else
					        	{
				        		 myprogressbar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
					        	}
				        	
				        	     myprogressbar.setProgress(percent);
			  
				            
				        break;
				        case 2:
				           
				        	countclick.setText(String.valueOf(count));
				        	
				        	double commiteduser2 =Double.parseDouble(countclick.getText().toString());
				        	double totalcommiteduser2 =Double.parseDouble(ed.getText().toString());
				        	int percent2 = (int) ((commiteduser2/totalcommiteduser2)*100);
				        	
				        	ProgressBar myprogressbar2 = (ProgressBar)findViewById(R.id.myprogressbar2);
				    		
				        	Drawable progressDrawable2 = getResources().getDrawable(R.drawable.progress_select);
				        	 
				        	 if(percent2 >= 25)
					        	{
				        	     myprogressbar2.setBackgroundDrawable(progressDrawable2);
				        	     TextUserPass.setText(TextUserPass.getText()+"5");
					        	}
				        	 else
					        	{
				        		 myprogressbar2.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
					        	}
				        	
				        	     myprogressbar2.setProgress(percent2);
				    	  
				        	
				        break;
				        case 3:
				           
				        	countclick.setText(String.valueOf(count));
				        	
				        	double commiteduser3 =Double.parseDouble(countclick.getText().toString());
				        	double totalcommiteduser3 =Double.parseDouble(ed.getText().toString());
				        	int percent3 = (int) ((commiteduser3/totalcommiteduser3)*100);
				        	
				        	ProgressBar myprogressbar3 = (ProgressBar)findViewById(R.id.myprogressbar3);
				    		
				        	Drawable progressDrawable3 = getResources().getDrawable(R.drawable.progress_select);
				        	 
				        	 if(percent3 >= 25)
					        	{
				        	     myprogressbar3.setBackgroundDrawable(progressDrawable3);
				        	     TextUserPass.setText(TextUserPass.getText()+"5");
					        	}
				        	 else
					        	{
				        		 myprogressbar3.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
					        	}
				        	
				        	     myprogressbar3.setProgress(percent3);
				        break;
				        case 4:
				            
				        	countclick.setText(String.valueOf(count));
				        	
				        	double commiteduser4 =Double.parseDouble(countclick.getText().toString());
				        	double totalcommiteduser4 =Double.parseDouble(ed.getText().toString());
				        	int percent4 = (int) ((commiteduser4/totalcommiteduser4)*100);
				        	
				        	ProgressBar myprogressbar4 = (ProgressBar)findViewById(R.id.myprogressbar4);
				    		
				        	Drawable progressDrawable4 = getResources().getDrawable(R.drawable.progress_select);
				        	 
				        	 if(percent4 >= 25)
					        	{
				        	     myprogressbar4.setBackgroundDrawable(progressDrawable4);
				        	     TextUserPass.setText(TextUserPass.getText()+"5");
					        	}
				        	 else
					        	{
				        		 myprogressbar4.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
					        	}
				        	
				        	     myprogressbar4.setProgress(percent4);
				        break;
				        
				       
				    }
				}

			  View.OnClickListener ButtonHandlerSix = new View.OnClickListener() {

			      
				   	
				   	public void onClick(View v) { 
				           
				           if(v.getId() == R.id.ButtonPassSix) {
				  
				               nbStep++;
				               count++;
				             
				               changeStepBackground6(nbStep);
				           }
				       }
				  };
				  @SuppressWarnings("deprecation")
				public void changeStepBackground6(int i) { 
					   EditText countclick = (EditText) findViewById (R.id.count_click);
					  
					   EditText ed = (EditText) findViewById (R.id.total_click);
					   EditText TextUserPass= (EditText) findViewById(R.id.UserHiddenPass);
					    // four step switch
					    switch(i) {
					    
					        case 1:
					        	
					           
					        	countclick.setText(String.valueOf(count));
					        	
					        	double commiteduser =Double.parseDouble(countclick.getText().toString());
					        	double totalcommiteduser =Double.parseDouble(ed.getText().toString());
					        	int percent = (int) ((commiteduser/totalcommiteduser)*100);
					        	
					        	 ProgressBar myprogressbar = (ProgressBar) findViewById(R.id.myprogressbar1);
					    	 
					        	 Drawable progressDrawable = getResources().getDrawable(R.drawable.progress_select);
					        	 
					        	 if(percent >= 25)
						        	{
					        	     myprogressbar.setBackgroundDrawable(progressDrawable);
					        	     TextUserPass.setText(TextUserPass.getText()+"6");
						        	}
					        	 else
						        	{
					        		 myprogressbar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
						        	}
					        	
					        	     myprogressbar.setProgress(percent);
				  
					            
					        break;
					        case 2:
					           
					        	countclick.setText(String.valueOf(count));
					        	
					        	double commiteduser2 =Double.parseDouble(countclick.getText().toString());
					        	double totalcommiteduser2 =Double.parseDouble(ed.getText().toString());
					        	int percent2 = (int) ((commiteduser2/totalcommiteduser2)*100);
					        	
					        	ProgressBar myprogressbar2 = (ProgressBar)findViewById(R.id.myprogressbar2);
					    		
					        	Drawable progressDrawable2 = getResources().getDrawable(R.drawable.progress_select);
					        	 
					        	 if(percent2 >= 25)
						        	{
					        	     myprogressbar2.setBackgroundDrawable(progressDrawable2);
					        	     TextUserPass.setText(TextUserPass.getText()+"6");
						        	}
					        	 else
						        	{
					        		 myprogressbar2.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
						        	}
					        	
					        	     myprogressbar2.setProgress(percent2);
					    	  
					        	
					        break;
					        case 3:
					           
					        	countclick.setText(String.valueOf(count));
					        	
					        	double commiteduser3 =Double.parseDouble(countclick.getText().toString());
					        	double totalcommiteduser3 =Double.parseDouble(ed.getText().toString());
					        	int percent3 = (int) ((commiteduser3/totalcommiteduser3)*100);
					        	
					        	ProgressBar myprogressbar3 = (ProgressBar)findViewById(R.id.myprogressbar3);
					    		
					        	Drawable progressDrawable3 = getResources().getDrawable(R.drawable.progress_select);
					        	 
					        	 if(percent3 >= 25)
						        	{
					        	     myprogressbar3.setBackgroundDrawable(progressDrawable3); 
						        	}
					        	 else
						        	{
					        		 myprogressbar3.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
					        		 TextUserPass.setText(TextUserPass.getText()+"6");
						        	}
					        	
					        	     myprogressbar3.setProgress(percent3);
					        break;
					        case 4:
					            
					        	countclick.setText(String.valueOf(count));
					        	
					        	double commiteduser4 =Double.parseDouble(countclick.getText().toString());
					        	double totalcommiteduser4 =Double.parseDouble(ed.getText().toString());
					        	int percent4 = (int) ((commiteduser4/totalcommiteduser4)*100);
					        	
					        	ProgressBar myprogressbar4 = (ProgressBar)findViewById(R.id.myprogressbar4);
					    		
					        	Drawable progressDrawable4 = getResources().getDrawable(R.drawable.progress_select);
					        	 
					        	 if(percent4 >= 25)
						        	{
					        	     myprogressbar4.setBackgroundDrawable(progressDrawable4); 
					        	     TextUserPass.setText(TextUserPass.getText()+"6");
						        	}
					        	 else
						        	{
					        		 myprogressbar4.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
						        	}
					        	
					        	     myprogressbar4.setProgress(percent4);
					        break;
					        
					       
					    }
					}
				  
				  View.OnClickListener ButtonHandlerSeven = new View.OnClickListener() {

				      
					   	
					   	public void onClick(View v) { 
					           
					           if(v.getId() == R.id.ButtonPassSeven) {
					  
					               nbStep++;
					               count++;
					             
					               changeStepBackground7(nbStep);
					           }
					       }
					  };
					  @SuppressWarnings("deprecation")
					public void changeStepBackground7(int i) { 
						   EditText countclick = (EditText) findViewById (R.id.count_click);
						  
						   EditText ed = (EditText) findViewById (R.id.total_click);
						   EditText TextUserPass= (EditText) findViewById(R.id.UserHiddenPass);
						    // four step switch
						    switch(i) {
						    
						        case 1:
						        	
						           
						        	countclick.setText(String.valueOf(count));
						        	
						        	double commiteduser =Double.parseDouble(countclick.getText().toString());
						        	double totalcommiteduser =Double.parseDouble(ed.getText().toString());
						        	int percent = (int) ((commiteduser/totalcommiteduser)*100);
						        	
						        	 ProgressBar myprogressbar = (ProgressBar) findViewById(R.id.myprogressbar1);
						    	 
						        	 Drawable progressDrawable = getResources().getDrawable(R.drawable.progress_select);
						        	 
						        	 if(percent >= 25)
							        	{
						        	     myprogressbar.setBackgroundDrawable(progressDrawable); 
						        	     TextUserPass.setText(TextUserPass.getText()+"7");
							        	}
						        	 else
							        	{
						        		 myprogressbar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
							        	}
						        	
						        	     myprogressbar.setProgress(percent);
					  
						            
						        break;
						        case 2:
						           
						        	countclick.setText(String.valueOf(count));
						        	
						        	double commiteduser2 =Double.parseDouble(countclick.getText().toString());
						        	double totalcommiteduser2 =Double.parseDouble(ed.getText().toString());
						        	int percent2 = (int) ((commiteduser2/totalcommiteduser2)*100);
						        	
						        	ProgressBar myprogressbar2 = (ProgressBar)findViewById(R.id.myprogressbar2);
						    		
						        	Drawable progressDrawable2 = getResources().getDrawable(R.drawable.progress_select);
						        	 
						        	 if(percent2 >= 25)
							        	{
						        	     myprogressbar2.setBackgroundDrawable(progressDrawable2);
						        	     TextUserPass.setText(TextUserPass.getText()+"7");
							        	}
						        	 else
							        	{
						        		 myprogressbar2.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
							        	}
						        	
						        	     myprogressbar2.setProgress(percent2);
						    	  
						        	
						        break;
						        case 3:
						           
						        	countclick.setText(String.valueOf(count));
						        	
						        	double commiteduser3 =Double.parseDouble(countclick.getText().toString());
						        	double totalcommiteduser3 =Double.parseDouble(ed.getText().toString());
						        	int percent3 = (int) ((commiteduser3/totalcommiteduser3)*100);
						        	
						        	ProgressBar myprogressbar3 = (ProgressBar)findViewById(R.id.myprogressbar3);
						    		
						        	Drawable progressDrawable3 = getResources().getDrawable(R.drawable.progress_select);
						        	 
						        	 if(percent3 >= 25)
							        	{
						        	     myprogressbar3.setBackgroundDrawable(progressDrawable3);
						        	     TextUserPass.setText(TextUserPass.getText()+"7");
							        	}
						        	 else
							        	{
						        		 myprogressbar3.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
							        	}
						        	
						        	     myprogressbar3.setProgress(percent3);
						        break;
						        case 4:
						            
						        	countclick.setText(String.valueOf(count));
						        	
						        	double commiteduser4 =Double.parseDouble(countclick.getText().toString());
						        	double totalcommiteduser4 =Double.parseDouble(ed.getText().toString());
						        	int percent4 = (int) ((commiteduser4/totalcommiteduser4)*100);
						        	
						        	ProgressBar myprogressbar4 = (ProgressBar)findViewById(R.id.myprogressbar4);
						    		
						        	Drawable progressDrawable4 = getResources().getDrawable(R.drawable.progress_select);
						        	 
						        	 if(percent4 >= 25)
							        	{
						        	     myprogressbar4.setBackgroundDrawable(progressDrawable4);
						        	     TextUserPass.setText(TextUserPass.getText()+"7");
							        	}
						        	 else
							        	{
						        		 myprogressbar4.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
							        	}
						        	
						        	     myprogressbar4.setProgress(percent4);
						        break;
						        
						       
						    }
						}
		  
					  View.OnClickListener ButtonHandlerEight = new View.OnClickListener() {

					      
						   	
						   	public void onClick(View v) { 
						           
						           if(v.getId() == R.id.ButtonPassEight) {
						  
						               nbStep++;
						               count++;
						             
						               changeStepBackground8(nbStep);
						           }
						       }
						  };
						  @SuppressWarnings("deprecation")
						public void changeStepBackground8(int i) { 
							   EditText countclick = (EditText) findViewById (R.id.count_click);
							  
							   EditText ed = (EditText) findViewById (R.id.total_click);
							   EditText TextUserPass= (EditText) findViewById(R.id.UserHiddenPass);
							    // four step switch
							    switch(i) {
							    
							        case 1:
							        	
							           
							        	countclick.setText(String.valueOf(count));
							        	
							        	double commiteduser =Double.parseDouble(countclick.getText().toString());
							        	double totalcommiteduser =Double.parseDouble(ed.getText().toString());
							        	int percent = (int) ((commiteduser/totalcommiteduser)*100);
							        	
							        	 ProgressBar myprogressbar = (ProgressBar) findViewById(R.id.myprogressbar1);
							    	 
							        	 Drawable progressDrawable = getResources().getDrawable(R.drawable.progress_select);
							        	 
							        	 if(percent >= 25)
								        	{
							        	     myprogressbar.setBackgroundDrawable(progressDrawable);
							        	     TextUserPass.setText(TextUserPass.getText()+"8");
								        	}
							        	 else
								        	{
							        		 myprogressbar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
								        	}
							        	
							        	     myprogressbar.setProgress(percent);
						  
							            
							        break;
							        case 2:
							           
							        	countclick.setText(String.valueOf(count));
							        	
							        	double commiteduser2 =Double.parseDouble(countclick.getText().toString());
							        	double totalcommiteduser2 =Double.parseDouble(ed.getText().toString());
							        	int percent2 = (int) ((commiteduser2/totalcommiteduser2)*100);
							        	
							        	ProgressBar myprogressbar2 = (ProgressBar)findViewById(R.id.myprogressbar2);
							    		
							        	Drawable progressDrawable2 = getResources().getDrawable(R.drawable.progress_select);
							        	 
							        	 if(percent2 >= 25)
								        	{
							        	     myprogressbar2.setBackgroundDrawable(progressDrawable2);
							        	     TextUserPass.setText(TextUserPass.getText()+"8");
								        	}
							        	 else
								        	{
							        		 myprogressbar2.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
								        	}
							        	
							        	     myprogressbar2.setProgress(percent2);
							    	  
							        	
							        break;
							        case 3:
							           
							        	countclick.setText(String.valueOf(count));
							        	
							        	double commiteduser3 =Double.parseDouble(countclick.getText().toString());
							        	double totalcommiteduser3 =Double.parseDouble(ed.getText().toString());
							        	int percent3 = (int) ((commiteduser3/totalcommiteduser3)*100);
							        	
							        	ProgressBar myprogressbar3 = (ProgressBar)findViewById(R.id.myprogressbar3);
							    		
							        	Drawable progressDrawable3 = getResources().getDrawable(R.drawable.progress_select);
							        	 
							        	 if(percent3 >= 25)
								        	{
							        	     myprogressbar3.setBackgroundDrawable(progressDrawable3);
							        	     TextUserPass.setText(TextUserPass.getText()+"8");
								        	}
							        	 else
								        	{
							        		 myprogressbar3.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
								        	}
							        	
							        	     myprogressbar3.setProgress(percent3);
							        break;
							        case 4:
							            
							        	countclick.setText(String.valueOf(count));
							        	
							        	double commiteduser4 =Double.parseDouble(countclick.getText().toString());
							        	double totalcommiteduser4 =Double.parseDouble(ed.getText().toString());
							        	int percent4 = (int) ((commiteduser4/totalcommiteduser4)*100);
							        	
							        	ProgressBar myprogressbar4 = (ProgressBar)findViewById(R.id.myprogressbar4);
							    		
							        	Drawable progressDrawable4 = getResources().getDrawable(R.drawable.progress_select);
							        	 
							        	 if(percent4 >= 25)
								        	{
							        	     myprogressbar4.setBackgroundDrawable(progressDrawable4);
							        	     TextUserPass.setText(TextUserPass.getText()+"8");
								        	}
							        	 else
								        	{
							        		 myprogressbar4.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
								        	}
							        	
							        	     myprogressbar4.setProgress(percent4);
							        break;
							        
							       
							    }
							}
			  

						  View.OnClickListener ButtonHandlerNine = new View.OnClickListener() {

						      
							   	
							   	public void onClick(View v) { 
							           
							           if(v.getId() == R.id.ButtonPassNine) {
							  
							               nbStep++;
							               count++;
							             
							               changeStepBackground9(nbStep);
							           }
							       }
							  };
							  @SuppressWarnings("deprecation")
							public void changeStepBackground9(int i) { 
								   EditText countclick = (EditText) findViewById (R.id.count_click);
								  
								   EditText ed = (EditText) findViewById (R.id.total_click);
								   EditText TextUserPass= (EditText) findViewById(R.id.UserHiddenPass);
								    // four step switch
								    switch(i) {
								    
								        case 1:
								        	
								           
								        	countclick.setText(String.valueOf(count));
								        	
								        	double commiteduser =Double.parseDouble(countclick.getText().toString());
								        	double totalcommiteduser =Double.parseDouble(ed.getText().toString());
								        	int percent = (int) ((commiteduser/totalcommiteduser)*100);
								        	
								        	 ProgressBar myprogressbar = (ProgressBar) findViewById(R.id.myprogressbar1);
								    	 
								        	 Drawable progressDrawable = getResources().getDrawable(R.drawable.progress_select);
								        	 
								        	 if(percent >= 25)
									        	{
								        	     myprogressbar.setBackgroundDrawable(progressDrawable);
								        	     TextUserPass.setText(TextUserPass.getText()+"9");
									        	}
								        	 else
									        	{
								        		 myprogressbar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
									        	}
								        	
								        	     myprogressbar.setProgress(percent);
							  
								            
								        break;
								        case 2:
								           
								        	countclick.setText(String.valueOf(count));
								        	
								        	double commiteduser2 =Double.parseDouble(countclick.getText().toString());
								        	double totalcommiteduser2 =Double.parseDouble(ed.getText().toString());
								        	int percent2 = (int) ((commiteduser2/totalcommiteduser2)*100);
								        	
								        	ProgressBar myprogressbar2 = (ProgressBar)findViewById(R.id.myprogressbar2);
								    		
								        	Drawable progressDrawable2 = getResources().getDrawable(R.drawable.progress_select);
								        	 
								        	 if(percent2 >= 25)
									        	{
								        	     myprogressbar2.setBackgroundDrawable(progressDrawable2);
								        	     TextUserPass.setText(TextUserPass.getText()+"9");
									        	}
								        	 else
									        	{
								        		 myprogressbar2.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
									        	}
								        	
								        	     myprogressbar2.setProgress(percent2);
								    	  
								        	
								        break;
								        case 3:
								           
								        	countclick.setText(String.valueOf(count));
								        	
								        	double commiteduser3 =Double.parseDouble(countclick.getText().toString());
								        	double totalcommiteduser3 =Double.parseDouble(ed.getText().toString());
								        	int percent3 = (int) ((commiteduser3/totalcommiteduser3)*100);
								        	
								        	ProgressBar myprogressbar3 = (ProgressBar)findViewById(R.id.myprogressbar3);
								    		
								        	Drawable progressDrawable3 = getResources().getDrawable(R.drawable.progress_select);
								        	 
								        	 if(percent3 >= 25)
									        	{
								        	     myprogressbar3.setBackgroundDrawable(progressDrawable3);
								        	     TextUserPass.setText(TextUserPass.getText()+"9");
									        	}
								        	 else
									        	{
								        		 myprogressbar3.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
									        	}
								        	
								        	     myprogressbar3.setProgress(percent3);
								        break;
								        case 4:
								            
								        	countclick.setText(String.valueOf(count));
								        	
								        	double commiteduser4 =Double.parseDouble(countclick.getText().toString());
								        	double totalcommiteduser4 =Double.parseDouble(ed.getText().toString());
								        	int percent4 = (int) ((commiteduser4/totalcommiteduser4)*100);
								        	
								        	ProgressBar myprogressbar4 = (ProgressBar)findViewById(R.id.myprogressbar4);
								    		
								        	Drawable progressDrawable4 = getResources().getDrawable(R.drawable.progress_select);
								        	 
								        	 if(percent4 >= 25)
									        	{
								        	     myprogressbar4.setBackgroundDrawable(progressDrawable4);
								        	     TextUserPass.setText(TextUserPass.getText()+"9");
									        	}
								        	 else
									        	{
								        		 myprogressbar4.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
									        	}
								        	
								        	     myprogressbar4.setProgress(percent4);
								        break;
								        
								       
								    }
								}
				  

							  View.OnClickListener ButtonHandlerZero = new View.OnClickListener() {

							      
								   	
								   	public void onClick(View v) { 
								           
								           if(v.getId() == R.id.ButtonPassZero) {
								  
								               nbStep++;
								               count++;
								             
								               changeStepBackground0(nbStep);
								           }
								       }
								  };
								  @SuppressWarnings("deprecation")
								public void changeStepBackground0(int i) { 
									   EditText countclick = (EditText) findViewById (R.id.count_click);
									  
									   EditText ed = (EditText) findViewById (R.id.total_click);
									   EditText TextUserPass= (EditText) findViewById(R.id.UserHiddenPass);
									    // four step switch
									    switch(i) {
									    
									        case 1:
									        	
									           
									        	countclick.setText(String.valueOf(count));
									        	
									        	double commiteduser =Double.parseDouble(countclick.getText().toString());
									        	double totalcommiteduser =Double.parseDouble(ed.getText().toString());
									        	int percent = (int) ((commiteduser/totalcommiteduser)*100);
									        	
									        	 ProgressBar myprogressbar = (ProgressBar) findViewById(R.id.myprogressbar1);
									    	 
									        	 Drawable progressDrawable = getResources().getDrawable(R.drawable.progress_select);
									        	 
									        	 if(percent >= 25)
										        	{
									        	     myprogressbar.setBackgroundDrawable(progressDrawable);
									        	     TextUserPass.setText(TextUserPass.getText()+"0");
										        	}
									        	 else
										        	{
									        		 myprogressbar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
										        	}
									        	
									        	     myprogressbar.setProgress(percent);
								  
									            
									        break;
									        case 2:
									           
									        	countclick.setText(String.valueOf(count));
									        	
									        	double commiteduser2 =Double.parseDouble(countclick.getText().toString());
									        	double totalcommiteduser2 =Double.parseDouble(ed.getText().toString());
									        	int percent2 = (int) ((commiteduser2/totalcommiteduser2)*100);
									        	
									        	ProgressBar myprogressbar2 = (ProgressBar)findViewById(R.id.myprogressbar2);
									    		
									        	Drawable progressDrawable2 = getResources().getDrawable(R.drawable.progress_select);
									        	 
									        	 if(percent2 >= 25)
										        	{
									        	     myprogressbar2.setBackgroundDrawable(progressDrawable2);
									        	     TextUserPass.setText(TextUserPass.getText()+"0");
										        	}
									        	 else
										        	{
									        		 myprogressbar2.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
										        	}
									        	
									        	     myprogressbar2.setProgress(percent2);
									    	  
									        	
									        break;
									        case 3:
									           
									        	countclick.setText(String.valueOf(count));
									        	
									        	double commiteduser3 =Double.parseDouble(countclick.getText().toString());
									        	double totalcommiteduser3 =Double.parseDouble(ed.getText().toString());
									        	int percent3 = (int) ((commiteduser3/totalcommiteduser3)*100);
									        	
									        	ProgressBar myprogressbar3 = (ProgressBar)findViewById(R.id.myprogressbar3);
									    		
									        	Drawable progressDrawable3 = getResources().getDrawable(R.drawable.progress_select);
									        	 
									        	 if(percent3 >= 25)
										        	{
									        	     myprogressbar3.setBackgroundDrawable(progressDrawable3);
									        	     TextUserPass.setText(TextUserPass.getText()+"0");
										        	}
									        	 else
										        	{
									        		 myprogressbar3.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
										        	}
									        	
									        	     myprogressbar3.setProgress(percent3);
									        break;
									        case 4:
									            
									        	countclick.setText(String.valueOf(count));
									        	
									        	double commiteduser4 =Double.parseDouble(countclick.getText().toString());
									        	double totalcommiteduser4 =Double.parseDouble(ed.getText().toString());
									        	int percent4 = (int) ((commiteduser4/totalcommiteduser4)*100);
									        	
									        	ProgressBar myprogressbar4 = (ProgressBar)findViewById(R.id.myprogressbar4);
									    		
									        	Drawable progressDrawable4 = getResources().getDrawable(R.drawable.progress_select);
									        	 
									        	 if(percent4 >= 25)
										        	{
									        	     myprogressbar4.setBackgroundDrawable(progressDrawable4);
									        	     TextUserPass.setText(TextUserPass.getText()+"0");
										        	}
									        	 else
										        	{
									        		 myprogressbar4.setProgressDrawable(getResources().getDrawable(R.drawable.progress_select));
										        	}
									        	
									        	     myprogressbar4.setProgress(percent4);
									        break;
									        
									       
									    }
									}
					  

								  @Override
									public boolean onOptionsItemSelected(MenuItem item) {
									    switch (item.getItemId()) {
									        case android.R.id.home:
									            // app icon in action bar clicked; go home
									            Intent intent = new Intent(this, UserDob.class);
									            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
									            startActivity(intent);
									            return true;
									            default:
									            return super.onOptionsItemSelected(item);
									    }
									}
									
									@Override
									public void onBackPressed() {
									   moveTaskToBack(true); 
									   UserPasscode.this.finish();
									}					
	
									public void onClick(View v) {
										switch (v.getId()) {
										case R.id.ButtonCautionAlert:
											Intent i = new Intent(this,UserPasscode.class);
											startActivity(i);
											break;									
									    	default:
											break;
										}
									}								
									
	public void gotoconfirmpasscode(View v)
	
    {	
		EditText TextUserPass= (EditText) findViewById(R.id.UserHiddenPass);
		String UserPass=TextUserPass.getText().toString();	
		//Toast.makeText(getApplicationContext(), UserPass,Toast.LENGTH_LONG).show();
		
		int numberOfImages=nbStep;
		if(numberOfImages!=4 || numberOfImages>4)
		{	
			caution_dialog = new Dialog(UserPasscode.this,android.R.style.Theme_DeviceDefault_Light_Dialog);
			 
			caution_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
			caution_dialog.setCancelable(true);
			caution_dialog.setContentView(R.layout.custom_caution_dialog);
			caution_dialog.getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, Color.parseColor("#FFFFFF"));

			ButtonCautionAlert = (Button) caution_dialog.findViewById(R.id.ButtonCautionAlert);
		

			ButtonCautionAlert.setOnClickListener(this);
			

			caution_dialog.show();	
			
		}
		else
		{ 
					
			 Bundle b = new Bundle();
			 b.putString("PASSWORD", UserPass);
    	Intent intent = new Intent(this,UserConfirmPasscode .class);
    	intent.putExtras(b);
		startActivity(intent);	
		
    }
  }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.user_passcode, menu);
		return true;
	}


	
}
