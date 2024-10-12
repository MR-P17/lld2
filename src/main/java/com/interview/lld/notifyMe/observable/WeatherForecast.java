package com.interview.lld.notifyMe.observable;

import com.interview.lld.notifyMe.observer.NotificationAlertObserver;

/**
 * Author: Prashant K Singh
 * Date: 12/10/2024
 * Time: 17:46
 */

public interface WeatherForecast {
    void add(NotificationAlertObserver obj);
    void remove(NotificationAlertObserver obj);
    void notifyObservers();
    void setTemperature(Integer temperature);
    Integer getTemperature();
}
