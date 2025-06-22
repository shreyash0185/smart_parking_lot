package com.smart_parking_lot.smart_parking_lot;

import java.util.Map;
public class EntryManager {

    ParkingSpotManager parkingSpotManager;
    Map<String , Ticket>  activeTickets;

    Ticket checkIn(Vehicle vehicle){
        ParkingSpot spot = parkingSpotManager.allocateSpot(vehicle.getType());
        Ticket ticket = new Ticket(vehicle , spot);
        activeTickets.put(ticket.getTicketId(), ticket);
        return ticket;

    }
}
