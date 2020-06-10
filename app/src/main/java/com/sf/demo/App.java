package com.sf.demo;

import android.util.Log;

import com.sf.modulea.Config;
import com.sf.moduleb.MBActivity;
import com.sf.rootproject.BaseApplication;

public class App extends BaseApplication {

    private static final String TAG = "App";

    @Override
    public void onCreate() {
        super.onCreate();

        initBaseRouter();

        Log.i(TAG, "APP的application开始执行");
    }

    private void initBaseRouter() {
        Config.getConfigInstance().setActivityClass(MBActivity.class);
    }

}
