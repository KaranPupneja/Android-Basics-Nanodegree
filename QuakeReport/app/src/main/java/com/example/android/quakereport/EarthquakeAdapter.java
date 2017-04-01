package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static android.R.attr.resource;
import static com.example.android.quakereport.R.id.date;
import static com.example.android.quakereport.R.id.magnitude;
import static com.example.android.quakereport.R.layout.earthquake_activity;
import static com.example.android.quakereport.R.layout.places;
import android.graphics.drawable.GradientDrawable;

/**
 * Created by AYAAN on 3/8/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake>{
    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context,0,earthquakes);
    }
    private int getMagnitudeColor(double magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);        //return ContextCompat.getColor(this,magnitudeColorResourceId);
    }
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
    public View getView(int position, View currentView, ViewGroup parent)
    {
        Earthquake current = getItem(position);
        View list = currentView;
        if(list == null){
            list = LayoutInflater.from(getContext()).inflate(places,parent,false);
        }
        Earthquake currentEarthquake = getItem(position);
        double mag = currentEarthquake.getMagnitude();
        DecimalFormat formatter = new DecimalFormat("0.0");
        String output = formatter.format(mag);

        TextView magnitude = (TextView)list.findViewById(R.id.magnitude);
        magnitude.setText(output);
        GradientDrawable magnitudeCircle = (GradientDrawable) magnitude.getBackground();

        // Get the appropriate background color based on the current earthquake magnitude
        int magnitudeColor = getMagnitudeColor(currentEarthquake.getMagnitude());

        // Set the color on the magnitude circle
        magnitudeCircle.setColor(magnitudeColor);


        TextView location = (TextView)list.findViewById(R.id.location1);
        String s = currentEarthquake.getLocation();
        String[] st = s.split("of");
        String first="";
        String second="";
        final String LOCATION_SEPARATOR = " of ";
        if (s.contains(LOCATION_SEPARATOR)) {
            String[] parts = s.split(LOCATION_SEPARATOR);
            first = parts[0] + LOCATION_SEPARATOR;
            second = parts[1];
        } else {
            first = getContext().getString(R.string.near_the);
            second = s;
        }
        TextView primaryLocationView = (TextView) list.findViewById(R.id.location1);
        primaryLocationView.setText(first);

        TextView locationOffsetView = (TextView) list.findViewById(R.id.location2);
        locationOffsetView.setText(second);
        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());

        // Find the TextView with view ID date
        TextView dateView = (TextView) list.findViewById(R.id.date);
        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);
        // Display the date of the current earthquake in that TextView
        dateView.setText(formattedDate);
        // Set the proper background color on the magnitude circle.
        // Fetch the background from the TextView, which is a GradientDrawable.
        TextView timeView = (TextView) list.findViewById(R.id.time);
        // Format the time string (i.e. "4:30PM")
        String formattedTime = formatTime(dateObject);
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);
        return list;
    }
}
