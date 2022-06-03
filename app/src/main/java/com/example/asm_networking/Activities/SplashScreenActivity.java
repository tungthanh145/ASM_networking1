package com.example.asm_networking.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.asm_networking.R;

public class SplashScreenActivity extends AppCompatActivity {
    private static int splash_timeout = 000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, ScreenActivity.class);
                startActivity(i);
                finish();
            }
        },splash_timeout);
    }
}