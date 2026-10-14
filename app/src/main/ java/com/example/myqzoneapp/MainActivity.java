package com.example.myqzoneapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            WebView webView = new WebView(this);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://i.qq.com/");
            setContentView(webView);
        } catch (Throwable e) {
            android.widget.TextView tv = new android.widget.TextView(this);
            tv.setText("App启动了，但WebView初始化失败：\n\n" + e.toString());
            tv.setTextSize(14);
            tv.setPadding(40, 40, 40, 40);
            setContentView(tv);
        }
    }
}