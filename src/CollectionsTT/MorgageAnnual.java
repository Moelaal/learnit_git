package CollectionsTT;

import java.util.Scanner;
import java.util.logging.Formatter;

public class MorgageAnnual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principle: ");
        double p = sc.nextDouble();
        System.out.print("Annual interest rate: ");
        double r = sc.nextDouble();
        double annual = (r/100)/12;
        System.out.print("Period (Years): ");
        int year = sc.nextInt()*12;

        double m = p*((annual*Math.pow((annual+1),year))/(Math.pow((annual+1),year)-1));
        System.out.printf("Mortgage: $%.2f", m);


    }
}
