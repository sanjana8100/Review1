package com.bridgelabz.HotelRecords;

public class FinalQuotation extends Food{
    Integer totalPrice;

    public FinalQuotation(String name, Integer parkingPrice, Integer roomPrice, Integer foodPrice, Integer totalPrice) {
        super(name, parkingPrice, roomPrice, foodPrice);
        this.totalPrice = totalPrice;
    }

    public void calculateTotalPrice(){
        totalPrice = super.parkingPrice + super.roomPrice + super.foodPrice;
    }

    @Override
    public String toString() {
        return "FinalQuotation{" +
                "totalPrice=" + totalPrice +
                ", foodPrice=" + foodPrice +
                ", name='" + name + '\'' +
                ", parkingPrice=" + parkingPrice +
                ", roomPrice=" + roomPrice +
                '}';
    }
}
