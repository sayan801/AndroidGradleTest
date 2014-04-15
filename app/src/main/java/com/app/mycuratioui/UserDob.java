package com.app.mycuratioui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import android.net.ParseException;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TextView;

@SuppressLint("SimpleDateFormat")
public class UserDob extends Activity {

	TextView tvDisplayDate;
	 DatePicker datePickerBirthday;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_dob);
		
		ActionBar ab = getActionBar(); 
		ab.setDisplayUseLogoEnabled(false);
		ab.setDisplayShowHomeEnabled(true);
        ab.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM); 
        ab.setCustomView(R.layout.actionbar);
        ab.setDisplayHomeAsUpEnabled(true);
	    ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FFFFFF"));     
        ab.setBackgroundDrawable(colorDrawable);
		
		datePickerBirthday=(DatePicker)findViewById(R.id.dpResult);
		tvDisplayDate = (TextView)findViewById(R.id.textViewUserDate);
		
		 int currentapiVersion = android.os.Build.VERSION.SDK_INT;
	        if (currentapiVersion >= 11) {
	            datePickerBirthday.setCalendarViewShown(false);
	        }
	        
	        SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
	        String dateStr = sdfDateTime.format(new Date(System.currentTimeMillis()));
	        
	        String[] dateSplit = dateStr.split("-");
	        int currentYear = Integer.parseInt(dateSplit[0]);
	        int currentMonth = Integer.parseInt(dateSplit[1]);
	        int currentDay = Integer.parseInt(dateSplit[2]);
	        
	        // to show date and day of week in the TextView
	        setHumanReadableDate(currentYear, currentMonth, currentDay);

	        // initialize date picker listener
	        // currentMonth - 1, because on the picker, 0 is January
	        datePickerBirthday.init(currentYear, currentMonth - 1, currentDay, birthdayListener);

		
	}
	 // the date picker listener
   OnDateChangedListener birthdayListener = new OnDateChangedListener() {
       
       @Override
       public void onDateChanged(DatePicker birthDayDatePicker,
               int newYear, int newMonth, int newDay) {

           try{
               
               // currentMonth + 1, to retrieve proper month
               setHumanReadableDate(newYear, newMonth + 1, newDay);
               
           } catch (NullPointerException e) {
               e.printStackTrace();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
   };
   
   // show the user a better date format
   public void setHumanReadableDate(int newYear, int newMonth, int newDay){
       try {
           
           String clickedDate = newYear + "-" + newMonth + "-" + newDay;
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           Date d = null;
			try {
				d = sdf.parse(clickedDate);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

           SimpleDateFormat sdfDateTime = new SimpleDateFormat("MMMM dd, yyyy 'is' EEEE", Locale.US);
           String dateStr = sdfDateTime.format(d);
           
           tvDisplayDate.setText(dateStr);
           
       } catch (ParseException e) {
           e.printStackTrace();
       }
   }
   @Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case android.R.id.home:
	            // app icon in action bar clicked; go home
	            Intent intent = new Intent(this, UserDetailsActivity.class);
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
	   UserDob.this.finish();
	}
   
	public void gotopasscode(View v)
	   {
	   	Intent intent = new Intent(getApplicationContext(),UserPasscode .class);
			startActivity(intent);
	   }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.user_dob, menu);
		return true;
	}

}
