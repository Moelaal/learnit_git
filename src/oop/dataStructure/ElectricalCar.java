package oop.dataStructure;

public class ElectricalCar implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Electric start car");
    }

    @Override
    public void drive() {
        System.out.println("Start drive car");
    }
}
