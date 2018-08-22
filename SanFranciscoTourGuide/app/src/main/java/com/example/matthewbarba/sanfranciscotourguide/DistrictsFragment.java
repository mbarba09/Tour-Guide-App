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
public class DistrictsFragment extends Fragment {

    //   String to store the URL retrieved from each object for the onItemClickListener
    private String mURL;

    public DistrictsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        //create an arrayList of words
        final ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content(getString(R.string.castro_location), getString(R.string.castro_url), R.mipmap.castro));
        contents.add(new Content(getString(R.string.chinatown_location), getString(R.string.chinatown_url), R.mipmap.china_town));
        contents.add(new Content(getString(R.string.civiccenter_location), getString(R.string.civiccenter_url), R.mipmap.civic_center));
        contents.add(new Content(getString(R.string.fishermanswarf_location), getString(R.string.fishermanswarf_url), R.mipmap.fishermans));
        contents.add(new Content(getString(R.string.haightashbury_location), getString(R.string.haightashbury_url), R.mipmap.haightashbury));
        contents.add(new Content(getString(R.string.sunset_location), getString(R.string.sunset_url), R.mipmap.goldengatepark));
        contents.add(new Content(getString(R.string.marina_location), getString(R.string.marina_url), R.mipmap.marina));
        contents.add(new Content(getString(R.string.northbeach_location), getString(R.string.northbeach_url), R.mipmap.northbeach));
        contents.add(new Content(getString(R.string.soma_location), getString(R.string.soma_url), R.mipmap.soma));
        contents.add(new Content(getString(R.string.unionsquare_location), getString(R.string.unionsquare_url), R.mipmap.unionsquare));
        contents.add(new Content(getString(R.string.embarcadero_location), getString(R.string.embarcadero_url), R.mipmap.embarcadero));
        contents.add(new Content(getString(R.string.fillmore_location), getString(R.string.fillmore_url), R.mipmap.fillmore));
        contents.add(new Content(getString(R.string.mission_location), getString(R.string.mission_url), R.mipmap.mission));

//        set the custom adapter
        ContentAdapter adapter = new ContentAdapter(getActivity(), contents, R.color.district);

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

        return rootView;

    }
}
