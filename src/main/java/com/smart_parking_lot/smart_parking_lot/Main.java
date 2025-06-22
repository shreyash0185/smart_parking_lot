package com.smart_parking_lot.smart_parking_lot;

public class Main {

    public static void main(String[] args) {
        // This is the entry point of the application.
        // You can initialize your parking lot system here and run tests or simulations.
        System.out.println("Smart Parking Lot System Initialized.");

        // Vehicle enters
        Vehicle vehicle = new Vehicle("MH12AB1234", VehicleType.CAR);
        EntryManager entryManager = new EntryManager();
        Ticket ticket = entryManager.checkIn(vehicle);
        System.out.println("Vehicle parked at: " + ticket.parkingSpot.spotId);

        // ...time passes...

        // Vehicle exits
        ExitManager exitManager = new ExitManager();
        double totalFee = exitManager.checkOut(ticket.ticketId);
        System.out.println("Total fee: ₹" + totalFee);
    }
}
