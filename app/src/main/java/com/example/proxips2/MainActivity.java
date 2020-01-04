package com.example.proxips2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        webView = (WebView) findViewById(R.id.webViewId);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://192.168.43.198:3000/view.html");



    }
}
