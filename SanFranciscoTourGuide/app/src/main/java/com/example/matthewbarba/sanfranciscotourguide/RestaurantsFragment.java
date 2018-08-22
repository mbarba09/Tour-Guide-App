package com.example.matthewbarba.sanfranciscotourguide;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    //   String to store the URL retrieved from each object for the onItemClickListener
    private String mURL;


    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        //create an arrayList of words
        final ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content(getString(R.string.fogharbor_location), getString(R.string.fogharbor_address),
                getString(R.string.fogharbor_phonenumber), getString(R.string.fogharbor_url), R.mipmap.fog_harbor));
        contents.add(new Content(getString(R.string.hogisland_location), getString(R.string.hogisland_address),
                getString(R.string.hogisland_phonenumber), getString(R.string.hogisland_url), R.mipmap.hog_island));
        contents.add(new Content(getString(R.string.thehouse_location), getString(R.string.thehouse_address),
                getString(R.string.thehouse_phonenumber), getString(R.string.thehouse_url), R.mipmap.the_house));
        contents.add(new Content(getString(R.string.hollow_location), getString(R.string.hollow_address),
                getString(R.string.hollow_phonenumber), getString(R.string.hollow_url), R.mipmap.hollow));
        contents.add(new Content(getString(R.string.garydanko_location), getString(R.string.garydanko_address),
                getString(R.string.garydanko_phonenumber), getString(R.string.garydanko_url), R.mipmap.gary_danko));
        contents.add(new Content(getString(R.string.home_location), getString(R.string.home_address),
                getString(R.string.home_phonenumber), getString(R.string.home_url), R.mipmap.home));
        contents.add(new Content(getString(R.string.marlowe_location), getString(R.string.marlowe_address),
                getString(R.string.marlowe_phonenumber), getString(R.string.marlowe_url), R.mipmap.marlowe));
        contents.add(new Content(getString(R.string.sightglass_location), getString(R.string.sightglass_address),
                getString(R.string.sightglass_phonenumber), getString(R.string.sightglass_url), R.mipmap.sightglass));
        contents.add(new Content(getString(R.string.brendas_location), getString(R.string.brendas_address),
                getString(R.string.brendas_phonenumber), getString(R.string.brendas_url), R.mipmap.brendas));
        contents.add(new Content(getString(R.string.liholiho_location), getString(R.string.liholiho_address),
                getString(R.string.liholiho_phonenumber), getString(R.string.liholiho_url), R.mipmap.liho));
        contents.add(new Content(getString(R.string.scomas_location), getString(R.string.scomas_address),
                getString(R.string.scomas_phonenumber), getString(R.string.scomas_url), R.mipmap.scomas));

//        set the custom adapter
        ContentAdapter adapter = new ContentAdapter(getActivity(), contents, R.color.food);

//        find the list view in the list xml
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

//        create an onItemClickListener so that each item
//        that is clicked will redirect the user to the available web page
//        @link mURL stores the URL, which was received through the .getWebAddress from each object
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Content content = contents.get(i);
                mURL = content.getWebAddress();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(mURL));
                startActivity(intent);
            }
        });

//        Return the View
        return rootView;

    }

}
