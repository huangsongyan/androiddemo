package com.hubery.androiddemo.adapter;

import android.content.Context;

import com.hubery.androiddemo.R;
import com.hubery.androiddemo.comment.MultiItemAdapter;
import com.hubery.androiddemo.comment.ViewHolder;
import com.hubery.androiddemo.model.Feed;

import java.util.List;

/**
 * Created by Administrator on 2016/3/24.
 */
public class test2Adapter extends MultiItemAdapter<Feed> {

    private static final int Type =1;
    private static final int Type2 =2;

    public test2Adapter(Context context) {
        super(context);
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position, Feed feed) {
        if(feed.getTotal()>1){
            return Type;
        }else{
            return Type2;
        }
    }

    @Override
    public int getLayoytId(int position) {
        switch (getItemViewType(position)){
            case Type:
                return R.layout.activity_main;
            case Type2:
                return R.layout.activity_main;
            default:
                return -1;
        }
    }

    @Override
    public void convert(ViewHolder holder, Feed feed) {
        switch (holder.getLayoutId()){
            case R.layout.activity_main:
                //逻辑处理
                break;
        }
    }
}
