package com.company.solidPrinciples;

//responsibility is to get seats and engine and assemble them to make bike.
class BikeManufacturing {
    void manufacture(){
        BikeEngineManufacturing be = new BikeEngineManufacturing();
        BikeSeatManufacturing bs = new BikeSeatManufacturing();
        be.buildEngine();
        System.out.println("Bike Engine assembled");
        bs.makeSeats();
        System.out.println("Seats assembled");
        System.out.println("Bike is ready");

    }
}
