package com.smart_parking_lot.smart_parking_lot;

public class ParkingSpot {

    String spotId;
    VehicleType type;
    int floor;

    void assign() { isAvailable = false; }
    void release() { isAvailable = true; }

    public ParkingSpot(String spotId, boolean isAvailable, int floor, VehicleType type) {
        this.spotId = spotId;
        this.isAvailable = isAvailable;
        this.floor = floor;
        this.type = type;
    }

    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    boolean isAvailable;
}
