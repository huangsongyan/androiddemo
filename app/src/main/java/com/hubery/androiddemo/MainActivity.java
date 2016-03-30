package com.hubery.androiddemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.zxing.BarcodeFormat;
import com.hubery.androiddemo.comment.AppAdapter;
import com.hubery.androiddemo.comment.ViewHolder;
import com.hubery.androiddemo.thread.ThreadPoolManager;
import com.hubery.androiddemo.ui.DrawView;
import com.hubery.androiddemo.ui.QRImage;
import com.hubery.androiddemo.ui.base.AppActivity;
import com.hubery.androiddemo.jni.NdkDemo;
import com.hubery.androiddemo.ui.base.AppTitleActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class MainActivity extends AppTitleActivity {

    @Bind(R.id.demoListView)
    ListView mDemoListView;
    @Bind(R.id.mainLayout)
    FrameLayout mMainLayout;

    private String[] mData = {"ui","第三方库","NDK","自定义控件","沉浸式","Draw"};
    private List<String> mList;
    private BarcodeFormat format;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        View statusBarView = new View(this);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,getStatusBarHeight(this));
        statusBarView.setLayoutParams(params);
        mMainLayout.addView(statusBarView);*/
        initData();
        new ThreadPoolManager(10).test2();
    }

//    public static int getStatusBarHeight(Context context) {
//        int result = 0;
//        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
//        if (resourceId > 0) {
//            result = context.getResources().getDimensionPixelSize(resourceId);
//        }
//        return result;
//    }

    @Override
    protected void initData() {
        super.initData();
        mList = new ArrayList<>();
        mList = Arrays.asList(mData);
        mDemoListView.setAdapter(new AppAdapter<String>(this,mList) {

            @Override
            public void convert(ViewHolder holder, String s) {
                TextView tv = holder.getView(android.R.id.text1);
                tv.setText(s);
            }

            @Override
            public int getLayoytId() {
                return android.R.layout.simple_list_item_1;
            }
        });
    }

    @OnItemClick(R.id.demoListView)
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(this, QRImage.class));
            case 1:
                break;
            case 2:
                startActivity(new Intent(this, NdkDemo.class));
                return;
            case 4:
                startActivity(new Intent(this, NdkDemo.class));
                break;
            case 5:
                startActivity(new Intent(this, DrawView.class));
                break;
        }
        showToast(position+"");
    }
}
