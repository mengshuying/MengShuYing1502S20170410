package com.example.administrator.mengshuying1502s20170410.adapter;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.administrator.mengshuying1502s20170410.fragement.TestFragment;
import java.util.List;
/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */
public class MyAdapter extends FragmentPagerAdapter{
    private String[] CONTENT=new String[]{"tt","shehui","gj","gn","yl","ty","js","ss","kj","cj"};
    private Context mContext;
    private List<Fragment> mFragments;

    public MyAdapter(FragmentManager fm,Context context, List<Fragment> list) {
        super(fm);
        mContext =context;
        mFragments =list;
    }
        @Override
        public Fragment getItem(int position){
            return TestFragment.newInstance(CONTENT[position % CONTENT.length]);
        }
        @Override
        public CharSequence getPageTitle(int position){
            return CONTENT[position % CONTENT.length].toUpperCase();
        }
        @Override
        public int getCount(){
            return CONTENT.length;
        }
    }

