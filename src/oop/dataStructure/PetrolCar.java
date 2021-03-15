package oop.dataStructure;

public class PetrolCar implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Petrol car engine start");
    }

    @Override
    public void drive() {
        System.out.println("Petrol car drive");
    }
}
