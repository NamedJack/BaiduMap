package com.ultrapower.baidumap.map;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;
import com.weavey.loading.lib.LoadingLayout;

/**
 * Created by Administrator on 2017/2/14.
 */

public class LocationApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());

        LoadingLayout.getConfig()
                .setErrorText("出错啦 ~ 请稍后重试")
                .setEmptyText("抱歉，暂无数据")
                .setNoNetworkText("无网络连接，请检查你的网络设置")
                .setAllTipTextSize(14)
                .setReloadButtonText("点我重试")
                .setReloadButtonTextSize(14)
                .setReloadButtonWidthAndHeight(150,40);
    }
}
