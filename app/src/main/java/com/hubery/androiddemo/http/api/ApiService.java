package com.hubery.androiddemo.http.api;

import com.hubery.androiddemo.model.Feed;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/3/22.
 */
public interface ApiService {


//    @GET("/m/feeds?type={type}&types={types}&index={index}&pageSize={pageSize}")
//    Call<Feed> getFeeds (@Path("type") String type, @Path("types") String types, @Path("index") int index, @Path("pageSize") int pageSize);

    @GET("/m/feeds")
    Call<Feed> getFeeds(@Query("type") String type, @Query("types") String types, @Query("index") int index, @Query("pageSize") int pageSize);



    @GET("/m/feeds")
    Observable<Feed> getRxFeeds(@Query("type") String type, @Query("types") String types, @Query("index") int index, @Query("pageSize") int pageSize);


    @GET("users/{user}/repos")
    Call<List<Feed>> listRepos(@Path("user") String user);


    //post对象。,自动把对象转为json
    @POST("users/new")
    Call<Feed> createUser(@Body Feed user);

    //post key-value。表单
    @FormUrlEncoded
    @POST("user/edit")
    Call<Feed> updateUser(@Field("first_name") String first, @Field("last_name") String last);

    @Multipart
    @PUT("user/photo")
    Call<Feed> updateUser(@Part("photo") RequestBody photo, @Part("description") RequestBody description);

    @Headers("Cache-Control: max-age=640000")
    @GET("widget/list")
    Call<List<Feed>> widgetList();

    @Headers({
            "Accept: application/vnd.github.v3.full+json",
            "User-Agent: Retrofit-Sample-App"
    })
    @GET("users/{username}")
    Call<Feed> getUser(@Path("username") String username);


}
