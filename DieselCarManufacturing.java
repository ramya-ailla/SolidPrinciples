package com.company.solidPrinciples;
//client interacts with this class and he expects manufactured Diesel Car
class DieselCarManufacturing {
    void manufacture(){
        BasicCarPartsAssembling p = new DieselCarAssembling();
        p.assembleEngine(new CarDieselEngineManufacturing());
        p.assembleBasicParts(new CarSeatManufacturing(),new CarDoorManufacturing());
        System.out.println("Diesel car is ready");
    }
}
