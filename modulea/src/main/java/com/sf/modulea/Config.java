package com.sf.modulea;

import android.app.Activity;

public class Config {

    private Class<? extends Activity> activityClass;
    private static Config configInstance;

    public static Config getConfigInstance() {
        if (configInstance == null) {
            synchronized (Config.class) {
                configInstance = new Config();
            }
        }
        return configInstance;
    }

    private Config() {

    }

    Class<? extends Activity> getActivityClass() {
        return activityClass;
    }

    public void setActivityClass(Class<? extends Activity> activityClass) {
        this.activityClass = activityClass;
    }

}
