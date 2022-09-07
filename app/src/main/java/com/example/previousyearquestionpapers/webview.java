package com.example.previousyearquestionpapers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        Toast.makeText(this, "opening PDF ", Toast.LENGTH_SHORT).show();


        String url = getIntent().getStringExtra("pdf_url");
        WebView webview = findViewById(R.id.web);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setSupportZoom(true);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://docs.google.com/gview?embedded=true&url=" + url);

    }
}