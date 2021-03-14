package CollectionsTT.random.GenericsDemo;

public class GenericDemo3<T> {

    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
       GenericDemo3<String> str = new GenericDemo3<>();
       GenericDemo3<Integer> ints = new GenericDemo3<>();

       str.setT("MOOOO");
       ints.setT(343);

        System.out.printf("Value of str: %s",str.getT());
        System.out.println();
        System.out.printf("Value of ints: %d",ints.getT());

    }
}
