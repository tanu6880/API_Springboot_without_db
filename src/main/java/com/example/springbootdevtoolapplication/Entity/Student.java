package com.example.springbootdevtoolapplication.Entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int rollnumber;
    private String name;
    private Address address;
    private long contact_num;

    public Student() {
    }

    public Student(int rollnumber, String name, Address address, long contact_num) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.address = address;
        this.contact_num = contact_num;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getContact_num() {
        return contact_num;
    }

    public void setContact_num(long contact_num) {
        this.contact_num = contact_num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollnumber=" + rollnumber +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", contact_num=" + contact_num +
                '}';
    }
}
