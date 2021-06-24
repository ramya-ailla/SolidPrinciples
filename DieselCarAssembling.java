package com.company.solidPrinciples;
//responsibility is to assemble parts of diesel car
class DieselCarAssembling extends BasicCarPartsAssembling{
    @Override
    void assembleEngine(IEngineManufacturing eng){
        eng.buildEngine();
        System.out.println("Engine Assembled");
    }
}
