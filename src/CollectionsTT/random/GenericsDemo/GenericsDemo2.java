package CollectionsTT.random.GenericsDemo;

public class GenericsDemo2 {
    public static void main(String[] args) {
        System.out.printf("Max value of %d,%d,%d is %d",1,2,3,maxValue(1,2,3));
        System.out.println();
        System.out.printf("Max value of %.1f,%.1f,%.1f is %.1f",23.4,65.3,12.9,maxValue(23.4,65.3,12.9));
        System.out.println();
        System.out.printf("Max value of %s,%s,%s is %s","Mohamed","Abdelaal","zeee",maxValue("Mohamed","Abdelaal","zeee"));

    }
    public static<T extends Comparable<T>> T maxValue(T x,T y,T z){
        T max = x;
        if(z.compareTo(max) > 0){
            max = z;
        }if(y.compareTo(max) > 0){
            max = y;
        }
        return max;
    }
}
