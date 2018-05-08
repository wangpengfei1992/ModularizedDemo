package com.wpf.modularizaeddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.getInstance().LogTest();
        initView();
    }

    private void initView() {
        TextView testView = findViewById(R.id.app_main_test);
        testView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/chat/ChatAct").navigation();
            }
        });
    }
}
