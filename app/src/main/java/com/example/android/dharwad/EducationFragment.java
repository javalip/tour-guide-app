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
public class EducationFragment extends Fragment {


    public EducationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Attraction> educationArray = new ArrayList<>();
        educationArray.add(new Attraction(R.drawable.education_sdm_college_of_engineering_and_technology_dharwad_7, getString(R.string.education_01_title), getString(R.string.education_01_type)));
        educationArray.add(new Attraction(R.drawable.education_agriculture, getString(R.string.education_02_title), getString(R.string.education_02_type)));
        educationArray.add(new Attraction(R.drawable.education_dental, getString(R.string.education_03_title), getString(R.string.education_03_type)));
        educationArray.add(new Attraction(R.drawable.education_bvb, getString(R.string.education_04_title), getString(R.string.education_04_type)));
        educationArray.add(new Attraction(R.drawable.education_iit_dharwad, getString(R.string.education_05_title), getString(R.string.education_05_type)));
        educationArray.add(new Attraction(R.drawable.education_university, getString(R.string.education_06_title), getString(R.string.education_06_type)));
        educationArray.add(new Attraction(R.drawable.education_kcd, getString(R.string.education_07_title), getString(R.string.education_07_type)));
        educationArray.add(new Attraction(R.drawable.education_medical, getString(R.string.education_08_title), getString(R.string.education_08_type)));


        View rootView = inflater.inflate(R.layout.word_list, container, false);
        AttractionAdapter educationAdapter = new AttractionAdapter(getContext(), educationArray);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(educationAdapter);
        return rootView;
    }

}
