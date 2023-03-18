package com.driver.model;

import javax.persistence.*;

@Entity
public  class TripBooking{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId;

    private String fromLocation;
    private String toLocation;
    private int bill;
    private int distanceInKm;
    @Enumerated(EnumType.STRING)
    private TripStatus tripStatus;
    @ManyToOne
    @JoinColumn
    Driver driver;
    @ManyToOne
    @JoinColumn
    Customer customer;
    public TripBooking(){

    }

    public TripBooking(int id, String fromLocation, String toLocation, int bill, int distanceInKm) {
        this.tripBookingId = id;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.bill = bill;
        this.distanceInKm = distanceInKm;

    }


    public int getTripBookingId() {
        return tripBookingId;
    }

    public void setTripBookingId(int tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}