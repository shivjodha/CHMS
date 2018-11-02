package com.example.droid.chms;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        StartAnimations();

        Thread thread = new Thread(){

            @Override
            public void run() {
                try {

                    sleep(3000);

                }catch (Exception e){
                    e.printStackTrace();
                }
                finally {

                    Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
                    startActivity(intent);
                    finish();

                }


            }

        };thread.start();
    }



    private void StartAnimations() {

        ImageView l=(ImageView) findViewById(R.id.logo);
        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this,
                R.anim.fadein);
        l.startAnimation(hyperspaceJumpAnimation);


    }


}
