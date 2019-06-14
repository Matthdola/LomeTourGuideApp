package com.example.dola.lometourguideapp;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    public static final int PAGE_COUNT = 5;
    public static final int RESTAURANTS = 0;
    public static final int PUBLIC_PLACE = 1;
    public static final int UNIVERSITIES = 2;
    public static final int ATTRACTION_PARC = 3;
    public static final int NIGHT_CLUB = 4;


    @BindView(R.id.viewpager)
    ViewPager viewPager;

    @BindView(R.id.sliding_tabs)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Create an adapter that will knows which fragment should be shown on each page
        SimpleFragmentViewPagerAdapter adapter = new SimpleFragmentViewPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view page
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}
