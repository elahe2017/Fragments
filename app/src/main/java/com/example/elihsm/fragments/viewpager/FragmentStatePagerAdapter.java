package com.example.elihsm.fragments.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentStatePagerAdapter extends FragmentPagerAdapter {
    public FragmentStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
            return new FragmentSara();
            case 1:
            return new FragmentEli();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
