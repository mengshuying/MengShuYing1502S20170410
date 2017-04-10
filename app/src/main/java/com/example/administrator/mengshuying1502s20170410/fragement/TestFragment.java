package com.example.administrator.mengshuying1502s20170410.fragement;
/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.administrator.mengshuying1502s20170410.R;
import com.example.administrator.mengshuying1502s20170410.utils.MyHttpUtils;

import xlistview.bawei.com.xlistviewlibrary.XListView;

public final class TestFragment extends Fragment {
    private static final String KEY_CONTENT = "TestFragment:Content";
    public static TestFragment newInstance(String content){
        TestFragment fragment = new TestFragment();

        StringBuilder builder = new StringBuilder();
      //一定要加空格。
            builder.append(content).append(" ");
        builder.deleteCharAt(builder.length() - 1);
        fragment.mContent = builder.toString();

        return fragment;
    }
    private String mContent = "???";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if ((savedInstanceState != null) && savedInstanceState.containsKey(KEY_CONTENT)) {
            mContent = savedInstanceState.getString(KEY_CONTENT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragement1_layout,null);
        XListView mXListView = (XListView) view.findViewById(R.id.xlistview);
        MyHttpUtils utils=new MyHttpUtils(getActivity(),mXListView,mContent);
        utils.getURL();
        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_CONTENT, mContent);
    }
}

