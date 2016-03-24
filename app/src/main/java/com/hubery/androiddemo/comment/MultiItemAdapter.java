package com.hubery.androiddemo.comment;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/3/24.
 */
public abstract class MultiItemAdapter<T> extends CommomAdapter<T> {

    public MultiItemAdapter(Context context) {
        super(context);
    }

    @Override
    public abstract int getViewTypeCount();

    @Override
    public int getItemViewType(int position) {
        return getItemViewType(position,mDatas.get(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = ViewHolder.get(mContext,convertView,parent,getLayoytId(position),position);
        convert(holder,(T)getItem(position));
        return holder.getConvertView();
    }

    public abstract int getItemViewType(int position, T t);

    public abstract @LayoutRes int getLayoytId(int position);
}
