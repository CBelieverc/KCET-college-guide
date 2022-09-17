package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class collegeList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_list);
        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fin = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(fin);

            }
        });
    }

    public void open1(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);


    }

    public void open2(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://manipal.edu/mit.html"));
        startActivity(browser);


    }

    public void open3(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vtu.ac.in/en/student"));
        startActivity(browser);


    }

    public void open4(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.msruas.ac.in"));
        startActivity(browser);


    }

    public void open5(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iiitb.ac.in\n"));
        startActivity(browser);


    }

    public void open6(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rvce.edu.in"));
        startActivity(browser);


    }

    public void open7(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bmsce.ac.in"));
        startActivity(browser);


    }

    public void open8(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://collegedunia.com/college/15126-siddaganga-institute-of-technology-sit-tumkur"));
        startActivity(browser);


    }

    public void open9(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://newhorizonindia.edu/nhengineering\n"));
        startActivity(browser);


    }

    public void open10(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://onlinejain.com/programs/apply-now"));
        startActivity(browser);


    }

    public void open11(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dsu.edu.in"));
        startActivity(browser);


    }

    public void open12(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nmit.ac.in/"));
        startActivity(browser);


    }

    public void open13(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://jssstuniv.in\n"));
        startActivity(browser);


    }

    public void open14(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nmamit.nitte.edu.in/"));
        startActivity(browser);


    }

    public void open15(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kleit.ac.in"));
        startActivity(browser);


    }

    public void open16(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pes.edu"));
        startActivity(browser);


    }

    public void open17(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alliance.edu.in"));
        startActivity(browser);


    }

    public void open18(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bmsit.ac.in"));
        startActivity(browser);


    }

    public void open19(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nie.ac.in"));
        startActivity(browser);


    }

    public void open20(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bnmit.org"));
        startActivity(browser);


    }
}


