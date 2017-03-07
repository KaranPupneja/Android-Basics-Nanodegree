package com.example.ayaan.tourguide;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by AYAAN on 3/6/2017.
 */

public class tourAdapter extends ArrayAdapter<tour> {

    public tourAdapter(Activity context , ArrayList<tour> tours) {
        super(context, 0,tours);
    }
    public View getView(int position, View currentView, ViewGroup parent){
        tour currentword = getItem(position);
        View list = currentView;
        if (list == null){
            list = LayoutInflater.from(getContext()).inflate(R.layout.places,parent,false);

        }
        ImageView image = (ImageView)list.findViewById(R.id.label);
        image.setImageResource(currentword.getImageId());
        TextView title = (TextView)list.findViewById(R.id.title);
        title.setText(currentword.getTitle());

        TextView about = (TextView)list.findViewById(R.id.detail);
        about.setText(currentword.getDetail());

        return list;
    }
}
