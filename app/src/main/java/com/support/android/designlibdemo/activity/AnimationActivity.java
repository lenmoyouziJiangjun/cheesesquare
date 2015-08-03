package com.support.android.designlibdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.support.android.designlibdemo.R;


public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
    }


    private void testAnimation() {
        final View oval = this.findViewById(R.id.img1);
//        oval.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Animator animator = ViewAnimationUtils.createCircularReveal(
//                        oval,
//                        oval.getWidth() / 2,
//                        oval.getHeight() / 2,
//                        oval.getWidth(),
//                        0);
//                animator.setInterpolator(new AccelerateDecelerateInterpolator());
//                animator.setDuration(2000);
//                animator.start();
//            }
//        });
//
//        final View rect = this.findViewById(R.id.img2);
//
//        rect.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Animator animator = ViewAnimationUtils.createCircularReveal(
//                        rect,
//                        0,
//                        0,
//                        0,
//                        (float) Math.hypot(rect.getWidth(), rect.getHeight()));
//                animator.setInterpolator(new AccelerateInterpolator());
//                animator.setDuration(2000);
//                animator.start();
//            }
//        });
    }


}
