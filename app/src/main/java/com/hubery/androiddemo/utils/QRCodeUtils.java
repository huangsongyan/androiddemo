package com.hubery.androiddemo.utils;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

/**
 * Created by Administrator on 2016/3/28.
 */
public class QRCodeUtils {

    private static final int WHITE = 0xFFFFFFFF;
    private static final int BLACK = 0xFF000000;

    public static Bitmap createQRImage(String contents, BarcodeFormat format,int size){
        try {
            BitMatrix result = new MultiFormatWriter().encode(contents,format,size,size);
            int width = result.getWidth();
            int height = result.getHeight();
            int[] pixels = new int[width * height];
            //遍历每一行
            for (int y = 0; y < height; y++) {
                int offset = y * width;
                for (int x = 0; x < width; x++) {
                    pixels[offset + x] = result.get(x, y) ? BLACK : WHITE;
                }
            }
            Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmap.setPixels(pixels, 0, width, 0, 0, width, height);
            return bitmap;
        } catch (WriterException e) {
            e.printStackTrace();
        }
        return null;
    }
}
