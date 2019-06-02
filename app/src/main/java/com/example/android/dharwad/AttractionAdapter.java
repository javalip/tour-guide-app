package com.example.android.dharwad;

import android.content.Context;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private Context context;

    AttractionAdapter(Context context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
        this.context = context;

    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
            Attraction currentAttraction = getItem(position);
            // Title
            TextView nameTextView = listItemView.findViewById(R.id.name);
            nameTextView.setText(currentAttraction.getmNameStringId());


            //Address
            TextView adressTextView = listItemView.findViewById(R.id.adressArea);
            if (currentAttraction.getmAddressStringId() != null && !currentAttraction.getmAddressStringId().equals(null)) {
                adressTextView.setText(currentAttraction.getmAddressStringId().getArea());
                TextView adress2TextView = listItemView.findViewById(R.id.adress2);
                adress2TextView.setText(currentAttraction.getmAddressStringId().getDisc());

            } else {
                adressTextView.setVisibility(View.GONE);
            }


            //Image
            ImageView imageView = listItemView.findViewById(R.id.image);
            if (currentAttraction.hasImage()) {
                // If an image is available, display the provided image based on the resource ID
                imageView.setImageResource(currentAttraction.getmImageResourceId());
                // Make sure the view is visible
                imageView.setVisibility(View.VISIBLE);
            } else {
                // Otherwise hide the ImageView (set visibility to GONE)
                imageView.setVisibility(View.GONE);
            }

            // Type of attraction
            TextView typeTextView = listItemView.findViewById(R.id.type);
            typeTextView.setText(currentAttraction.getmType());


        return listItemView;

    }

}
