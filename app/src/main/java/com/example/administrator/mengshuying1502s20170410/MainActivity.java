package com.example.administrator.mengshuying1502s20170410;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.administrator.mengshuying1502s20170410.adapter.MyAdapter;
import org.xutils.view.annotation.ContentView;
import org.xutils.x;
import java.util.ArrayList;
import java.util.List;
@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mTextview1;
    private TextView mTextview2;
    private TextView mTextview3;
    private TextView mTextview4;
    private TextView mTextview5;
    private TextView mTextview6;
    private TextView mTextview7;
    private TextView mTextview8;
    private TextView mTextview9;
    private TextView mTextview10;
    private ViewPager mViewpager;
    private TextView[] mArr;
    private List<Fragment> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        x.view().inject(this);
        init();
        adapter();
    }
    private void init() {
        mTextview1 = (TextView) findViewById(R.id.textview1);
        mTextview2 = (TextView) findViewById(R.id.textview2);
        mTextview3 = (TextView) findViewById(R.id.textview3);
        mTextview4 = (TextView) findViewById(R.id.textview4);
        mTextview5 = (TextView) findViewById(R.id.textview5);
        mTextview6 = (TextView) findViewById(R.id.textview6);
        mTextview7 = (TextView) findViewById(R.id.textview7);
        mTextview8 = (TextView) findViewById(R.id.textview8);
        mTextview9 = (TextView) findViewById(R.id.textview9);
        mTextview10 = (TextView) findViewById(R.id.textview10);
        mArr = new TextView[]{mTextview1,mTextview2,mTextview3,mTextview4,mTextview5,mTextview6,mTextview7,mTextview8,mTextview9,mTextview10};
        mTextview1.setOnClickListener(this);
        mTextview2.setOnClickListener(this);
        mTextview3.setOnClickListener(this);
        mTextview4.setOnClickListener(this);
        mTextview5.setOnClickListener(this);
        mTextview6.setOnClickListener(this);
        mTextview7.setOnClickListener(this);
        mTextview8.setOnClickListener(this);
        mTextview9.setOnClickListener(this);
        mTextview10.setOnClickListener(this);
        mArr[0].setTextColor(Color.RED);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.textview1:
                mViewpager.setCurrentItem(0);
                bian(0);
                break;
            case R.id.textview2:
                mViewpager.setCurrentItem(1);
                bian(1);
                break;
            case R.id.textview3:
                mViewpager.setCurrentItem(2);
                bian(2);
                break;
            case R.id.textview4:
                mViewpager.setCurrentItem(3);
                bian(3);
                break;
            case R.id.textview5:
                mViewpager.setCurrentItem(4);
                bian(4);
                break;
            case R.id.textview6:
                mViewpager.setCurrentItem(5);
                bian(5);
                break;
            case R.id.textview7:
                mViewpager.setCurrentItem(6);
                bian(6);
                break;
            case R.id.textview8:
                mViewpager.setCurrentItem(7);
                bian(7);
                break;
            case R.id.textview9:
                mViewpager.setCurrentItem(8);
                bian(8);
                break;
            case R.id.textview10:
                mViewpager.setCurrentItem(9);
                bian(9);
                break;
        }
    }
      public void bian(int index){
          for(int i=0;i<mArr.length;i++){
             if(i==index){
                 mArr[i].setTextColor(Color.RED);
             }else{
                 mArr[i].setTextColor(Color.BLACK);
             }
          }
      }
    public void adapter(){
        mViewpager = (ViewPager) findViewById(R.id.viewpager);
        mViewpager.setAdapter(new MyAdapter(getSupportFragmentManager(),MainActivity.this,mList));
        mViewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {
                bian(position);
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }
}
