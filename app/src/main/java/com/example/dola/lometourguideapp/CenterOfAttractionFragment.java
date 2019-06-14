package com.example.dola.lometourguideapp;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Date;

public class CenterOfAttractionFragment extends Fragment {
    RecyclerView recyclerView;
    Context context;

    public CenterOfAttractionFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_places, container, false);

        // Create an array of universities
        context = rootView.getContext();
        final ArrayList<PlaceOrEvent> listPlaces = createListOfCenterOfAttraction();

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

    public ArrayList<PlaceOrEvent> createListOfCenterOfAttraction(){
        ArrayList<PlaceOrEvent> listPlaces = new ArrayList<>();
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.eden_garden),context.getString(R.string.eden_garden_address),
                new Date(1998, 02, 12), R.drawable.eden_garden));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.filoparc),context.getString(R.string.filoparc_address),
                new Date(1998, 02, 12), R.drawable.fil_o_parc));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.tata_parc),context.getString(R.string.tata_parc_address),
                new Date(1998, 02, 12), R.drawable.tata_parc));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.togo_2000),context.getString(R.string.togo_2000_address),
                new Date(1998, 02, 12), R.drawable.togo_2000));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.marcelo_beach),context.getString(R.string.marcelo_beach_address),
                new Date(1998, 02, 12), R.drawable.marcelo_beach));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.pure_plage),context.getString(R.string.pure_plage_address),
                new Date(1998, 02, 12), R.drawable.pure_plage));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.olodge),context.getString(R.string.olodge_address),
                new Date(1998, 02, 12), R.drawable.ologde));
        return listPlaces;
    }
}
