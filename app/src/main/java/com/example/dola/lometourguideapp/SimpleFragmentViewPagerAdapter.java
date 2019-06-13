package com.example.dola.lometourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentViewPagerAdapter extends FragmentPagerAdapter {
    public static final int PAGE_COUNT = 5;
    public static final int RESTAURANTS = 0;
    public static final int PUBLIC_PLACE = 1;
    public static final int UNIVERSITIES = 2;
    public static final int ATTRACTION_PARC = 3;
    public static final int NIGHT_CLUB = 4;

    private String tabTitles[] = new String[] {
            "Restaurants",
            "Public place",
            "universities",
            "Parc",
            "Night club",
    };

    public SimpleFragmentViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        if (i == RESTAURANTS){
            return new RestaurantsFragment();

        } else if(i == PUBLIC_PLACE){
            return new PublicPlaceFragment();

        } else if(i == UNIVERSITIES){
            return new PrivateUniversitiesFragment();

        } else if(i == ATTRACTION_PARC){
            return new CenterOfAttractionFragment();

        }else {
            return new NightClubsFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
