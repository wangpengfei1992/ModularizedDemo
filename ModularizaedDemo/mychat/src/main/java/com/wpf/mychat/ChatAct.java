package com.wpf.mychat;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by wangpengfei on 2018/5/8.
 */
@Route(path = "/chat/ChatAct")
public class ChatAct extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_test_lay);
    }
}
