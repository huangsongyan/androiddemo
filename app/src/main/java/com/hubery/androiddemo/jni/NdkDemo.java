package com.hubery.androiddemo.jni;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.hubery.androiddemo.R;
import com.hubery.androiddemo.comment.AppAdapter;
import com.hubery.androiddemo.comment.ViewHolder;
import com.hubery.androiddemo.ui.base.BaseActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.OnItemClick;

/**
 * Created by Administrator on 2016/3/24.
 */
public class NdkDemo extends BaseActivity {


    @Bind(R.id.demoListView)
    ListView mDemoListView;

    private String[] mData = {"+","-","x","/"};
    private List<String> mList;

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
        showToast(JniCore.hello("asd"));
    }
}
