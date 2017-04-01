package com.example.android.quakereport;

import android.support.v4.content.ContextCompat;

import java.text.DecimalFormat;

import static com.example.android.quakereport.R.id.date;
import static com.example.android.quakereport.R.id.location1;
import static com.example.android.quakereport.R.id.location2;
import static com.example.android.quakereport.R.id.magnitude;

/**
 * Created by AYAAN on 3/8/2017.
 */

public class Earthquake {
    private String mLocation;
    private double mMagnitude;
    private long mTimeInMilliseconds;
    private String mUrl;
    public Earthquake(double magnitude,String location,long timeInMilliseconds,String url){
        mLocation = location;
        mMagnitude = magnitude;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl=url;
    }
    public String getLocation(){
        return mLocation;
    }
    public double getMagnitude(){
        return mMagnitude;
    }
    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }
    public String getUrl(){
        return mUrl;
    }
}
