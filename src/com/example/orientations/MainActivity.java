package com.example.orientations;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("StateInfo","onCreate");
    }
    
    @Override
    public void onStart() {
    	Log.d("stateInfo", "onStart");
    	super.onStart();
    }
    
    public void onResume() {
    	Log.d("StateInfo", "onResume");
    	super.onResume();
    }
    
    public void onPause() {
    	Log.d("StateInfo", "onPause");
    	super.onPause();
    }
    
    public void onStop() {
    	Log.d("StateInfo", "onStop");
    	super.onStop();
    }

    public void onDestroy() {
    	Log.d("StateInfo", "onDestroy");
    	super.onDestroy();
    }
    
    public void onRestart() {
    	Log.d("StateInfo", "onRestart");
    	super.onRestart();
    }


}
