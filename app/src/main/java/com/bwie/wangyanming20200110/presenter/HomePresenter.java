package com.bwie.wangyanming20200110.presenter;

import com.bwie.wangyanming20200110.base.BasePresenter;
import com.bwie.wangyanming20200110.contract.IHomeContract;
import com.bwie.wangyanming20200110.model.HomeModel;
import com.bwie.wangyanming20200110.model.bean.ShopBean;

/*
 *@auther:王彦敏
 *@Date: 2020/1/10
 *@Time:19:46
 *@Description:
 * */
public class HomePresenter extends BasePresenter<IHomeContract.IView> implements IHomeContract.IPresenter {

    private HomeModel homeModel;

    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }

    @Override
    public void getHomeData(String userId, String sessionId) {
        homeModel.getHomeData(userId, sessionId, new IHomeContract.IModel.IHomeCallback() {
            @Override
            public void onHomeSuccess(ShopBean shopBean) {
                view.onHomeSuccess(shopBean);
            }

            @Override
            public void onHomeFailure(Throwable throwable) {
                view.onHomeFailure(throwable);
            }
        });
    }
}
