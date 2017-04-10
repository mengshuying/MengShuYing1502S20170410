package com.example.administrator.mengshuying1502s20170410.utils;
import com.example.administrator.mengshuying1502s20170410.bean.JsonBean;
import com.google.gson.Gson;
import java.util.List;
/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
public class MyGson {
   public List<JsonBean.ResultBean.DataBean> getdata(String stt){
      Gson gson=new Gson();
       JsonBean jsonBean = gson.fromJson(stt, JsonBean.class);
       List<JsonBean.ResultBean.DataBean> data = jsonBean.getResult().getData();
       return data;
   }
}
