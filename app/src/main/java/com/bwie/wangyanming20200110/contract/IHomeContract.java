package com.bwie.wangyanming20200110.contract;

import com.bwie.wangyanming20200110.model.bean.ShopBean;

/*
 *@auther:王彦敏
 *@Date: 2020/1/10
 *@Time:19:38
 *@Description:
 * */
public interface IHomeContract {
    interface IView{
        void  onHomeSuccess(ShopBean shopBean);
        void  onHomeFailure(Throwable throwable);
    }
    interface IPresenter{
        void getHomeData(String userId,String sessionId);
    }
    interface IModel{
        void getHomeData(String userId,String sessionId,IHomeCallback iHomeCallback);
        interface IHomeCallback{
            void  onHomeSuccess(ShopBean shopBean);
            void  onHomeFailure(Throwable throwable);
        }
    }
}
