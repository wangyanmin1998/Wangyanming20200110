package com.bwie.wangyanming20200110.model;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;

/*
 *@auther:王彦敏
 *@Date: 2020/1/10
 *@Time:19:48
 *@Description:
 * */
public interface Api {

    @GET("small/order/verify/v1/findShoppingCart")
    Observable getHomeData(@Header("userId")String userId,@Header("sessionId")String sessionId);

}
