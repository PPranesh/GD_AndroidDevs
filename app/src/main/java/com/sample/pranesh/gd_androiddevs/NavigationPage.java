package com.sample.pranesh.gd_androiddevs;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class NavigationPage extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_page);

        tabLayout = (TabLayout)findViewById(R.id.NP_myTab);
        viewPager = (ViewPager)findViewById(R.id.NP_myView);

        viewPager.setAdapter(new MyFragmentAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    class MyFragmentAdapter extends FragmentPagerAdapter{

        String DataFragment[] = {"Logs","Calls","Contacts"};
        private MyFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            if(i == 0){
                return new Fragment1();
            }
            if(i == 1){
                return new Fragment2();
            }
            if(i == 2){
                return new Fragment3();
            }
            return null;
        }

        @Override
        public int getCount() {
            return DataFragment.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return DataFragment[position];
        }
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
                Toast.makeText(NavigationPage.this,"Navigation Page",Toast.LENGTH_SHORT).show();
                break;

            case R.id.SM_NextPage:
                Intent nxt = new Intent(NavigationPage.this,LastPage.class);
                startActivity(nxt);
                break;
            case R.id.SM_PreviousPage:
                Intent prev = new Intent(NavigationPage.this,InputChecks.class);
                startActivity(prev);
                break;
        }
        return true;
    }
}
