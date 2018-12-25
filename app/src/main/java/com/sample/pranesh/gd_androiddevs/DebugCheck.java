package com.sample.pranesh.gd_androiddevs;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DebugCheck extends AppCompatActivity {

    private static final String TAG = "Debug Check - 6";
    TextView tv1;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug_check);

        ed1 = (EditText) findViewById(R.id.num1);
        ed2 = (EditText) findViewById(R.id.num2);
        tv1 = (TextView)findViewById(R.id.numoutput);

        registerForContextMenu(ed1);
        registerForContextMenu(ed2);
    }

    public void addnum(View view) {
        int a = Integer.parseInt(ed1.getText().toString());
        int b = Integer.parseInt(ed2.getText().toString());
        int result = a + b;
        tv1.setText("" + result);
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

    public void prevpg(View view) {
        startActivity(new Intent(DebugCheck.this,ImplicitIntent.class));
    }

    public void nxtpg(View view) {
        startActivity(new Intent(DebugCheck.this,InputChecks.class));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.simple_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.toast:
                Toast.makeText(this,"Debug Activity",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch(v.getId()){
            case R.id.num1:
                getMenuInflater().inflate(R.menu.floating_menu1,menu);
                break;

            case R.id.num2:
                getMenuInflater().inflate(R.menu.floating_menu2,menu);
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.cut:
                Toast.makeText(DebugCheck.this,"Cut Pressed",Toast.LENGTH_SHORT).show();
                break;

            case R.id.clear:
                Toast.makeText(DebugCheck.this,"Clear Pressed",Toast.LENGTH_SHORT).show();
                break;

            case R.id.copy:
                Toast.makeText(DebugCheck.this,"Copy Pressed",Toast.LENGTH_SHORT).show();
                break;

            case R.id.share:
                Toast.makeText(DebugCheck.this,"Share Pressed",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
