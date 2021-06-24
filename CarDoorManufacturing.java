package com.company.solidPrinciples;
//responsibility is to make car doors
class CarDoorManufacturing implements IDoorManufacturing {
    @Override
    public void makeDoors() {
        System.out.println("Car Doors are ready");
    }
}
