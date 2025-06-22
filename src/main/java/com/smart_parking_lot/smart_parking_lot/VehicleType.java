package com.smart_parking_lot.smart_parking_lot;

public enum VehicleType {
    MOTORCYCLE("Motorcycle"),
    CAR("Car"),
    BUS("Bus");


    private final String type;

    VehicleType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
