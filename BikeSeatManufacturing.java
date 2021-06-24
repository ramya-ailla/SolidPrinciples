package com.company.solidPrinciples;
//responsibility is to make bike seats
class BikeSeatManufacturing implements ISeatManufacturing {

    @Override
    public void makeSeats() {
        System.out.println("Bike seats are ready");
    }
}
