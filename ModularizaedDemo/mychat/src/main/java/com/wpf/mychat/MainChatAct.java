package com.wpf.mychat;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wpf.commonlib.BaseAplication;

/**
 * Created by wangpengfei on 2018/5/8.
 */

public class MainChatAct extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BaseAplication.getInstance().LogTest();
    }
}
