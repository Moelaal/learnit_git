package oop.money;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet<>();

        tree.add("zzzz");
        tree.add("chair");
        tree.add("table");
        tree.add("shoe");

        for(String trees: tree){
            System.out.println(trees);
        }
    }
}
