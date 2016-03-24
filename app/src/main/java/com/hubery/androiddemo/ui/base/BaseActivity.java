package com.hubery.androiddemo.ui.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.hubery.androiddemo.R;
import com.hubery.androiddemo.widget.AppToast;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/3/22.
 */
public class BaseActivity extends AppCompatActivity{

    private static final int IN_RIGHT_TO_LEFT = 0x00;
    private static final int IN_BOTTOM_TO_TOP = 0x01;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    protected void initView(){

    }

    protected void initData(){

    }

    protected void showToast(String text){
        AppToast.showToast(this,text);
    }

    protected void showToast(int resourceId){
        AppToast.showToast(this,resourceId);
    }

    @Override
    public void startActivity(Intent intent) {
        // TODO Auto-generated method stub
        super.startActivity(intent);
        overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
    }

    @Override
    public void finish() {
        // TODO Auto-generated method stub
        super.finish();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

    protected void startActivity(Intent intent, int flag) {
        super.startActivity(intent);
        switch (flag) {

            case IN_RIGHT_TO_LEFT:
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case IN_BOTTOM_TO_TOP:
                overridePendingTransition(R.anim.abc_slide_in_bottom,
                        R.anim.abc_slide_out_top);
            default:
                break;
        }
    }
}
