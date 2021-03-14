package CollectionsTT.random;

import java.util.*;

public class CmparsionDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        System.out.println("Add more elements: " + hs.add("aaa"));
        System.out.println("Added more elements : " + hs.add(33));
        System.out.println(hs);
        System.out.println("Size of elements: " + hs.size());

        LinkedHashSet lhs  = new LinkedHashSet();
        System.out.println("Added elements to Linked :" + lhs.add("332"));
        System.out.println("Added more elements to linked: " + lhs.add(332));
        System.out.println("For many reason here : " + lhs.size());
        System.out.println("Her we are :");
    }


    }

