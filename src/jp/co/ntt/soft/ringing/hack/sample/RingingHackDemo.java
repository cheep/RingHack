package jp.co.ntt.soft.ringing.hack.sample;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class RingingHackDemo extends Activity {
	TextView tv;
	TelephonyManager tm;
	PhoneStateListener psl;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ringing_hack_demo);
		
		Log.d("RingHack:", "\n");
		Log.d("RingHack:", "\n");
		Log.d("RingHack:", "\n");
		Log.d("RingHack:", "\n");
		Log.d("RingHack:", "\n");
		
		tv = (TextView)findViewById(R.id.text1);
		
		Uri data = getIntent().getData(); 
		if (data != null && ("tel".equals(data.getScheme()))) { 
		    String number = PhoneNumberUtils.getNumberFromIntent(getIntent(), this); 
		    if (number != null) { 
		      Toast.makeText(this, "Call was made to-->>" + number, 5000).show();
		    }
		    tv.setText(number);
		}
		
		
		
		
		/*
		tv = (TextView)findViewById(R.id.text1);
		
		tm = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
		
		Intent intent = getIntent();

		String number = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
		
		tv.setText(number);
		*/
		
		
		/*
		psl = new PhoneStateListener() {
			 @Override
			 public void onCallStateChanged(int state, String number) {
				 
				 tv.setText(number);
			       
			       switch(state) {
			        case TelephonyManager.CALL_STATE_RINGING:
			        	tv.setText(number);
			        	
			        	
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        	Intent i = new Intent(getApplicationContext(), TestActivity.class);
					    startActivity(i);
					    
					    finish();
			 
			            break;
			 
			        case TelephonyManager.CALL_STATE_OFFHOOK:
			        	tv.setText(number);
			        	
			            break;
			 
			        case TelephonyManager.CALL_STATE_IDLE:
			        	tv.setText(number);
			        	tv.setTextSize(20);

			            break;
			    }
			 }
		};
			 
			   
		
		tm.listen(psl, PhoneStateListener.LISTEN_CALL_STATE);
		*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_ringing_hack_demo, menu);
		return true;
	}

}
