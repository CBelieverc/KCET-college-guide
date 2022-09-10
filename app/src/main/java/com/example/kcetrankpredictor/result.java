package com.example.kcetrankpredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    TextView textview14,textview16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textview14 = findViewById(R.id.textView14);
        textview16 = findViewById(R.id.textView16);

    }
}