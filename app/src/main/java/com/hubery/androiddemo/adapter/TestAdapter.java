package com.hubery.androiddemo.adapter;

import android.content.Context;

import com.hubery.androiddemo.comment.AppAdapter;
import com.hubery.androiddemo.comment.ViewHolder;
import com.hubery.androiddemo.model.Feed;

import java.util.List;

/**
 * Created by Administrator on 2016/3/24.
 */
public class TestAdapter extends AppAdapter<Feed> {


    public TestAdapter(Context context, List<Feed> list){
        super(context,list);
    }

    @Override
    public int getLayoytId() {
        return 0;
    }

    @Override
    public void convert(ViewHolder holder, Feed feed) {

    }
}
