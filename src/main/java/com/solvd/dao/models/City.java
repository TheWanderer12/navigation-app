package com.solvd.dao.models;

public class City {
    private int id;
    private String city;

    private double lat;
    private double lng;
    private String country;

    public City(){

    }




    public City(int id, String city, double lat, double lng, String country) {
        this.id = id;
        this.city = city;
        this.lat = lat;
        this.lng = lng;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
