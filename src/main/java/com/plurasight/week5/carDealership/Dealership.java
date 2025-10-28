package com.plurasight.week5.carDealership;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;


    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getAllVehicles() {
        return inventory;
    }

    // add vehicle
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    // search methods
    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        List<Vehicle> matches = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            double price = vehicle.getPrice();
            if (price >= min && price <= max) {
                matches.add(vehicle);
            }
        }

        return matches;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        List<Vehicle> matches = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) &&
                    vehicle.getModel().equalsIgnoreCase(model)) {
                matches.add(vehicle);
            }
        }

        return matches;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        List<Vehicle> matches = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            int year = vehicle.getYear();
            if (year >= min && year <= max) {
                matches.add(vehicle);
            }
        }

        return matches;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        List<Vehicle> matches = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                matches.add(vehicle);
            }
        }
        return matches;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        List<Vehicle> matches = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            int mileage = vehicle.getOdometer();
            if (mileage >= min && mileage <= max) {
                matches.add(vehicle);
            }
        }

        return matches;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        List<Vehicle> matches = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                matches.add(vehicle);
            }
        }

        return matches;
    }

    // remove vehicle
    public void removeVehicle(Vehicle vehicle) {
        // Will implement later
    }

}