package com.sample.pranesh.gd_androiddevs;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NavigationPage extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_page);

        tabLayout = (TabLayout)findViewById(R.id.myTab);
        viewPager = (ViewPager)findViewById(R.id.myView);

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
        public MyFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            if(i == 0){
                return new snap1_Fragment();
            }
            if(i == 1){
                return new snap2_Fragment();
            }
            if(i == 2){
                return new snap3_Fragment();
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
}
