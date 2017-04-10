package com.example.administrator.mengshuying1502s20170410.utils;
import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import org.xutils.x;
/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
public class MyApplication extends Application{
    @Override
    public void onCreate(){
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(false); //输出debug日志，开启会影响性能

    }
}
