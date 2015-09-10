/*
 * WeatherStationApplication.java 1.0 Sept 10, 2015
 *
 * Copyright (c) 2015 HFDP and DJP
 */

package headfirst.juniorstudent2;

import javax.swing.JFrame;

public class WeatherStationApplication {

  public static void main(String[] args) {
    WeatherData weatherData;
    CurrentConditionsDisplay display1 = new CurrentConditionsDisplay(300, 10);
    CurrentConditionsDisplay display2 = new CurrentConditionsDisplay(300, 150);
    CurrentConditionsDisplay display3 = new CurrentConditionsDisplay(300, 290);

    weatherData = new WeatherData(display1, display2, display3);
    JFrame control = new WeatherStationControlGUI(weatherData);
  }
}
