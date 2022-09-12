package com.example.kcetmocktests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tryagainpage extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tryagainpage);

        textView = findViewById(R.id.textview);
    }
    public void openactivity4(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}