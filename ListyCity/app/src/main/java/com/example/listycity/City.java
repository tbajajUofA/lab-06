package com.example.listycity;

/**
 * This is a class that defines a City
 */
public class City implements Comparable {
    private String city;
    private String province;

    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    @Override
    public int compareTo(Object o){
        City city = (City) o;
        return this.city.compareTo(city.getCity());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if ((o instanceof City)==false||o == null) {
            return false;
        }
        City other = (City) o;
        return this.city.equals(other.city) && this.province.equals(other.province);
    }

    //no need to override hashcode function cuz not using that for this project

}