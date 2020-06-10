package com.sf.rootproject;

import android.app.Activity;

public class BaseApp {

    private static BaseApp baseAppInstance;

    public static BaseApp getBaseAppInstance() {
        if (baseAppInstance == null) {
            synchronized (BaseApp.class) {
                if (baseAppInstance == null) {
                    baseAppInstance = new BaseApp();
                }
            }
        }
        return baseAppInstance;
    }

    private BaseApp() {

    }

    public interface RouterInterface{
        void goCActivity(Class<? extends Activity> cla);
    }

    private RouterInterface routerInterface;

    public RouterInterface getRouterInterface() {
        return routerInterface;
    }

    public void setRouterInterface(RouterInterface routerInterface) {
        this.routerInterface = routerInterface;
    }
}
