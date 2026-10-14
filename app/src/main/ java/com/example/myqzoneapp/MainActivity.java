package com.example.myqzoneapp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        webView = new WebView(this);
        // 开启 JavaScript，否则QQ登录页无法加载
        webView.getSettings().setJavaScriptEnabled(true);
        // 保持在应用内跳转
        webView.setWebViewClient(new WebViewClient());
        // 加载 QQ 空间登录页
        webView.loadUrl("https://i.qq.com/");
        setContentView(webView);
    }
}