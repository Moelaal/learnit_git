package CollectionsTT.random.GenericsDemo;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo5 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List<Integer> ints = new ArrayList<>();

        list = ints;

        list.add(33);
        list.add("ddd");
        ints.add(33);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(ints.get(0));

    }
}
