package com.sample.pranesh.gd_androiddevs;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ScrollView extends AppCompatActivity {

    private static final String TAG = "Scroll View - 2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

    }

    public void SV_PrevPage(View v) {
        Intent inten = new Intent(ScrollView.this,MainActivity.class);
        startActivity(inten);
    }

    public void SV_NextPage(View v){
        Intent intent = new Intent(ScrollView.this,IntentActivity.class);
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



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.simple_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.SM_toastMessage:
                Toast.makeText(ScrollView.this,"Scroll View",Toast.LENGTH_SHORT).show();
                break;

            case R.id.SM_NextPage:
                Intent nxt = new Intent(ScrollView.this,IntentActivity.class);
                startActivity(nxt);
                break;
            case R.id.SM_PreviousPage:
                Intent prev = new Intent(ScrollView.this,MainActivity.class);
                startActivity(prev);
                break;
        }
        return true;
    }

}