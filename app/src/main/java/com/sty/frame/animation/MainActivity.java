package com.sty.frame.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView) findViewById(R.id.iv_pic);
        iv.setBackgroundResource(R.drawable.my_anim);
        AnimationDrawable ad =  (AnimationDrawable) iv.getBackground();
        ad.start();
    }
}
