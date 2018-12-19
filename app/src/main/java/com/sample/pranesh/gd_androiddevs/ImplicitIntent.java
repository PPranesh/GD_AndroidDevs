package com.sample.pranesh.gd_androiddevs;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ImplicitIntent extends AppCompatActivity {

    private static String TAG = "Implicit Intent - 5";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
    }

    public void implicitClick(View view) {

        switch(view.getId()){

            case R.id.browser :
                Intent int1 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.github.com"));
                startActivity(int1);
                break;

            case R.id.call :
                Intent int2 = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:9894697120"));
                startActivity(int2);
                break;


            case R.id.map :
                Intent int3 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:37.0902,95.7129"));
                startActivity(int3);
                break;
        }
    }

    public void nxtpgg(View view) {
        Intent int1 = new Intent(ImplicitIntent.this,DebugCheck.class);
        startActivity(int1);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume");
    }
}
