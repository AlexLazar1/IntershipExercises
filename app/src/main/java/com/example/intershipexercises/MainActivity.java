package com.example.intershipexercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Happy to be born");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: I exist, but you can;t see me");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume: Preparing final UI changes for you master");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause: You can see me, but you can't interact");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop: Packing up to leave");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy: cya!");
    }
}
