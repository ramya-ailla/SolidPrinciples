package com.company.solidPrinciples;
//responsibility is to make car diesel engine
class CarDieselEngineManufacturing implements IEngineManufacturing {

    @Override
    public void buildEngine() {
        System.out.println("Diesel Car  Engine is Ready");
    }
}
