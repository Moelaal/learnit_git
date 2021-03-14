package CollectionsTT.random;

import java.util.Comparator;

public class CompStr implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer str1;
        Integer str2;

        str1 =(int)o1;
        str2 =(int)o2;

        return str2.compareTo(str1);
    }
}
