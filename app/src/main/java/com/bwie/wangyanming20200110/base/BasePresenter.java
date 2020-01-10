package com.bwie.wangyanming20200110.base;

/*
 *@auther:王彦敏
 *@Date: 2020/1/10
 *@Time:19:42
 *@Description:
 * */
public abstract class BasePresenter<V> {
    protected V view;

    public BasePresenter() {
        initModel();
    }

    protected abstract void initModel();

    public void attach(V view){
        this.view=view;
    }

    public void detach(){
        view=null;
    }
}
