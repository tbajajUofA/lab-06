package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    /** The name of the city. */
    private String city;
    /** The name of the province the city belongs to. */
    private String province;

    /**
     * Constructs a new City with the given name and province.
     * @param city The name of the city.
     * @param province The name of the province the city belongs to.
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     * @return The city name.
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the name of the province.
     * @return The province name.
     */
    public String getProvince() {
        return province;
    }

    /**
     * Compares this city to another city by their names.
     * This method enables alphabetical sorting of cities.
     * @param o The object to compare to.
     * @return A negative integer, zero, or a positive integer as this city name
     *         is lexicographically less than, equal to, or greater than the specified city's name.
     */
    @Override
    public int compareTo(Object o){
        City city = (City) o;
        return this.city.compareTo(city.getCity());
    }

    /**
     * Determines whether this City is equal to another object.
     * Two cities are considered equal if they have the same city name and province name.
     * @param o The object to compare with.
     * @return Boolean. true if the given object represents the same city and province,
     *         false otherwise.
     */
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