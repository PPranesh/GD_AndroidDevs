package com.sample.pranesh.gd_androiddevs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Main Activity - 1";
    Button inc;
    TextView num,res;
    int k=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc = (Button)findViewById(R.id.topButton);
        num = (TextView)findViewById(R.id.number);
        res = (TextView)findViewById(R.id.simpleTextView);
        inc.setOnClickListener(this);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k=0;
                num.setText("number : "+ k);
            }
        });
    }

    @Override
    public void onClick(View v) {
        num.setText("number : "+ ++k);
    }

    public void clickk(View v){
        if( k != 0 ){
            num.setText("number : "+ --k);
        }else{
            num.setText(R.string.zero);
        }
    }

    public void nextPage(View v) {
        Intent intent = new Intent(MainActivity.this,ScrollView.class);
        startActivity(intent);
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
