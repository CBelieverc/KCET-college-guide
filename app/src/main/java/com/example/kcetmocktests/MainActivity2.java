package com.example.kcetmocktests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.button5);
        button = findViewById(R.id.button6);
        button = findViewById(R.id.button7);
    }
    public void openactivity1(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}