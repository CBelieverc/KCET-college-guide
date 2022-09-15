package com.example.mocktests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                String url11 = getIntent().getStringExtra("pdf_url11");
                Intent intent = new Intent(MainActivity3.this, Instructionspage.class);
                intent.putExtra("pdf_url111", url11);
                startActivity(intent);
            }
        }, 1500);
    }
}