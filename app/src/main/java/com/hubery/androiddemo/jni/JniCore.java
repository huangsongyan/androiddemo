package com.hubery.androiddemo.jni;

/**
 * Created by Administrator on 2016/3/25.
 */
public class JniCore {

    static {
        System.loadLibrary("myjni");
    }

    public static native String add();

    public static native String hello(String str);

}
