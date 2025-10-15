package com.example.listycity;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();


    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *    This is a candidate city to add
     */
    public void add(City city){
        if (cities.contains(city)){
            throw new IllegalArgumentException();

        }
        cities.add(city);

    }

    /**
     * This returns a sorted list of cities
     * @return
     *   Return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    public Boolean hasCity(City city){
        if (cities.contains(city)){
            return true;
        }
        return false;
    }

    public void delete(City city){
        if (hasCity(city)){
            cities.remove(city);
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public int countCities(){
        return cities.size();
    }
}