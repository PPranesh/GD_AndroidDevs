package com.sample.pranesh.gd_androiddevs;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImplicitIntent extends AppCompatActivity {

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
}
