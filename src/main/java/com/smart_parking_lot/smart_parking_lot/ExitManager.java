package com.smart_parking_lot.smart_parking_lot;

import java.util.Map;

public class ExitManager {

    FeeCalculator calculator;
    ParkingSpotManager parkingSpotManager;
    Map<String , Ticket > activeTickets;

    double checkOut(String ticketId) {
        Ticket ticket = activeTickets.get(ticketId);
        ticket.closeTicket();
        double fee = calculator.calculateFee(ticket);
        parkingSpotManager.releaseSpot(ticket.getParkingSpot());
        activeTickets.remove(ticketId);
        return fee;

    }
}
