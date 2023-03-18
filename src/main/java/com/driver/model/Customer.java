package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String mobNo;
    private String password;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    List<TripBooking> tripBookingList=new ArrayList<>();

    public Customer(){

    }

    public Customer(int customerId, String mobNo, String password) {
        this.customerId = customerId;
        this.mobNo = mobNo;
        this.password = password;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }

    public int getcustomerId() {
        return customerId;
    }

    public void setId(int customerId) {
        this.customerId = customerId;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}