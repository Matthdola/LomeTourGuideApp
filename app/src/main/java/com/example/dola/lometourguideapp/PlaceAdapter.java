package com.example.dola.lometourguideapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import com.example.dola.lometourguideapp.R;

public class PlaceAdapter  extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>  {


    ArrayList<PlaceOrEvent> placesorEvents;
    /**
     * This is our own custom constructor (it does mirror a superclass constructor).
     * The content is used to inflate the layout file, and le list is the data we want
     * to populate into the lists.
     *
     * @param placesorEvents A list of PlaceEvent objecst to display in a list
     */
    public PlaceAdapter(ArrayList<PlaceOrEvent> placesorEvents){
        this.placesorEvents = placesorEvents;
    }

    @Override
    public PlaceViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View placesorEventView = inflater.inflate(R.layout.list_item, viewGroup, false);

        //Return a new holder instance
        PlaceViewHolder placesorEventViewHolder = new PlaceViewHolder(placesorEventView);

        return  placesorEventViewHolder;
    }

    @Override
    public void onBindViewHolder(final PlaceViewHolder placeViewHolder, int i) {
        final PlaceOrEvent placesOrEvent = placesorEvents.get(i);


        ImageView imageView = placeViewHolder.imageView;
        if (placesOrEvent.getPlaceImageResourceId() > 0) {
            imageView.setImageResource(placesOrEvent.getPlaceImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        TextView placeNameTextView = placeViewHolder.placeNameTextView;
        placeNameTextView.setText(placesOrEvent.getName());

        TextView addressTextView = placeViewHolder.addressTextView;
        addressTextView.setText(String.format("%s %s",
                placeViewHolder.context.getString(R.string.address ),
                placesOrEvent.getAddress()));

        TextView creationDateTextView = placeViewHolder.creationDateTextView;
        creationDateTextView.setText(String.format("%s %s/%s/%s",
                placeViewHolder.context.getString(R.string.creation_date),
                placesOrEvent.getCreationDate().getYear(),
                placesOrEvent.getCreationDate().getMonth(),
                placesOrEvent.getCreationDate().getDay()));

        TextView openDateTextView = placeViewHolder.openDateTextView;
        if (placesOrEvent.getOpenDays() != null){
            openDateTextView.setText(placesOrEvent.getOpenDays().toString());
        }


        TextView openHourTextView = placeViewHolder.openHoursTextView;
        openHourTextView.setText(placesOrEvent.getOpenHours());

        TextView managerTextView = placeViewHolder.manageNameTextView;
        managerTextView.setText(placesOrEvent.getManagerName());

        TextView viceManagerTextView = placeViewHolder.viceManageNameTextView;
        viceManagerTextView.setText(placesOrEvent.getViceManagerName());

        ImageButton moreInfoButton = placeViewHolder.moreButton;

        moreInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(),
                        String.format("%s  %s",
                                placeViewHolder.context.getString(R.string.moreinfotext),
                                placesOrEvent.getName()),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return placesorEvents.size();
    }


    public static class PlaceViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView placeNameTextView;
        public TextView addressTextView;
        public TextView creationDateTextView;
        public TextView openDateTextView;
        public TextView openHoursTextView;
        public TextView manageNameTextView;
        public TextView viceManageNameTextView;
        public ImageButton moreButton;
        public Context context;

        public PlaceViewHolder(View itemView){
            super(itemView);
            context = itemView.getContext();
            imageView = itemView.findViewById(R.id.place_image);
            placeNameTextView = itemView.findViewById(R.id.name_text_view);
            addressTextView = itemView.findViewById(R.id.address_text_view);
            creationDateTextView = itemView.findViewById(R.id.creationdate_text_view);
            openDateTextView = itemView.findViewById(R.id.opendays_text_view);
            openHoursTextView = itemView.findViewById(R.id.openhours_text_view);
            manageNameTextView = itemView.findViewById(R.id.manager_name_text_view);
            viceManageNameTextView = itemView.findViewById(R.id.vicemanager_name_text_view);
            moreButton = itemView.findViewById(R.id.more_button);
        }
    }

}
