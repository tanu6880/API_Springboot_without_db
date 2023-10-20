package com.example.springbootdevtoolapplication.Entity;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private int id;
    private String house_number;
    private String colony;
    private String city;
    private String district;
    private String state;
    private int pincode;
    public Address(int id, String house_number, String colony, String city, String district, String state, int pincode) {
        this.id = id;
        this.house_number = house_number;
        this.colony = colony;
        this.city = city;
        this.district = district;
        this.state = state;
        this.pincode = pincode;
    }

    public Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", house_number='" + house_number + '\'' +
                ", colony='" + colony + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
