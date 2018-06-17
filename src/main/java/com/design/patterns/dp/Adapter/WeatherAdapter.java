package com.design.patterns.dp.Adapter;

import java.util.HashMap;

public class WeatherAdapter {
    HashMap<Integer,String> cityZip=new HashMap<Integer,String>();

    public int findTemperature(int zipcode){
        cityZip.put(462016,"Bhopal");
        cityZip.put(95054,"Santa Clara");
        String city=null;
        // or query by database
        city=cityZip.get(zipcode);
        System.out.println("Found City for Zip code "+zipcode+" is "+city);
        WeatherFinder weatherFinder=new WeatherFinderImpl();
        int weather = weatherFinder.find(city);
        return weather;
    }
}
