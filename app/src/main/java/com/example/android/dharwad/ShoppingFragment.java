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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Attraction> fashionArray = new ArrayList<>();
        fashionArray.add(new Attraction(R.drawable.fashion_dharwad_saree, getString(R.string.fashion_01_title), getString(R.string.fashion_01_type)));
        fashionArray.add(new Attraction(R.drawable.fashion_gadag_saree, getString(R.string.fashion_02_title), getString(R.string.fashion_02_type)));
        fashionArray.add(new Attraction(R.drawable.fashion_kasooti_saree, getString(R.string.fashion_03_title), getString(R.string.fashion_03_type)));
        fashionArray.add(new Attraction(R.drawable.fashion_parkar_pokla, getString(R.string.fashion_04_title), getString(R.string.fashion_04_type)));
        fashionArray.add(new Attraction(R.drawable.fashion_nauvari_saree, getString(R.string.fashion_05_title), getString(R.string.fashion_05_type)));
        fashionArray.add(new Attraction(R.drawable.fashion_moggina_jade, getString(R.string.fashion_06_title), getString(R.string.fashion_06_type)));
        fashionArray.add(new Attraction(R.drawable.fashion_langa, getString(R.string.fashion_07_title), getString(R.string.fashion_07_type)));
        fashionArray.add(new Attraction(R.drawable.fashion_ilakal_saree, getString(R.string.fashion_08_title), getString(R.string.fashion_08_type)));
        fashionArray.add(new Attraction(R.drawable.fashion_dhoti, getString(R.string.fashion_09_title), getString(R.string.fashion_09_type)));
        fashionArray.add(new Attraction(R.drawable.fashion_dhotra, getString(R.string.fashion_10_title), getString(R.string.fashion_10_type)));
        fashionArray.add(new Attraction(R.drawable.fashion_lungi, getString(R.string.fashion_11_title), getString(R.string.fashion_11_type)));
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        AttractionAdapter fashionAdapter = new AttractionAdapter(getContext(), fashionArray);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(fashionAdapter);
        return rootView;
    }

}
