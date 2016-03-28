package com.hubery.androiddemo.thread;

import com.hubery.androiddemo.widget.AppLog;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2016/3/28.
 */
public class ThreadPoolManager {

    int index;
    /**线程池*/
    private ExecutorService mThreadPool;

    public ThreadPoolManager(int poolSize){

        mThreadPool = Executors.newFixedThreadPool(poolSize);
    }

    public void test(Runnable runnable){
        mThreadPool.execute(runnable);
    }

    public void stop(){
        mThreadPool.shutdown();
    }

    public void test2(){
        for (int i = 0; i<10;i++){
            index = i;
            test(new Runnable() {
                @Override
                public void run() {
                    AppLog.getInstance().v(""+ index);
                }
            });
        }
    }
}
