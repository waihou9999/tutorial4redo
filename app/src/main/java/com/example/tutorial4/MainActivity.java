package com.example.tutorial4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    AnimationDrawable frameAnimation;

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) frameAnimation.start(); // Start the animation when in Focus
        else frameAnimation.stop(); // and stop it when not in Focus
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView view = (ImageView) findViewById(R.id.animationImg);
        Button playBtn = (Button) findViewById(R.id.playBtn);
        Button stopBtn = (Button) findViewById(R.id.stopBtn);

        playBtn.setBackgroundColor(getApplication().getResources().getColor(R.color.black));
        stopBtn.setBackgroundColor(getApplication().getResources().getColor(R.color.black));



        view.setBackgroundResource(R.drawable.animation_list);

        frameAnimation = (AnimationDrawable) view.getBackground();

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameAnimation.start();
            }
        });


        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameAnimation.stop();
            }
        });
    }
}






