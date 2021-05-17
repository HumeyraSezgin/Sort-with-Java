/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citytest;

/**
 *
 * @author hmyra
 */
public class City implements Comparable {
    private String cityName;
    private double temperature;
    
    public City (){
        cityName = "";
        temperature = 0.0;
    }
    
    public City (String city, double temp){
        this.cityName = city;
        this.temperature = temp;
    }

    /**
     * @return the cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName the cityName to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
    public String toString(){
        return cityName + " " + temperature;
    }
    
    @Override
    public int compareTo(Object other){
        City otherCity = (City) other;
        
        if (temperature == otherCity.temperature)
            return 0;
        if (temperature < otherCity.temperature)
            return -1;
        else 
            return 1;
    }
}
