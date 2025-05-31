package com.oo76.stu;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true); // فعال کردن جاوااسکریپت در صورت نیاز
        webView.setWebViewClient(new WebViewClient()); // باز شدن لینک‌ها داخل اپ
        webView.loadUrl("https://www.google.com");
    }
}