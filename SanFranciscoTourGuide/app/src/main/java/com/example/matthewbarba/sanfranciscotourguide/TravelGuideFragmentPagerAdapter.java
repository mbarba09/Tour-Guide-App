package com.example.matthewbarba.sanfranciscotourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TravelGuideFragmentPagerAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

//    getPageTitle() takes the @param position
//    use this function to get the title of each fragment according to the @param position
//    return the string that contains the title of the fragment
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.fragment_home);
        } else if (position == 1) {
            return mContext.getString(R.string.fragment_food);
        } else if (position == 2) {
            return mContext.getString(R.string.fragment_places);
        } else {
            return mContext.getString(R.string.fragment_districts);
        }
    }

    TravelGuideFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

//    getItem() takes the @param position
//    use this function to get the fragment based on @param position
//    return the string that contains the title of the fragment
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new PlacesFragment();
        } else {
            return new DistrictsFragment();
        }
    }

    //    getCount() is the public method that returns
//    the amount of fragments that need to be created
    @Override
    public int getCount() {
        return 4;
    }


}
