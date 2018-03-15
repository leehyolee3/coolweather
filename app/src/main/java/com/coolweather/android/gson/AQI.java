package com.coolweather.android.gson;

/**
 * Created by mia on 2018/3/13.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
