package oop.dataStructure;

public class Motorcycle implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Start engine here");
    }

    @Override
    public void drive() {
        System.out.println("Drive motorcycle ");
    }
}
