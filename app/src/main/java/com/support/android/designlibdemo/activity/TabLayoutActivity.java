package com.support.android.designlibdemo.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import com.support.android.designlibdemo.R;


public class TabLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        initView();

    }

    private void initView() {
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("hahhaha1"));
        tabLayout.addTab(tabLayout.newTab().setText("hahhaha2"));
        tabLayout.addTab(tabLayout.newTab().setText("hahhaha3"));
        tabLayout.addTab(tabLayout.newTab().setText("hahhaha4"));
        tabLayout.addTab(tabLayout.newTab().setText("hahhaha5"));
        tabLayout.addTab(tabLayout.newTab().setText("hahhaha6"));
        tabLayout.addTab(tabLayout.newTab().setText("hahhaha7"));


    }
}
