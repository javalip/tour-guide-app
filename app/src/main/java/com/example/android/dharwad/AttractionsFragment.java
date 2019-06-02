package com.example.android.dharwad;


import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Attraction> attractionArray = new ArrayList<>();
        attractionArray.add(new Attraction(R.drawable.attractions_chandramouleshwara_temple, getContext().getString(R.string.attraction_01_title), new Address(getContext().getString(R.string.attraction_01_adress_area), getContext().getString(R.string.attraction_01_adress_desc)), getContext().getString(R.string.attraction_01_type)));
        attractionArray.add(new Attraction(R.drawable.attractions_annigeri, getContext().getString(R.string.attraction_02_title), getContext().getString(R.string.attraction_02_type)));
        attractionArray.add(new Attraction(R.drawable.attractions_nrupatunga_betta, getContext().getString(R.string.attraction_03_title), new Address(getContext().getString(R.string.attraction_03_adress_area), getContext().getString(R.string.attraction_03_adress_desc)), getContext().getString(R.string.attraction_03_type)));
        attractionArray.add(new Attraction(R.drawable.attractions_iscon_temple, getContext().getString(R.string.attraction_04_title), getContext().getString(R.string.attraction_04_type)));
        attractionArray.add(new Attraction(R.drawable.attractions_agadi_thota, getString(R.string.attraction_05_title), getString(R.string.attraction_05_type)));
        attractionArray.add(new Attraction(R.drawable.attractions_badami, getString(R.string.attraction_06_title), new Address(getString(R.string.attraction_06_address_area), getString(R.string.attraction_06_adress_desc)), getString(R.string.attraction_06_type)));
        attractionArray.add(new Attraction(R.drawable.attractions_glass_house, getString(R.string.attraction_07_title), new Address(getString(R.string.attraction_07_adress_area), getString(R.string.attraction_07_address_desc)), getString(R.string.attraction_07_type)));
        attractionArray.add(new Attraction(R.drawable.attractions_godchinmalki_falls, getString(R.string.attraction_08_title), new Address(getString(R.string.attraction_08_adress_area), getString(R.string.attraction_08_adress_desc)), getString(R.string.attraction_08_type)));
        attractionArray.add(new Attraction(R.drawable.attractions_someshwar_temple, getString(R.string.attraction_09_title), new Address(getString(R.string.attraction_09_adress_area), getString(R.string.attraction_09_adress_desc)), getString(R.string.attraction_09_type)));
        attractionArray.add(new Attraction(R.drawable.attractions_om_beach, getString(R.string.attraction_10_title), new Address(getString(R.string.attraction_10_address_area), getString(R.string.attraction_10_adress_desc)), getString(R.string.attraction_10_type)));
        attractionArray.add(new Attraction(R.drawable.attractions_swadi, getString(R.string.attraction_11_title), new Address(getString(R.string.attraction_11_address_area), getString(R.string.attraction_11_address_desc)), getString(R.string.attraction_11_type)));
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        AttractionAdapter attractionAdapter = new AttractionAdapter(getContext(), attractionArray);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);
        return rootView;

    }

}
