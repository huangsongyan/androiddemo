package com.hubery.androiddemo.app;

import android.app.Application;
import android.support.multidex.MultiDex;

/**
 * Created by Administrator on 2016/3/22.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }
}
