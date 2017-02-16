package com.ultrapower.baidumap.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.baoyz.widget.PullRefreshLayout;
import com.ultrapower.baidumap.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @Bind(R.id.net_choose_head)
    ImageView netChooseHead;
    @Bind(R.id.swipeRefreshLayout)
    PullRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);


        swipeRefreshLayout.setOnRefreshListener(myPullLsitener);
        swipeRefreshLayout.setDurations(0,3);

    }

    PullRefreshLayout.OnRefreshListener myPullLsitener = new PullRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
//            swipeRefreshLayout.setRefreshing(false);
//            Toast.makeText(LoginActivity.this, "刷新", Toast.LENGTH_SHORT).show();
//            new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep(3000);
//                        swipeRefreshLayout.setRefreshing(false);
//                        swipeRefreshLayout.
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                        Log.e("错误",e+"");
//                    }
//                }
//            };
        }
    };

}
