package com.hubery.androiddemo.utils;

import android.util.Log;

import com.hubery.androiddemo.http.HttpApi;
import com.hubery.androiddemo.http.api.ApiService;
import com.hubery.androiddemo.model.Feed;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/3/24.
 */
public class RetrofitUtils {

    public void test(){
        Retrofit retrofit = HttpApi.getInstance().getRetrofit();
        ApiService apiService = retrofit.create(ApiService.class);
        Call<Feed> call = apiService.getFeeds("home","",0,20);
        call.enqueue(new Callback<Feed>() {
            @Override
            public void onResponse(Call<Feed> call, Response<Feed> response) {
                Feed feed = response.body();
                Log.v("feed",feed.getTotal()+"");

            }

            @Override
            public void onFailure(Call<Feed> call, Throwable t) {
                Log.v("feed","FAIL");
            }
        });

     /* RxJava 的观察者模式
        RxJava 有四个基本概念：Observable (可观察者，即被观察者)、 Observer (观察者)、
        subscribe (订阅)、事件。Observable 和 Observer 通过 subscribe() 方法实现订阅关系，
        从而 Observable 可以在需要的时候发出事件来通知 Observer。*/
        apiService.getRxFeeds("home","",0,20)
                //消费订阅操作在新的线程,io线程
       /* Schedulers.newThread(): 总是启用新线程，并在新线程执行操作。
        Schedulers.io(): I/O 操作（读写文件、读写数据库、网络信息交互等）所使用的 Scheduler。
        行为模式和 newThread() 差不多，区别在于 io() 的内部实现是是用一个无数量上限的线程池，
        可以重用空闲的线程，因此多数情况下 io() 比 newThread() 更有效率。不要把计算工作放在 io() 中，可以避免创建不必要的线程。*/
                .subscribeOn(Schedulers.io())
                //.subscribeOn(Schedulers.newThread())
                //回调在主线程
                .observeOn(AndroidSchedulers.mainThread())
                //订阅观察者
                .subscribe(new Subscriber<Feed>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.v("feed2","FAIL");
                    }

                    @Override
                    public void onNext(Feed feed) {
                        Log.v("feed2",feed.getTotal()+"");
                    }
                });
//        MediaType mediaType = MediaType.parse("image/jpg");
//        RequestBody requestBody = RequestBody.create(mediaType, new File("."));
//       // RequestBody pic = RequestBody.create();
//        apiService.updateUser(requestBody,requestBody);

//        ImageView imageView = new ImageView(this);
//        Glide.with(this)
//                .load("http://inthecheesefactory.com/uploads/source/glidepicasso/cover.jpg")
//                .into(imageView);
    }
}
