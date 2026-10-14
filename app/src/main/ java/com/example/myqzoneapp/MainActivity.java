package com.example.myqzoneapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // 动态创建一个纯文本视图，不依赖任何网络或网页组件
        TextView tv = new TextView(this);
        tv.setText("App启动成功！\n\n没有闪退！\n\n你的 Android 17 系统只是封锁了 WebView 网页组件。\n\n我们下一步绕过它！");
        tv.setTextSize(20);
        tv.setPadding(50, 50, 50, 50);
        setContentView(tv);
    }
}