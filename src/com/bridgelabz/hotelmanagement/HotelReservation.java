package com.bridgelabz.hotelmanagement;

import java.util.ArrayList;

public class HotelReservation {
    public static void main(String[] args) {
        ArrayList<Hotel> list = new ArrayList<>();
        Hotel hotel1 = new Hotel("Lakewood",110,80,90,80);
        Hotel hotel2 = new Hotel("Bridgewood",160,110,60,50);
        Hotel hotel3 = new Hotel("Ridgewood",220,100,150,40);

        list.add(hotel1);
        list.add(hotel2);
        list.add(hotel3);

        System.out.println(list);

    }
}
