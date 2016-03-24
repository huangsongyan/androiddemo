package com.hubery.androiddemo.comment;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/3/24.
 */
public abstract class AppAdapter<T> extends CommomAdapter<T> {


    public AppAdapter(Context context) {
        super(context);
    }

    public AppAdapter(Context context, List<T> data){
        super(context,data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = ViewHolder.get(mContext,convertView,parent,getLayoytId(),position);
        convert(holder,(T)getItem(position));
        return holder.getConvertView();
    }

    public abstract @LayoutRes int getLayoytId();
}
