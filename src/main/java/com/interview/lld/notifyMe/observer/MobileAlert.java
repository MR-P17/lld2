package com.interview.lld.notifyMe.observer;

import com.interview.lld.notifyMe.observable.WeatherForecast;

/**
 * Author: Prashant K Singh
 * Date: 12/10/2024
 * Time: 17:57
 */

public class MobileAlert implements NotificationAlertObserver{
    private final WeatherForecast weatherForecast;
    private final Integer deviceId;

    public MobileAlert(WeatherForecast weatherForecast, Integer deviceId){
        this.weatherForecast = weatherForecast;
        this.deviceId = deviceId;
    }
    @Override
    public void update() {
        System.out.println("Mobile Alert receive on device Id " + deviceId + ", current temperature is " + weatherForecast.getTemperature());
    }
}
