package com.company.solidPrinciples;
//responsibility is to assemble basic car parts
abstract class BasicCarPartsAssembling  {

    final void assembleBasicParts(ISeatManufacturing seat, IDoorManufacturing doors){
        seat.makeSeats();
        System.out.println("Seats Assembled");
        doors.makeDoors();
        System.out.println("Doors Assembled");
    }
    abstract void assembleEngine(IEngineManufacturing eng);
}
