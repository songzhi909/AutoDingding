package com.pengxh.autodingding.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class BaseFragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> pageList;

    public BaseFragmentAdapter(FragmentManager fm, List<Fragment> pageList) {
        super(fm);
        this.pageList = pageList;
    }

    @Override
    public Fragment getItem(int position) {
        return pageList.get(position);
    }

    @Override
    public int getCount() {
        return pageList.size();
    }
}