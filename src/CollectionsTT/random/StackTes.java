package CollectionsTT.random;

import java.util.*;

public class StackTes {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(23);
        al.add("ewr");
        al.add('3');

        Enumeration e = Collections.enumeration(al);
        while(e.hasMoreElements()){
            Object o = e.nextElement();
            System.out.println(o);
        }
    }
}
