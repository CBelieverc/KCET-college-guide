package com.example.kcetmocktests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instructionspage extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructionspage);
        button = findViewById(R.id.button8);
    }

    public void openactivity3(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}