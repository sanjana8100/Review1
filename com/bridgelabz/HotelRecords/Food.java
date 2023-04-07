package com.bridgelabz.HotelRecords;

public class Food extends HotelRecords{
    Integer foodPrice;

    public Food(){
    }

    public Food(String name, Integer parkingPrice, Integer roomPrice, Integer foodPrice) {
        super(name, parkingPrice, roomPrice);
        this.foodPrice = foodPrice;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodPrice=" + foodPrice +
                ", name='" + name + '\'' +
                ", parkingPrice=" + parkingPrice +
                ", roomPrice=" + roomPrice +
                '}';
    }
}
