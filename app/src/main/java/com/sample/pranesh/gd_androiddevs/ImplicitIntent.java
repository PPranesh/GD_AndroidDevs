package com.sample.pranesh.gd_androiddevs;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ImplicitIntent extends AppCompatActivity {

    private static String TAG = "Implicit Intent - 5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
    }

    public void IMI_OnClick(View view) {

        switch(view.getId()){

            case R.id.IMI_browser :
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.github.com")));
                break;

            case R.id.IMI_call :
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("tel:9894697120")));
                break;


            case R.id.IMI_map :
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("geo:37.0902,95.7129")));
                break;
        }
    }

    public void IMI_nextpage(View view) {
        startActivity(new Intent(ImplicitIntent.this,DebugCheck.class));
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
                Toast.makeText(ImplicitIntent.this,"Implicit Intent",Toast.LENGTH_SHORT).show();
                break;

            case R.id.SM_NextPage:
                startActivity(new Intent(ImplicitIntent.this,DebugCheck.class));
                break;
            case R.id.SM_PreviousPage:
                startActivity(new Intent(ImplicitIntent.this,IntentResult.class));
                break;
        }
        return true;
    }
}
