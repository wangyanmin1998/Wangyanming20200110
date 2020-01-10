package com.bwie.wangyanming20200110.util;

import com.bwie.wangyanming20200110.model.Api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/*
 *@auther:王彦敏
 *@Date: 2020/1/10
 *@Time:19:51
 *@Description:
 * */
public class NetUtil {
    private static final String  BASE_URL="http://172.17.8.100/";
    private final Api api;

    private NetUtil() {
        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient=new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .addInterceptor(httpLoggingInterceptor)
                .build();

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        api = retrofit.create(Api.class);
    }

    public static NetUtil getInstance() {
        return GsonData.NET_UTIL;
    }

    private static final class GsonData{
        private static final NetUtil NET_UTIL=new NetUtil();

    }

    public Api getApi() {
        return api;
    }
}
