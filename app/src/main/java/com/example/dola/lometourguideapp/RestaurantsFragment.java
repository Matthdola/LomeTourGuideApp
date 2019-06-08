package com.example.dola.lometourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {
    RecyclerView recyclerView;

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_places, container, false);

        // Create an array of universities
        final ArrayList<PlaceOrEvent> listPlaces = PlaceOrEvent.createListOfRestaurants();

        // Create an PlaceAdapter, whose data source is list of Word. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter itemsAdapter = new PlaceAdapter(listPlaces);


        // Find the RecyclerView object in the view hierarchy of the Activity
        //There should be a RecyclerView with the view ID called list, which is declared in the activity_places.xml file
        recyclerView = rootView.findViewById(R.id.list);

        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setClickable(true);

        // Make the RecyclerView use the PlaceAdapter we created above, so that the
        // RecyclerView will display list items for each Universities in the list
        recyclerView.setAdapter(itemsAdapter);

        return rootView;
    }

}
