package CollectionsTT.random;

import java.util.TreeSet;

public class Company {
    public static void main(String[] args) {
//        TreeSet tss = new TreeSet(new CompStr());
//        tss.add(1);
//        tss.add(2);
//        tss.add(3);
//        tss.add(4);
//
//        System.out.println("Comparator Sorting: " + tss);

        TreeSet ts = new TreeSet();
        ts.add(new HereComp(1));
        ts.add(new HereComp(30));
        ts.add(new HereComp(40));
        ts.add(new HereComp(50));
        ts.add(new HereComp(60));

        System.out.println(ts);

    }
}
