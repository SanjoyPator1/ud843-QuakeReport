package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude, mLocation, mDate;

    public Earthquake(String m, String l, String d){

        mMagnitude = m;
        mLocation = l;
        mDate = d;


    }

    //get methods

    public String getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public String getDate(){
        return mDate;
    }

}
