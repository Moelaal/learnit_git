package FunctionDemo;

@FunctionalInterface
public interface DistanceCalculator {

    double calculateDistance(City city1,City city2);

    default void someDefaultMethod(){}

    public static void someStaticMethod(){}


}