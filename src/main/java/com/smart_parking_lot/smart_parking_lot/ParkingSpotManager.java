package com.smart_parking_lot.smart_parking_lot;

import java.util.Map;
import java.util.Queue;

public class ParkingSpotManager {

    Map<VehicleType, Queue<ParkingSpot>> availableSpots;

    public ParkingSpot allocateSpot(VehicleType type){
        Queue<ParkingSpot> spots = availableSpots.get(type);
       if(spots != null && !spots.isEmpty()){
           ParkingSpot spot = spots.poll();
           spot.assign();
           return spot;

       }
       throw new RuntimeException("No available parking spots for vehicle type: " + type.getType());
    }

    public void releaseSpot(ParkingSpot spot){
        spot.release();
        availableSpots.get(spot.type).offer(spot);
    }
}
