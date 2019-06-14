package com.example.dola.lometourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentViewPagerAdapter extends FragmentPagerAdapter {
    public String tabTitles[] = new String[] {
        "Restaurants",
        "Public places",
        "Universities",
        "Parcs",
        "Night clubs"
    };

    public SimpleFragmentViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        if (i == MainActivity.RESTAURANTS){
            return new RestaurantsFragment();

        } else if(i == MainActivity.PUBLIC_PLACE){
            return new PublicPlaceFragment();

        } else if(i == MainActivity.UNIVERSITIES){
            return new PrivateUniversitiesFragment();

        } else if(i == MainActivity.ATTRACTION_PARC){
            return new CenterOfAttractionFragment();

        }else {
            return new NightClubsFragment();
        }
    }

    @Override
    public int getCount() {
        return MainActivity.PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
