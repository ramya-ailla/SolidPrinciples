package com.company.solidPrinciples;
//responsibility is to make car petrol engine
class CarPetrolEngineManufacturing implements IEngineManufacturing {
    @Override
    public void buildEngine() {
        System.out.println("Petrol Car Engine is ready");
    }
}
