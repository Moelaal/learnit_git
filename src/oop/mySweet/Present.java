package oop.mySweet;


import java.util.Arrays;
import java.util.Objects;

public class Present {
   private final int DEFAULT_CAPACITY = 10;
   private Sweet[] sweets;
   private int lastAddedSweet;

    {
        sweets  = new Sweet[DEFAULT_CAPACITY];
    }

    public void addSweet(Sweet sweet){
        if (sweet == null){
            return;
        }
        if (sweets.length >= lastAddedSweet){
            sweets = Arrays.copyOf(sweets,sweets.length*2);
        }
        sweets[lastAddedSweet++] = sweet;

    }

    public Sweet[] filterSweetBySugarRange(double minSugarWeight,double maxSugarWeight){
        if(minSugarWeight == 0|| maxSugarWeight == 0){
            return new Sweet[0];
        }
        return Arrays.stream(sweets).filter(Objects::nonNull).filter(
                sweet-> {
                    if(sweet.getWeight() >= minSugarWeight || sweet.getWeight() <= maxSugarWeight){
                        return true;
                    }else{
                        return false;
                    }
                }
        ).toArray(Sweet[]::new);

    }

    public double calculateTotalWeight(){
      return Arrays.stream(sweets).filter(Objects::nonNull).mapToDouble(
              sweet -> sweet.getWeight()
      ).sum();
    }

    public Sweet[] getSweet(){
        return Arrays.stream(sweets).filter(Objects::nonNull).toArray(Sweet[]::new);
    }
}
