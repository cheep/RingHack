package jp.co.ntt.soft.ringing.hack.sample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class CallReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO 自動生成されたメソッド・スタブ
		Log.d("Receive","In onReceive()");

        if (arg1.getAction().equals(Intent.ACTION_NEW_OUTGOING_CALL)) {
             String number = arg1.getStringExtra(Intent.EXTRA_PHONE_NUMBER);

             Log.e("Receive","Number is: "+number);

        }
		
	}
	

}
