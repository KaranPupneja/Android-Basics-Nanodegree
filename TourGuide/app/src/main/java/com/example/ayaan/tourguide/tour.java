package com.example.ayaan.tourguide;

/**
 * Created by AYAAN on 3/6/2017.
 */

public class tour {
    private int mimag;
    private String mname;
    private String mdetail;
    private static double mlatitude;
//    private double mlatitude2;
    private static double mlongitude;
//    private double mlongitude2;

    public tour(int imag,String name,String detail,double lattitude,double longitude){
        mimag = imag;
        mdetail=detail;
        mname = name;
        mlatitude = lattitude;
        //mlatitude2 = lattitude2;
        mlongitude = longitude;
//        mlongitude2 = longitude2;
    }
    public int getImageId()
    {
        return mimag;
    }
    public String getTitle(){
        return mname;
    }
    public String getDetail(){
        return mdetail;
    }
    public static double getlongitude(){
        return mlongitude;
    }
//    public double getlongitude2(){
//        return mlongitude2;
//    }
    public static double getlatitude(){
        return mlatitude;
    }
//    public double getlatitude2(){
//        return mlatitude2;
//    }
}
