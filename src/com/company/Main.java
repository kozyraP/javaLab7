package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Pojazd> pojazds = new ArrayList<>();
        pojazds.add(new Samochod(140, 4, 8));
        pojazds.add(new Samochod(50, 4, 6));
        pojazds.add(new Motor(156, 2, 1));

        for(Pojazd pojazd : pojazds){
            System.out.println(pojazd.getDescription());
            pojazd.drive();
        }
    }
}
