package net.yaly.viewpagerdoubleindicatordemo;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import net.yaly.ViewPagerDoubleIndicator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private ViewPagerDoubleIndicator mViewPagerDoubleIndicator;
    private List<View> views;
    private String[] titles = {"一","二","三"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        views = new ArrayList<>();
        View v1 = View.inflate(this,R.layout.view_1,null);
        View v2 = View.inflate(this,R.layout.view_2,null);
        View v3 = View.inflate(this,R.layout.view_3,null);
        views.add(v1);
        views.add(v2);
        views.add(v3);
        mViewPager.setAdapter(new ViewPagerAdp());
        mViewPagerDoubleIndicator.setViewPager(mViewPager);

    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPagerDoubleIndicator = (ViewPagerDoubleIndicator) findViewById(R.id.vpdi);
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    class ViewPagerAdp extends PagerAdapter {

        @Override
        public int getCount() {
            return views.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(views.get(position));
            return views.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(views.get(position));
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }

}
