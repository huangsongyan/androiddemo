package com.hubery.androiddemo.http;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/3/22.
 */
public class HttpApi {

    private static  HttpApi mHttpApi;
    private Retrofit mRetrofit;

    public static synchronized HttpApi getInstance(){
        if(mHttpApi == null){
            mHttpApi = new HttpApi();
        }
        return  mHttpApi;
    }

    public HttpApi(){
        mRetrofit = new Retrofit.Builder()
                .baseUrl(HttpConfigh.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(new OkHttpClient())
                .build();
    }

    public Retrofit getRetrofit(){
        return mRetrofit;
    }

}
