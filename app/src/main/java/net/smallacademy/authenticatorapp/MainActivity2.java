package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    //ActivityMainBinding binding
    boolean doubleBackToExitPressedOnce = false;
    private long pressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView colle = findViewById(R.id.person);
        colle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent12);
                finish();
            }
        });

        Button colleBTN = findViewById(R.id.test);
        colleBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), prev.class);
                startActivity(intent1);
                finish();
            }
        });

        TextView prevqp = findViewById(R.id.previous);
        prevqp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), prev.class);
                startActivity(intent1);
                finish();
            }
        });


        Button rankbtn = findViewById(R.id.rank);
        rankbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Rank_Predict.class);
                startActivity(intent);

            }
        });
        Button button = findViewById(R.id.collegeBTN);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), collegeList.class);
                startActivity(intent);
            }
        });
        ImageView back_btn = findViewById(R.id.null1);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);
                finish();
            }
        });


    }

    @Override
    public void onBackPressed() {

        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finishAffinity();
            System.exit(0);
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }
}

