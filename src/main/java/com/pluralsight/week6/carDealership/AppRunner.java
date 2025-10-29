//package com.plurasight.week5.carDealership;
//
//public class AppRunner {
//    public static void main(String[] args) {
//        // Create the file manager
//        DealershipFileManager fileManager = new DealershipFileManager();
//        UserInterface ui = new UserInterface();
//        ui.display();
//        // Load the dealership from the file
//        Dealership dealership = fileManager.getDealership();
//
//        // Check if it loaded successfully
//        if (dealership != null) {
//            // Display dealership info
//            System.out.println("Dealership loaded successfully!");
//            System.out.println("Name: " + dealership.getName());
//            System.out.println("Address: " + dealership.getAddress());
//            System.out.println("Phone: " + dealership.getPhone());
//            System.out.println("\nVehicles in inventory:");
//            System.out.println("========================");
//
//            // Display all vehicles
//            for (Vehicle vehicle : dealership.getAllVehicles()) {
//                System.out.println(vehicle);
//            }
//
//            System.out.println("\nTotal vehicles: " + dealership.getAllVehicles().size());
//        } else {
//            System.out.println("Failed to load dealership!");
//        }
//    }
//}

package com.pluralsight.week6.carDealership;

public class AppRunner {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.display();
    }
}