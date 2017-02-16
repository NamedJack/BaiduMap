package com.ultrapower.baidumap.location;

import android.content.Context;

import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;

/**
 * Created by Administrator on 2017/2/15.
 */

public class BaiduLocationUtil {
    private LocationClient locationClient;
    private static BaiduLocationUtil baiduLocationUtil;

    public static BaiduLocationUtil getInstance(){
        if(baiduLocationUtil == null){
            synchronized (BaiduLocationUtil.class){
                if(baiduLocationUtil == null){
                    baiduLocationUtil = new BaiduLocationUtil();
                }
            }
        }
        return baiduLocationUtil;
    }

    public void getLocation(Context context, BDLocationListener locationListener){
        locationClient = new LocationClient(context);
        LocationClientOption option = new LocationClientOption();
        option.setOpenGps(true);
        option.setCoorType("bd09ll"); // 设置返回值的坐标类型。
//        option.setPriority(LocationClientOption.NetWorkFirst); // 设置定位优先级
        option.setScanSpan(3000); // 设置发起定位请求的间隔时间为3000ms
        option.setIsNeedAddress(true);
        option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);
        locationClient.setLocOption(option);
        locationClient.registerLocationListener(locationListener);

        locationClient.start();

    }

    public void unRegister(BDLocationListener locationListener){
        locationClient.stop();
        locationClient.unRegisterLocationListener(locationListener);
    }
}
