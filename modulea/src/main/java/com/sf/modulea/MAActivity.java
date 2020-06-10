package com.sf.modulea;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sf.rootproject.BaseApp;

public class MAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbctivity);
    }

    public void goB(View view) {
        //跳转到B页面
        BaseApp.getBaseAppInstance().setRouterInterface(new BaseApp.RouterInterface() {
            @Override
            public void goCActivity(Class<? extends Activity> cla) {
                startActivity(new Intent(MAActivity.this, cla));
            }
        });
        BaseApp.getBaseAppInstance().getRouterInterface().goCActivity(Config.getConfigInstance().getActivityClass());
    }

}
