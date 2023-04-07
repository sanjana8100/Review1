package com.bridgelabz.HotelRecords;

public class HotelRecords {
    String name;
    Integer parkingPrice;
    Integer roomPrice;

    public HotelRecords() {
    }

    public HotelRecords(String name, Integer parkingPrice, Integer roomPrice) {
        this.name = name;
        this.parkingPrice = parkingPrice;
        this.roomPrice = roomPrice;
    }

    @Override
    public String toString() {
        return "HotelRecords{" +
                "name='" + name + '\'' +
                ", parkingPrice=" + parkingPrice +
                ", roomPrice=" + roomPrice +
                '}';
    }
}
