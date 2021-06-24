package com.company.solidPrinciples;
import java.util.Scanner;

//here CarPartsAssembling class is not dependent on CarSeatManufacturing class and CarDoorManufacturing class they are dependent on abstract entities.
//means even if we add some classes which implements seatManufacturing and doorManufacturing interfaces.The above CarPartsAssembling will work fine.

//each class has single Responsibility


public class SolidPrinciplesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to vehicle Manufacturing");
        System.out.println("Enter\n1->Car\n2->Bike");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Welcome to car Manufacturing");
                System.out.println("1->Diesel car\n2->Petrol Car\n Enter your choice");
                int carChoice=sc.nextInt();
                if(carChoice == 1){
                    DieselCarManufacturing dc = new DieselCarManufacturing();
                    dc.manufacture();
                }
                else{
                    PetrolCarManufacturing pc = new PetrolCarManufacturing();
                    pc.manufacture();
                }
                break;
            case 2:
                System.out.println("Welcome to Bike Manufacturing");
                BikeManufacturing bike = new BikeManufacturing();
                bike.manufacture();
                break;
        }
    }
}
