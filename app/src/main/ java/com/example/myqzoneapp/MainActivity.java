package com.example.myqzoneapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            // 尝试加载 WebView
            webView = new WebView(this);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setUserAgentString("Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.0.0 Mobile Safari/537.36");
            
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://i.qq.com/");
            
            setContentView(webView);
            
        } catch (Throwable e) {
            // 如果上面代码崩溃了，不闪退，而是把错误显示在屏幕上
            TextView errorTv = new TextView(this);
            errorTv.setText("App崩溃啦！错误信息如下：\n\n" + e.toString() + "\n\n" + e.getMessage());
            errorTv.setTextSize(14);
            errorTv.setPadding(40, 40, 40, 40);
            setContentView(errorTv);
        }
    }
}