package com.example.asm_networking.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.asm_networking.R;

public class ScreenActivity extends AppCompatActivity {
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        progressBar = findViewById(R.id.progress_bar);

        progressBar.setMax(100);
        progressBar.setScaleY(3f);

        progressAnmation();
    }

    public void progressAnmation(){
        ProgressBarAnimation anim = new ProgressBarAnimation(this,progressBar,0f,100f);
        anim.setDuration(5000);
        progressBar.setAnimation(anim);
    }
}