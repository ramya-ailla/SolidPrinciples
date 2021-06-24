package com.company.solidPrinciples;
//responsibility is to assemble petrol car parts
//PetrolCarAssembling class can substitute BasicCarPartsAssembling
class PetrolCarAssembling extends BasicCarPartsAssembling{
   @Override
    void assembleEngine(IEngineManufacturing eng){
        eng.buildEngine();
        System.out.println("Engine Assembled");
    }

}
