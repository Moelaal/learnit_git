package oop.dataStructure;

public class VehicleService {
   public void moveVehicle(Vehicle vehicle){
        if(vehicle instanceof ElectricalCar){
            System.out.println("electrical car");
        }
        if(vehicle instanceof PetrolCar){
            System.out.println("Petrol car start");
        }
        if(vehicle instanceof Motorcycle){
            System.out.println("Motorcycle start");
        }
    }
   public void startVehicleEngine(Vehicle vehicle){
       if(vehicle instanceof Motorcycle){

       }
       if(vehicle instanceof PetrolCar){

       }
       if(vehicle instanceof ElectricalCar){

       }
   }
}
