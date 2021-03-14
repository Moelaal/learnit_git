package CollectionsTT.random.GenericsDemo;

public class GenericsDemo1 {
    public static void main(String[] args) {
       String[] str = {"Hana","nada","zeinab","abdelaal"};

       printArray(str);

       Integer[] ints = {22,13,14,56};

       printArray(ints);
    }
    public static<E> void printArray(E [] element){
        for(E elem:element){
            System.out.println(elem);
        }
    }
}
