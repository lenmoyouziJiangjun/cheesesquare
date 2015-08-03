package com.support.android.designlibdemo.activity;

import android.os.Bundle;
import android.support.v4.widget.ViewDragHelper;
import android.support.v7.app.AppCompatActivity;

import com.support.android.designlibdemo.R;

/**
 *
 */
public class ViewDrageActivity extends AppCompatActivity {

    private ViewDragHelper mDragHelper;
//    private ItemTouchHelper.ViewDropHandler mDropHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_drage);
    }


}
