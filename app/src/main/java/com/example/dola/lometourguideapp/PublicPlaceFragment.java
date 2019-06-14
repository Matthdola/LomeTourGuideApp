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


public class PublicPlaceFragment extends Fragment {
    RecyclerView recyclerView;
    Context context;

    public PublicPlaceFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_places, container, false);

        // Create an array of universities
        context = rootView.getContext();
        final ArrayList<PlaceOrEvent> listPlaces = createListOfPublicPlaces();

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

    public ArrayList<PlaceOrEvent> createListOfPublicPlaces(){
        ArrayList<PlaceOrEvent> listPlaces = new ArrayList<>();

        listPlaces.add(new PlaceOrEvent(context.getString(R.string.place_independance),context.getString(R.string.place_independance_address),
                new Date(1998, 02, 12), R.drawable.place_indep));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.coursdappel),context.getString(R.string.coursdappel_address),
                new Date(1998, 02, 12), R.drawable.cours_appel));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.assemble_nat),context.getString(R.string.assemble_nat_address),
                new Date(1998, 02, 12), R.drawable.assemble_nationale));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.place_anani_santos),context.getString(R.string.place_anani_santos_address),
                new Date(1998, 02, 12), R.drawable.anani_santos));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.place_liberation),context.getString(R.string.place_liberation_address),
                new Date(1998, 02, 12), R.drawable.colombe_de_la_paix));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.agoe_deux_lions),context.getString(R.string.agoe_deux_lions_address),
                new Date(1998, 02, 12), R.drawable.agoe_deux_lions));
        listPlaces.add(new PlaceOrEvent(context.getString(R.string.gta),context.getString(R.string.gta_address),
                new Date(1998, 02, 12), R.drawable.gta));

        return listPlaces;
    }
}
