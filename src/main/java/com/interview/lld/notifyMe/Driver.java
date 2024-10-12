package com.interview.lld.notifyMe;

import com.interview.lld.notifyMe.observable.WeatherForecast;
import com.interview.lld.notifyMe.observable.WeatherForecastImpl;
import com.interview.lld.notifyMe.observer.MobileAlert;
import com.interview.lld.notifyMe.observer.NotificationAlertObserver;
import com.interview.lld.notifyMe.observer.TvAlert;

import java.util.Scanner;

/**
 * Author: Prashant K Singh
 * Date: 12/10/2024
 * Time: 18:06
 */

public class Driver {
    public static void main(String[] args) {
        int temperature;
        WeatherForecast weatherForecast = new WeatherForecastImpl();

        NotificationAlertObserver mobileDevice1 = new MobileAlert(weatherForecast, 1);
        NotificationAlertObserver mobileDevice2 = new MobileAlert(weatherForecast, 2);
        NotificationAlertObserver tvDevice1 = new TvAlert(weatherForecast, 1);
        NotificationAlertObserver tvDevice2 = new TvAlert(weatherForecast, 2);
        NotificationAlertObserver tvDevice3 = new TvAlert(weatherForecast, 3);

        weatherForecast.add(mobileDevice1);
        weatherForecast.add(mobileDevice2);
        weatherForecast.add(tvDevice1);
        weatherForecast.add(tvDevice2);
        weatherForecast.add(tvDevice3);

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----------------------------------");
            System.out.print("Enter the current temperature :: ");
            temperature = scanner.nextInt();
            System.out.println("----------------------------------");
            System.out.println();
            weatherForecast.setTemperature(temperature);
        } while (temperature != -1);
    }
}
