package com.company.solidPrinciples;

//client interacts with this class and he expects manufactured petrol Car
class PetrolCarManufacturing {

    void manufacture(){
        BasicCarPartsAssembling p = new PetrolCarAssembling();
        p.assembleEngine(new CarPetrolEngineManufacturing());
        p.assembleBasicParts(new CarSeatManufacturing(),new CarDoorManufacturing());
        System.out.println("Petrol car is ready");
    }
}
