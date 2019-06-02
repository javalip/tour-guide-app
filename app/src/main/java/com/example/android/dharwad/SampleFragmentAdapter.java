package com.example.android.dharwad;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class SampleFragmentAdapter extends FragmentStatePagerAdapter {

    private Context mContext;

    SampleFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new AttractionsFragment();
        else if (position == 1)
            return new FoodFragment();
        else if (position == 2)
            return new EducationFragment();
        else
            return new ShoppingFragment();
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }


    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.attraction);
            case 1:
                return mContext.getString(R.string.food);
            case 2:
                return mContext.getString(R.string.education);
            case 3:
                return mContext.getString(R.string.fashion);
            default:
                return null;
        }
    }

}
