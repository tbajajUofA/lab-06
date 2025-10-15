package com.example.listycity;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


/**
 * This is a class that keeps a list of city objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();


    /**
     * This adds a city to the list if the city does not exist
     * @param city This is a candidate city to add
     * @throws IllegalArgumentException if the city already exists in the list.
     */
    public void add(City city){
        if (cities.contains(city)){
            throw new IllegalArgumentException();

        }
        cities.add(city);

    }

    /**
     * This returns a sorted list of cities
     * @return Return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether a given city exists in the list.
     *
     * @param city The city to check.
     * @return Boolean. true if the city is in the list, false otherwise.
     */
    public Boolean hasCity(City city){
        if (cities.contains(city)){
            return true;
        }
        return false;
    }

    /**
     * Deletes a city from the list.
     * If the city is not in the list, an exception is thrown.
     * @param city The city to delete.
     * @throws IllegalArgumentException if the city does not exist in the list.
     */
    public void delete(City city){
        if (hasCity(city)){
            cities.remove(city);
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    /**
     * Returns the number of cities currently in the list.
     * @return The total count of cities.
     */
    public int countCities(){
        return cities.size();
    }
}