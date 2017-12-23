package com.fooder.nsh.fooder;

/**
 * Created by this-is-nsh on 12/12/17.
 */

public class Weather {
    private String city;
    private int temperature;
    private int humidity;
    private int pressure;

    public Weather() {
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setTemperature (int temperature) {
        this.temperature = temperature;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public void setPressure (int pressure) {
        this.pressure = pressure;
    }
    public String getCity() {
        return city;
    }
    public int getTemperature() {
        return temperature;
    }
    public int getHumidity() {
        return humidity;
    }
    public int getPressure() {
        return pressure;
    }
}
