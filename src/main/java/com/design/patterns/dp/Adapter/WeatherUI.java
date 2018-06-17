package com.design.patterns.dp.Adapter;

public class WeatherUI {
    public void showTemperature(int zipcode){
        WeatherAdapter weatherAdapter =new WeatherAdapter();
        System.out.println(weatherAdapter.findTemperature(zipcode));

    }

    public static void main(String[] args) {
        WeatherUI weatherUI=new WeatherUI();
        weatherUI.showTemperature(95054);
    }
}
