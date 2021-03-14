package CollectionsTT;

import java.util.ArrayList;
import java.util.List;

public class ArraysDemoo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("medo");
        names.add("zezoo");
        names.add("Rekoo");

        names.remove(1);

        for (String name: names){
            System.out.println(name);
        }
    }
}
