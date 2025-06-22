package com.smart_parking_lot.smart_parking_lot;

import java.time.Duration;
import java.util.Map;
public class FeeCalculator {

    Map<VehicleType , Double> hourlyRates;

    double calculateFee(Ticket ticket){
        long hours = Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toHours();
        return hours * hourlyRates.get(ticket.getVehicle().getType());

    }

}
