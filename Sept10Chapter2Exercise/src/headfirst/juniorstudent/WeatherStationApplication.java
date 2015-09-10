/*
 * WeatherDataApplication.java 1.0 Sept 10, 2015
 *
 * Copyright (c) 2015 HFDP and DJP
 */
package headfirst.juniorstudent;

import javax.swing.JFrame;

public class WeatherStationApplication {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    JFrame updateControl = new WeatherStationControlGUI(weatherData);
    JFrame climate1 = new CurrentConditionsDisplay(weatherData, 300, 10);
    JFrame climate2 = new CurrentConditionsDisplay(weatherData, 300, 150);
    JFrame climate3 = new CurrentConditionsDisplay(weatherData, 300, 290);
  }
}
