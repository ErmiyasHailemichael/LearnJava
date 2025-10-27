package com.plurasight.week5.carDealership;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {
        // Constructor - nothing needed here yet
    }

    public void display() {
        init();  // Load the dealership first

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 99:
                    running = false;
                    System.out.println("Thank you for using the Car Dealership System!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private void init() {
        // Create file manager and load the dealership
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();
    }

    private void displayMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║      " + dealership.getName() + "      ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println("1 - Find vehicles within a price range");
        System.out.println("2 - Find vehicles by make / model");
        System.out.println("3 - Find vehicles by year range");
        System.out.println("4 - Find vehicles by color");
        System.out.println("5 - Find vehicles by mileage range");
        System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
        System.out.println("7 - List ALL vehicles");
        System.out.println("8 - Add a vehicle");
        System.out.println("9 - Remove a vehicle");
        System.out.println("99 - Quit");
        System.out.print("\nEnter your choice: ");
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        if (vehicles == null || vehicles.isEmpty()) {
            System.out.println("\nNo vehicles found.");
            return;
        }

        System.out.println("\n" + vehicles.size() + " vehicle(s) found:");
        System.out.println("═════════════════════════════════════════════════════════════════════════");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        System.out.println("═════════════════════════════════════════════════════════════════════════");
    }

    private void processGetAllVehiclesRequest() {
        List<Vehicle> allVehicles = dealership.getAllVehicles();
        displayVehicles(allVehicles);
    }

    // Empty methods - we'll implement these later
    private void processGetByPriceRequest() {
        // Will implement later
    }

    private void processGetByMakeModelRequest() {
        // Will implement later
    }

    private void processGetByYearRequest() {
        // Will implement later
    }

    private void processGetByColorRequest() {
        // Will implement later
    }

    private void processGetByMileageRequest() {
        // Will implement later
    }

    private void processGetByVehicleTypeRequest() {
        // Will implement later
    }

    private void processAddVehicleRequest() {
        // Will implement later
    }

    private void processRemoveVehicleRequest() {
        // Will implement later
    }
}