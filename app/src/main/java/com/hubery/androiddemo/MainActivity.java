package com.hubery.androiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.zxing.BarcodeFormat;
import com.hubery.androiddemo.comment.AppAdapter;
import com.hubery.androiddemo.comment.ViewHolder;
import com.hubery.androiddemo.ui.base.BaseActivity;
import com.hubery.androiddemo.jni.JniCore;
import com.hubery.androiddemo.jni.NdkDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.OnItemClick;

public class MainActivity extends BaseActivity {

    @Bind(R.id.demoListView)
    ListView mDemoListView;

    private String[] mData = {"ui","第三方库","NDK","自定义控件","沉浸式"};
    private List<String> mList;
    private BarcodeFormat format;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

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
            case 1:
                break;
            case 2:
                startActivity(new Intent(this, NdkDemo.class));
                return;
        }
        showToast(position+"");
    }
}
