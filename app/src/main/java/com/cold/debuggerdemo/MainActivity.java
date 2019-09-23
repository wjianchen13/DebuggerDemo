package com.cold.debuggerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Debug.waitForDebugger(); // 等待连接调试器，然后才继续运行后续代码
        int a = 1;
        int b = 2;
    }
}
