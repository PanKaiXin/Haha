package com.example.pkx7576.hah.util;

/**
 * Created by pkx7576 on 2016/9/29.
 */


import android.util.Log;

/**
 * Created by Administrator on 2016/9/27.
 */
public class LoggerConfig {

	public static final boolean ON = true;

	public static void w(String TAG,String msg){

		if(ON){
			Log.w(TAG,msg);
		}
	}


	public static void i(String TAG,String msg){

		if(ON){
			Log.i(TAG,msg);
		}
	}

	public static void v(String TAG,String msg){

		if(ON){
			Log.v(TAG,msg);
		}
	}

	public static void e(String TAG,String msg){

		if(ON){
			Log.e(TAG,msg);
		}
	}
}