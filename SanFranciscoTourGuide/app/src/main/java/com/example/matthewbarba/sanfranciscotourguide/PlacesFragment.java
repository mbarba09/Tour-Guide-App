package com.example.matthewbarba.sanfranciscotourguide;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {

    //   String to store the URL retrieved from each object for the onItemClickListener
    private String mURL;


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        //create an arrayList of words
        final ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content(getString(R.string.alcatraz_location), getString(R.string.alcatraz_address),
                getString(R.string.alcatraz_phonenumber), getString(R.string.alcatraz_url), R.mipmap.alcatraz));
        contents.add(new Content(getString(R.string.goldengate_location), getString(R.string.goldengate_address),
                getString(R.string.goldengate_phonenumber), getString(R.string.goldengate_url), R.mipmap.golden_gate_bridge));
        contents.add(new Content(getString(R.string.fishermans_location), getString(R.string.fishermans_address),
                getString(R.string.fishermans_phonenumber), getString(R.string.fishermans_url), R.mipmap.fishermans_warf));
        contents.add(new Content(getString(R.string.goldenGatePark_location), getString(R.string.goldenGatePark_address),
                getString(R.string.goldenGatePark_phonenumber), getString(R.string.goldenGatePark_url), R.mipmap.golden_gate_park));
        contents.add(new Content(getString(R.string.pier39_location), getString(R.string.pier39_address),
                getString(R.string.pier39_phonenumber), getString(R.string.pier39_url), R.mipmap.pier39));
        contents.add(new Content(getString(R.string.unionsquare_location), getString(R.string.unionsquare_address),
                getString(R.string.unionsquare_phonenumber), getString(R.string.unionsquare_url), R.mipmap.union_square));
        contents.add(new Content(getString(R.string.cable_car_location), getString(R.string.cable_car_address),
                getString(R.string.cable_car_phonenumber), getString(R.string.cable_car_url), R.mipmap.cable_car));
        contents.add(new Content(getString(R.string.presidio_location), getString(R.string.presidio_address),
                getString(R.string.not_available), getString(R.string.not_available), R.mipmap.presidio));
        contents.add(new Content(getString(R.string.chinatown_location), getString(R.string.chinatown_address),
                getString(R.string.not_available), getString(R.string.not_available), R.mipmap.china_town));
        contents.add(new Content(getString(R.string.muirwoods_location), getString(R.string.muirwoods_address),
                getString(R.string.muirwoods_phonenumber), getString(R.string.muirwoods_url), R.mipmap.muir));

//        set the custom adapter
        ContentAdapter adapter = new ContentAdapter(getActivity(), contents, R.color.place);

//        find the list view in the list xml
        ListView listView = (ListView) rootView.findViewById(R.id.list);
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
