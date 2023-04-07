package com.bridgelabz.HotelRecords;

import java.util.Scanner;

public class HotelMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String userName = in.next();
        System.out.print("Enter the Parking Price: ");
        Integer userParkingPrice = in.nextInt();
        System.out.print("Enter the Room Price: ");
        Integer userRoomPrice = in.nextInt();
        System.out.print("Enter the Food Price: ");
        Integer userFoodPrice = in.nextInt();

        FinalQuotation finalQuotation = new FinalQuotation(userName,userParkingPrice,userRoomPrice,userFoodPrice,0);
        finalQuotation.calculateTotalPrice();

        System.out.println(finalQuotation);
    }
}
