package com.interview.lld.notifyMe.observer;

import com.interview.lld.notifyMe.observable.WeatherForecast;

/**
 * Author: Prashant K Singh
 * Date: 12/10/2024
 * Time: 18:05
 */

public class TvAlert implements NotificationAlertObserver {
    private final WeatherForecast weatherForecast;
    private final Integer deviceId;

    public TvAlert (WeatherForecast weatherForecast, Integer deviceId){
        this.weatherForecast = weatherForecast;
        this.deviceId = deviceId;
    }
    @Override
    public void update() {
        System.out.println("TV Alert receive on device Id " + deviceId + ", current temperature is " + weatherForecast.getTemperature());
    }
}
