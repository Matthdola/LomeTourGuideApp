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


public class RestaurantsFragment extends Fragment {
    RecyclerView recyclerView;
    Context context;

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_places, container, false);

        // Create an array of universities
        context = rootView.getContext();
        final ArrayList<PlaceOrEvent> listPlaces = createListOfRestaurants();

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

    public ArrayList<PlaceOrEvent> createListOfRestaurants(){
        ArrayList<PlaceOrEvent> listPlaces = new ArrayList<>();

        listPlaces.add(new PlaceOrEvent(context.getString(R.string.passio),context.getString(R.string.address_passio) ,
                new Date(1998, 02, 12), R.drawable.el_patio));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.chezconstant),context.getString(R.string.address_constant),
                new Date(1998, 02, 12), R.drawable.chez_constant));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.cote_sud),context.getString(R.string.cote_sud_address),
                new Date(1998, 02, 12), R.drawable.resto_cote_sud));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.cote_jardin),context.getString(R.string.cote_jardin_address),
                new Date(1998, 02, 12), R.drawable.resto_cote_sud));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.la_part_boucher),context.getString(R.string.la_part_boucher_address),
                new Date(1998, 02, 12), R.drawable.ipnetexperts));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.beluga),context.getString(R.string.beluga_address),
                new Date(1998, 02, 12), R.drawable.esa));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.chez_brovi),context.getString(R.string.chez_brovi_address),
                new Date(1998, 02, 12), R.drawable.cheb_brovi));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.la_cascade),context.getString(R.string.la_cascade_address),
                new Date(1998, 02, 12), R.drawable.lacascade));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.green_field),context.getString(R.string.green_field_address),
                new Date(1998, 02, 12), R.drawable.greenfield));

        return listPlaces;
    }

}
