package com.example.administrator.mengshuying1502s20170410.utils;
import android.content.Context;
import android.util.Log;

import com.example.administrator.mengshuying1502s20170410.adapter.MyListAdapter;
import com.example.administrator.mengshuying1502s20170410.bean.JsonBean;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.List;

import xlistview.bawei.com.xlistviewlibrary.XListView;
/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
public class MyHttpUtils{
    private final Context mContext;
    private final XListView mXListView;
    private final String mString;
    public MyHttpUtils(Context context, XListView xlistview,String stt){
        mContext =context;
        mXListView =xlistview;
        mString =stt;
    }
    public void getURL(){
        RequestParams params = new RequestParams(MyUrl.url);
        params.addQueryStringParameter("uri",mString);
        Log.i("zzz",params.toString());
        x.http().get(params, new Callback.CommonCallback<String>(){
            @Override
            public void onSuccess(String result){
                //解析result
                Log.i("zzz",result.toString());
                MyGson mygson=new MyGson();
                List<JsonBean.ResultBean.DataBean> getdata = mygson.getdata(result);
                MyListAdapter adapter=new MyListAdapter(mContext,getdata);
                mXListView.setAdapter(adapter);
            }
            //请求异常后的回调方法
            @Override
            public void onError(Throwable ex, boolean isOnCallback){
            }
            //主动调用取消请求的回调方法
            @Override
            public void onCancelled(CancelledException cex){
            }
            @Override
            public void onFinished(){
            }
        });
    }

}
