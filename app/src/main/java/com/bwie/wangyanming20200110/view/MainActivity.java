package com.bwie.wangyanming20200110.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.bwie.wangyanming20200110.R;
import com.bwie.wangyanming20200110.base.BaseActivity;
import com.bwie.wangyanming20200110.contract.IHomeContract;
import com.bwie.wangyanming20200110.model.bean.ShopBean;
import com.bwie.wangyanming20200110.presenter.HomePresenter;

import java.util.List;

public class MainActivity extends BaseActivity<HomePresenter> implements IHomeContract.IView {

    @Override
    protected void initData() {
            mPresenter.getHomeData("13118","157865620384413118");
    }

    @Override
    protected void initView() {

    }

    @Override
    protected HomePresenter providePresenter() {
        return new HomePresenter();
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onHomeSuccess(ShopBean shopBean) {
        List<ShopBean.ResultBean> result = shopBean.getResult();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);


    }

    @Override
    public void onHomeFailure(Throwable throwable) {

    }
}
