package com.sample.pranesh.gd_androiddevs;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IntentActivity extends AppCompatActivity {

    private static final String TAG = "Intent Activity - 3";
    EditText ed1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        ed1 = (EditText)findViewById(R.id.inputtext);
        btn = (Button)findViewById(R.id.intentnewPage);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // regular intent
                Intent intent = new Intent(IntentActivity.this,IntentResult.class);

                // shares the data from here using putExtra function with name as Key here
                intent.putExtra("User",ed1.getText().toString());

                startActivity(intent);
            }
        });
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
            case R.id.toast:
                Toast.makeText(this,"Intent Activity",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}