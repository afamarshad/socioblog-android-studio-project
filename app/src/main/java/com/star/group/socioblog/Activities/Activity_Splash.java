package com.star.group.socioblog.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.star.group.socioblog.R;

public class Activity_Splash extends AppCompatActivity {

    private ImageView sp_img;
    private TextView sp_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        sp_img = findViewById(R.id.sp_imgvw);
        sp_tv = findViewById(R.id.sp_tv);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.splash_animation);
        sp_img.startAnimation(anim);
        sp_tv.startAnimation(anim);

        final Intent intent = new Intent(this, Activity_Login.class);

        Thread thr = new Thread(){
            public void run()
            {
                try{
                    sleep(5200);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        thr.start();
    }
}
