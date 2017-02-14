package com.ultrapower.baidumap.map;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

import com.baidu.mapapi.map.MapView;
import com.ultrapower.baidumap.IMapViewActivity;
import com.ultrapower.baidumap.PMapViewActivity;
import com.ultrapower.baidumap.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MapViewActivity extends AppCompatActivity implements IMapViewActivity{

    PMapViewActivity pMapViewActivity;


    @Bind(R.id.mBaidu_map)
    MapView mBaiduMap;
    @Bind(R.id.btn_setLocation)
    ImageButton btnSetLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view);
        ButterKnife.bind(this);
        pMapViewActivity = new PMapViewActivity(this);
        initMapView();
    }

    public void initMapView() {
        mBaiduMap.showZoomControls(false);
    }

    @OnClick(R.id.btn_setLocation)
    public void onClick() {
    }


    @Override
    protected void onPause() {
        super.onPause();
        mBaiduMap.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mBaiduMap.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBaiduMap.onDestroy();
    }
}
