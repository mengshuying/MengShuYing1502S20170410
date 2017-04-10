package com.example.administrator.mengshuying1502s20170410.adapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.administrator.mengshuying1502s20170410.R;
import com.example.administrator.mengshuying1502s20170410.bean.JsonBean;

import org.xutils.common.Callback;
import org.xutils.x;
import java.util.List;
/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
public class MyListAdapter extends BaseAdapter{
    private final Context mContext;
        private final List<JsonBean.ResultBean.DataBean> mComicsBeen;
        public MyListAdapter(Context context, List<JsonBean.ResultBean.DataBean> list){
             mContext =context;
             mComicsBeen =list;
         }
        @Override
        public int getCount(){
            return mComicsBeen.size();
        }
        @Override
        public Object getItem(int position){
            return mComicsBeen.get(position);
        }
        @Override
        public long getItemId(int position){
            return position;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            final ViewHolder viewHolder;
            if(convertView==null){
                convertView=View.inflate(mContext, R.layout.listview_layout,null);
                viewHolder=new ViewHolder();
                viewHolder.imageview= (ImageView) convertView.findViewById(R.id.imageview);
                viewHolder.textview1= (TextView) convertView.findViewById(R.id.textt1);
                viewHolder.textview2= (TextView) convertView.findViewById(R.id.textt2);
                convertView.setTag(viewHolder);
            }else{
                viewHolder= (ViewHolder) convertView.getTag();
            }
            viewHolder.textview1.setText(mComicsBeen.get(position).getAuthor_name());
            viewHolder.textview2.setText(mComicsBeen.get(position).getCategory());
            x.image().bind(viewHolder.imageview, mComicsBeen.get(position).getThumbnail_pic_s02(), new Callback.CacheCallback<Drawable>() {
                @Override
                public boolean onCache(Drawable result) {

                    return false;
                }
                @Override
                public void onSuccess(Drawable result) {
                    viewHolder.imageview.setImageDrawable(result);
                }

                @Override
                public void onError(Throwable ex, boolean isOnCallback) {

                }

                @Override
                public void onCancelled(CancelledException cex) {

                }

                @Override
                public void onFinished() {

                }
            });

            return convertView;
        }
        public class ViewHolder{
            ImageView imageview;
            TextView textview1;
            TextView textview2;
        }
}
