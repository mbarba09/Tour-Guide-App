package com.example.matthewbarba.sanfranciscotourguide;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

//        find the ImageView and set an onClick Listener. the listener will send the user to a new webpage
//        guide1, guide2, guide3, guide4 all have their respective listeners.
        ImageView guide1 = rootView.findViewById(R.id.guide_image_view_1);
        guide1.setOnClickListener(onClick1);

        ImageView guide2 = rootView.findViewById(R.id.guide_image_view_2);
        guide2.setOnClickListener(onClick2);

        ImageView guide3 = rootView.findViewById(R.id.guide_image_view_3);
        guide3.setOnClickListener(onClick3);

        ImageView guide4 = rootView.findViewById(R.id.guide_image_view_4);
        guide4.setOnClickListener(onClick4);

//        find the TextViews and set and onClickListener. The listener will send the user to a new web page
//        box1, box2, box3, box4 all have their respective listeners
        TextView box1 = rootView.findViewById(R.id.box_1);
        box1.setOnClickListener(onClickBox1);

        TextView box2 = rootView.findViewById(R.id.box_2);
        box2.setOnClickListener(onClickBox2);

        TextView box3 = rootView.findViewById(R.id.box_3);
        box3.setOnClickListener(onClickBox3);

        TextView box4 = rootView.findViewById(R.id.box_4);
        box4.setOnClickListener(onClickBox4);

        return rootView;

    }

    //    create new Intent to open a new webpage
    private View.OnClickListener onClick1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(getString(R.string.home_url_1)));
            startActivity(i);
        }
    };

    //    create new Intent to open a new webpage
    private View.OnClickListener onClick2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(getString(R.string.home_url_2)));
            startActivity(i);
        }
    };

    //    create new Intent to open a new webpage
    private View.OnClickListener onClick3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(getString(R.string.home_url_3)));
            startActivity(i);
        }
    };

    //    create new Intent to open a new webpage
    private View.OnClickListener onClick4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(getString(R.string.home_url_4)));
            startActivity(i);
        }
    };

    //    create new Intent to open a new webpage
    private View.OnClickListener onClickBox1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(getString(R.string.home_url_5)));
            startActivity(i);
        }
    };

    //    create new Intent to open a new webpage
    private View.OnClickListener onClickBox2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(getString(R.string.home_url_6)));
            startActivity(i);
        }
    };

    //    create new Intent to open a new webpage
    private View.OnClickListener onClickBox3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(getString(R.string.home_url_7)));
            startActivity(i);
        }
    };

    //    create new Intent to open a new webpage
    private View.OnClickListener onClickBox4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(getString(R.string.home_url_8)));
            startActivity(i);
        }
    };


}
