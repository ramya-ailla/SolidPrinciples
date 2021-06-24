package com.company.solidPrinciples;

//responsibility is to make car seats
class CarSeatManufacturing implements ISeatManufacturing {
    @Override
    public void makeSeats(){
        System.out.println("Car seats are ready");
    }
}
