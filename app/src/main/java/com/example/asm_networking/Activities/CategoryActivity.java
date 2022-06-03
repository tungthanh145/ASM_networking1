package com.example.asm_networking.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.asm_networking.R;

public class CategoryActivity extends AppCompatActivity {
    CardView mxh, amnhac, trochoi, sach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        mxh = findViewById(R.id.mxh);
        amnhac = findViewById(R.id.amnhac);
        trochoi = findViewById(R.id.trochoi);
        sach = findViewById(R.id.sach);

        mxh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CategoryActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

        amnhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CategoryActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

        trochoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CategoryActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

        sach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CategoryActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }
}