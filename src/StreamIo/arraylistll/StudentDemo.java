package StreamIo.arraylistll;

import FunctionDemo.City;
import FunctionDemo.DistanceCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Students> student = new ArrayList<>(Arrays.asList(
                new Students("aser",333,90.8),
                new Students("nada",56,78.8),
                new Students("medo",88,88.9),
                new Students("abdallah",66,90)
        ));

        for(Students st:student){
            System.out.println(st);
        }
    }
}
