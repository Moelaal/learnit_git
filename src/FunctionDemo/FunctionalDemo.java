package FunctionDemo;

public class FunctionalDemo {
    public static void main(String[] args) {
       OrderManagement orderManagement = new OrderManagement(new DefaultDistanceCalculator());

       orderManagement.setDistanceCalculator(new DistanceCalculator() {
           @Override
           public double calculateDistance(City city1, City city2) {
               return city1.getLongitude() - city2.getLongitude();
           }
       });

       DistanceCalculator dCalculator = (city1,city2) -> city1.getLongitude() - city2.getLongitude();

       DistanceCalculator dCalculator2 = (city1,city2) -> {
           System.out.println("Dcalculator here");
           return city1.getLongitude() - city2.getLongitude();
       };

       orderManagement.setDistanceCalculator((city1,city2) -> 5464.32);
       dCalculator2.calculateDistance(new City(),new City());

       orderManagement.setDistanceCalculator(GoogleDistance::anyStaticMethodBetweenCities);
       GoogleDistance gdc = new GoogleDistance();
       orderManagement.setDistanceCalculator(gdc::anyDefaultMethodBetweenCities);
    }
}
class OrderManagement {
    public DistanceCalculator distanceCalculator;

    public OrderManagement(DistanceCalculator distanceCalculator){
        this.distanceCalculator = distanceCalculator;
    }

    public void setDistanceCalculator(DistanceCalculator distanceCalculator){
        this.distanceCalculator = distanceCalculator;
    }


}
class DefaultDistanceCalculator implements DistanceCalculator{


    @Override
    public double calculateDistance(City city1, City city2) {
        return 0;
    }
}
class GoogleDistance {

    public double anyDefaultMethodBetweenCities(City city1,City city2){
        return 1;
    }

    public static double anyStaticMethodBetweenCities(City city1,City city2){
        return 2;
    }

}




