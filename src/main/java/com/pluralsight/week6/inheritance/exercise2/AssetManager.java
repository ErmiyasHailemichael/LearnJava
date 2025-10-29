package com.pluralsight.week6.inheritance.exercise2;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        House house1 = new House("main home", "2020-04-04", 200_000, "Lynwood street 123", 1, 100, 100);
        House house2 = new House("vacation home", "2021-04-04", 100_000, "Linden street 123", 1, 50, 50);
        Vehicle vehicle1 = new Vehicle("main car", "yesterday", 10000, "toyota yaris", 2018, 10000);
        Vehicle vehicle2 = new Vehicle("vacation car", "yesterday", 18000, "toyota yaris cabrio", 2022, 10000);

        assets.add(house1);
        assets.add(house2);
        assets.add(vehicle1);
        assets.add(vehicle2);

        for (Asset a : assets) {
            System.out.println(a.getDescription() + " original value " + a.getOriginalCost() + " value now " + a.getValue());
            if (a instanceof Vehicle v) {
                System.out.println(v.getOdometer());
            } else if (a instanceof House h) {
                System.out.println(h.getAddress());
            }
        }
    }
}
