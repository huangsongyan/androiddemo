package com.hubery.androiddemo.ui;

import android.os.Bundle;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.hubery.androiddemo.R;
import com.hubery.androiddemo.ui.base.AppActivity;
import com.hubery.androiddemo.ui.base.AppTitleActivity;
import com.hubery.androiddemo.utils.QRCodeUtils;

import butterknife.Bind;

/**
 * Created by Administrator on 2016/3/28.
 */
public class QRImage extends AppTitleActivity {

    @Bind(R.id.qrImage)
    ImageView qrImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr_image);
        qrImage.setImageBitmap(QRCodeUtils.createQRImage("hello", BarcodeFormat.QR_CODE,800));
    }
}
