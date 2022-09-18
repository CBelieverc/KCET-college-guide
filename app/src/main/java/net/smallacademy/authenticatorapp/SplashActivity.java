package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                String url11 = getIntent().getStringExtra("pdf_url11");
                Intent intent = new Intent(SplashActivity.this, MainActivity2.class);
                intent.putExtra("pdf_url111", url11);
                startActivity(intent);
            }
        }, 4000);
    }
}