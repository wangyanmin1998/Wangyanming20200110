package com.bwie.wangyanming20200110.model;

import com.bwie.wangyanming20200110.contract.IHomeContract;
import com.bwie.wangyanming20200110.util.NetUtil;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/*
 *@auther:王彦敏
 *@Date: 2020/1/10
 *@Time:19:46
 *@Description:
 * */
public class HomeModel implements IHomeContract.IModel {


    @Override
    public void getHomeData(String userId, String sessionId, IHomeCallback iHomeCallback) {
        NetUtil.getInstance().getApi().getHomeData("13118","157865620384413118")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe();
    }
}
