package com.sf.rootproject;

import android.app.Application;
import android.util.Log;

public class BaseApplication extends Application {

    private static final String TAG = "BaseApplication";

    @Override
    public void onCreate() {
        super.onCreate();

        Log.i(TAG, "RootApplication 开始执行了");
    }
}
