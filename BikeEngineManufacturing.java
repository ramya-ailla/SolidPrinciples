package com.company.solidPrinciples;
//responsibility is to build bike engine
class BikeEngineManufacturing implements IEngineManufacturing {

    @Override
    public void buildEngine() {
        System.out.println("Bike Engine is Ready");
    }
}
