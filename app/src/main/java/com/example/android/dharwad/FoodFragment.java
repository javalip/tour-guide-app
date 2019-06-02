package com.example.android.dharwad;


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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Attraction> foodArray = new ArrayList<>();
        foodArray.add(new Attraction(R.drawable.food_jowar_rotti_with_sides, getString(R.string.food_01_title), getString(R.string.food_01_type)));
        foodArray.add(new Attraction(R.drawable.food_aulakki, getString(R.string.food_02_title), getString(R.string.food_02_type)));
        foodArray.add(new Attraction(R.drawable.food_dharwad_pedha, getString(R.string.food_03_title), getString(R.string.food_03_type)));
        foodArray.add(new Attraction(R.drawable.food_engai_palya, getString(R.string.food_04_title), getString(R.string.food_04_type)));
        foodArray.add(new Attraction(R.drawable.food_girmit, getString(R.string.food_05_title), getString(R.string.food_05_type)));
        foodArray.add(new Attraction(R.drawable.food_kadubu, getString(R.string.food_06_title), getString(R.string.food_06_type)));
        foodArray.add(new Attraction(R.drawable.food_kodabale, getString(R.string.food_07_title), getString(R.string.food_07_type)));
        foodArray.add(new Attraction(R.drawable.food_majjige_saru, getString(R.string.food_08_title), getString(R.string.food_08_type)));
        foodArray.add(new Attraction(R.drawable.food_rava_ladu, getString(R.string.food_09_title), getString(R.string.food_09_type)));
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        AttractionAdapter foodAdapter = new AttractionAdapter(getContext(), foodArray);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(foodAdapter);
        return rootView;

    }

}
