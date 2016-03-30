package com.hubery.androiddemo.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.hubery.androiddemo.R;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/3/30.
 */
public class AppTitleActivity extends AppActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.layout_title,-1);
        FrameLayout statusBarLayout = (FrameLayout) findViewById(R.id.statusBarLayout);
        View statusBarView = new View(this);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,getStatusBarHeight(this));
        statusBarView.setLayoutParams(params);
        statusBarLayout.addView(statusBarView);
    }

    @Override
    public void setContentView(int layoutResID) {
        View v = getLayoutInflater().inflate(layoutResID, null);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mainLayout);
        frameLayout.addView(v);
        ButterKnife.bind(this);
    }

    public static int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }


}
