package com.hubery.androiddemo.widget;

/**
 * Created by Administrator on 2016/3/24.
 */

import android.util.Log;

import com.hubery.androiddemo.BuildConfig;

/**
 * 全局Log类，用于合理控制LOG，便于debug和release 只查看通过HsyLog打出来的log的命令是，adb logcat -s HsyLog
 * 如果用的不是单例的HsyLog，只查看通过HsyLog打出来的日志需要结合实例HsyLog时的TAG 就像这样，adb logcat -s TAG
 *
 * @author huangsy
 * @date 创建时间：2015年8月6日 上午11:48:22
 * @version 1.0
 */

public class AppLog {
    // release版本时，记得把不必要的log关闭
    public static boolean ENABLE_DEBUG = BuildConfig.DEBUG;
    public static boolean ENABLE_INFO = BuildConfig.DEBUG;
    public static boolean ENABLE_ERROR = BuildConfig.DEBUG;
    public static boolean ENABLE_WARN = BuildConfig.DEBUG;
    public static boolean ENABLE_VERBOSE = BuildConfig.DEBUG;

    private static AppLog instance = null;

    public static AppLog getInstance() {
        if (instance == null) {
            instance = new AppLog("HsyLog");
        }
        return instance;
    }

    public AppLog(String tag) {
        if (tag == null) {
            throw new NullPointerException("tag non-null");
        }
        this.tag = tag;
    }

    private String tag = "HsyLog";


    public void debug(String msg) {
        if (ENABLE_DEBUG) {
            Log.d(tag, msg);
        }
    }

    public void debug(String msg, Object... args) {
        if (ENABLE_DEBUG) {
            Log.d(tag, String.format(msg, args));
        }
    }

    public void debug(Throwable err, String msg, Object... args) {
        if (ENABLE_DEBUG) {
            Log.d(tag, String.format(msg, args), err);
        }
    }

    public void d(String msg) {
        if (ENABLE_DEBUG) {
            Log.d(tag, msg);
        }
    }

    public void d(String msg, Object... args) {
        if (ENABLE_DEBUG) {
            Log.d(tag, String.format(msg, args));
        }
    }

    public void d(Throwable err, String msg, Object... args) {
        if (ENABLE_DEBUG) {
            Log.d(tag, String.format(msg, args), err);
        }
    }

    public void i(String msg) {
        if (ENABLE_INFO) {
            Log.i(tag, msg);
        }
    }

    public void i(String msg, Object... args) {
        if (ENABLE_INFO) {
            Log.i(tag, String.format(msg, args));
        }
    }

    public void i(Throwable err, String msg, Object... args) {
        if (ENABLE_INFO) {
            Log.i(tag, String.format(msg, args), err);
        }
    }

    public void w(String msg) {
        if (ENABLE_WARN) {
            Log.w(tag, msg);
        }
    }

    public void w(String msg, Object... args) {
        if (ENABLE_WARN) {
            Log.w(tag, String.format(msg, args));
        }
    }

    public void w(Throwable err, String msg, Object... args) {
        if (ENABLE_WARN) {
            Log.w(tag, String.format(msg, args), err);
        }
    }

    public void e(String msg) {
        if (ENABLE_ERROR) {
            Log.e(tag, msg);
        }
    }

    public void e(String msg, Object... args) {
        if (ENABLE_ERROR) {
            Log.e(tag, String.format(msg, args));
        }
    }

    public void e(Throwable err, String msg, Object... args) {
        if (ENABLE_ERROR) {
            Log.e(tag, String.format(msg, args), err);
        }
    }

    public void v(String msg) {
        if (ENABLE_VERBOSE) {
            Log.v(tag, msg);
        }
    }

    public void v(String msg, Object... args) {
        if (ENABLE_VERBOSE) {
            Log.v(tag, String.format(msg, args));
        }
    }

    public void v(Throwable err, String msg, Object... args) {
        if (ENABLE_VERBOSE) {
            Log.v(tag, String.format(msg, args), err);
        }
    }
}
