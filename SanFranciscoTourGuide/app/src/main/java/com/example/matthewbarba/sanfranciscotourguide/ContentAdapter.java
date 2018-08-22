package com.example.matthewbarba.sanfranciscotourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContentAdapter extends ArrayAdapter<Content> {

    //    resource ID for the background color for this list of words
    private int mColorResourceID;

    public ContentAdapter(Activity context, ArrayList<Content> content, int colorResourceID) {
        super(context, 0, content);
        mColorResourceID = colorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

//        get the object located at the position in the list
        Content currentPosition = getItem(position);

//        find the View in the list_item.xml layout so we can set the background color according to the fragment
        View listContainer = listItemView.findViewById(R.id.list_layout);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        listContainer.setBackgroundColor(color);

//        find the textview in the list_item.xml layout with the ID place_name
        TextView locationTextView = listItemView.findViewById(R.id.place_name);
//        get the name of the location and set this text to the locationTextView
        locationTextView.setText(currentPosition.getLocation());

//        find the textview in the list_item.xml layout with the ID place_address
        TextView addressTextView = listItemView.findViewById(R.id.place_address);

        //        get the name of the location and set this text to the locationTextView
        addressTextView.setText(currentPosition.getAddress());

//        find the textview in the list_item.xml layout with the ID place_phone
        TextView phoneTextView = listItemView.findViewById(R.id.place_phone);
//        get the name of the location and set this text to the locationTextView
        phoneTextView.setText(currentPosition.getPhoneNumber());

//        find the imageView in the list_item.xml layout with the ID place_name
        ImageView locationImageView = listItemView.findViewById(R.id.image);
//        get the name of the location and set this text to the locationTextView
        locationImageView.setImageResource(currentPosition.getImageResourceID());

//        return the whole list item layout so that it can be shown in the listview
        return listItemView;
    }
}
