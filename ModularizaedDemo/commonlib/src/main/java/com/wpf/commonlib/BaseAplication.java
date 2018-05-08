package com.wpf.commonlib;

import android.app.Application;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by wangpengfei on 2018/5/8.
 */

public class BaseAplication extends Application{
    private static BaseAplication instance;
    public static BaseAplication getInstance(){
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        ARouter.openLog();     // 打印日志
        ARouter.openDebug();
        ARouter.init(this);
    }
    public void LogTest(){
        Log.e("wpf","commonlib test");
    }
}
