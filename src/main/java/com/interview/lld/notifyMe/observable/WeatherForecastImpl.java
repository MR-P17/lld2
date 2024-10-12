package com.interview.lld.notifyMe.observable;

import com.interview.lld.notifyMe.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Prashant K Singh
 * Date: 12/10/2024
 * Time: 17:52
 */

public class WeatherForecastImpl implements WeatherForecast {
    private Integer temperature = 0;
    private final List<NotificationAlertObserver> observers = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver obj) {
        observers.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public Integer getTemperature() {
        return this.temperature;
    }
}
