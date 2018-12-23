package com.sample.pranesh.gd_androiddevs;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class InputChecks extends AppCompatActivity {

    CheckBox cb1, cb2;
    ToggleButton tg1;
    RadioButton rd1, rd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_checks);

        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        tg1 = (ToggleButton) findViewById(R.id.toggleButton);
        rd1 = (RadioButton) findViewById(R.id.radioButton1);
        rd2 = (RadioButton) findViewById(R.id.radioButton2);

        tg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tg1.isChecked()) {
                    Toast.makeText(InputChecks.this, "Toggle is ON", Toast.LENGTH_SHORT).show();
                    tg1.setBackgroundColor(getResources().getColor(R.color.darkGreen));
                } else {
                    Toast.makeText(InputChecks.this, "Toggle is off", Toast.LENGTH_SHORT).show();
                    tg1.setBackgroundColor(getResources().getColor(R.color.darkRed));
                }
            }
        });

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(InputChecks.this, "English is selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(InputChecks.this, "English is not selected", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(InputChecks.this, "Tamil is selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(InputChecks.this, "Tamil is not selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void dialog(View view) {
        ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle("Downloading!!");
        pd.setMessage("Please wait..");

        //styles of Progress Bar
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
//        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        pd.setCancelable(false);
        pd.show();
    }


    public void alertDialog(View view) {
        AlertDialog.Builder ab = new AlertDialog.Builder(this);
        ab.setTitle("Exit");
        ab.setMessage("Want to Exit ? ");
        ab.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        ab.setCancelable(false);
        ab.show();
    }


    public void radioclick(View view) {
        if ((rd1.isChecked()) || (rd2.isChecked())) {

//                if (rd1.isChecked()) {
//
//                    Toast.makeText(InputChecks.this, "Male Selected", Toast.LENGTH_SHORT).show();
            switch (view.getId()){
                case R.id.radioButton1:
                    Toast.makeText(InputChecks.this,"Male Selected",Toast.LENGTH_SHORT).show();
                    rd2.setChecked(false);
                    break;

                case R.id.radioButton2:
                    Toast.makeText(InputChecks.this,"Female Selected",Toast.LENGTH_SHORT).show();
                    rd1.setChecked(false);
                    break;
            }
        } else {
            Toast.makeText(InputChecks.this,"Radio button is not selected",Toast.LENGTH_SHORT).show();
//            rd1.setChecked(false);
//            rd2.setChecked(false);
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.overflow_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.m1:
                Toast.makeText(InputChecks.this,"Search Icon Selected",Toast.LENGTH_SHORT).show();
                break;

            case R.id.m2:
                Toast.makeText(InputChecks.this,"Settings Selected",Toast.LENGTH_SHORT).show();
                break;

            case R.id.m3:
                Intent prev = new Intent(InputChecks.this,DebugCheck.class);
                startActivity(prev);
                break;
            case R.id.m4:
                Intent nxt = new Intent(InputChecks.this,LastPage.class);
                startActivity(nxt);
                break;
        }

        return true;
    }

}
