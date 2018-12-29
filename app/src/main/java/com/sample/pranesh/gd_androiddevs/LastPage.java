package com.sample.pranesh.gd_androiddevs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class LastPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);
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
                Toast.makeText(LastPage.this,"Scroll View",Toast.LENGTH_SHORT).show();
                break;

            case R.id.SM_NextPage:
                Toast.makeText(LastPage.this,"Next Page",Toast.LENGTH_SHORT).show();
                break;
            case R.id.SM_PreviousPage:
                Intent prev = new Intent(LastPage.this,NavigationPage.class);
                startActivity(prev);
                break;
        }
        return true;
    }
}
