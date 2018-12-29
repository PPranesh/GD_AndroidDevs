package com.sample.pranesh.gd_androiddevs;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class IntentResult extends AppCompatActivity {

    private static String TAG = "Intent Result Activity - 4";
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_result);

        tv1 = (TextView)findViewById(R.id.IR_textView);

        // bundle is the class that is used to pass data between Activities
        // get's data from previous intents
        Bundle b1 = getIntent().getExtras();

        // the bundle data gives a copy to string only if the Key Matches
        String s1 = b1.getString("User");

        // sets to the Text View
        tv1.setText(s1);

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

    public void IR_Button(View view) {
        Intent intent = new Intent(IntentResult.this,ImplicitIntent.class);
        startActivity(intent);
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
                Toast.makeText(IntentResult.this,"Intent Result",Toast.LENGTH_SHORT).show();
                break;

            case R.id.SM_NextPage:
                Intent nxt = new Intent(IntentResult.this,ImplicitIntent.class);
                startActivity(nxt);
                break;
            case R.id.SM_PreviousPage:
                Intent prev = new Intent(IntentResult.this,IntentActivity.class);
                startActivity(prev);
                break;
        }
        return true;
    }
}
