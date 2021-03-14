package CollectionsTT.random.queueH;


import oop.onlineShop.enteties.Product;
import oop.onlineShop.enteties.User;
import oop.onlineShop.enteties.impl.DefaultProduct;
import oop.onlineShop.enteties.impl.DefaultUser;
import oop.onlineShop.services.impl.CustomProductSort;

import java.util.NavigableMap;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        NavigableMap<Integer,String> treeMap = new TreeMap<Integer,String>();
        treeMap.put(1,"One");
        treeMap.put(2,"Two");
        treeMap.put(5,"Five");
        treeMap.put(4,"Four");
        treeMap.put(3,"Tree");

        System.out.println("Get first entry: "+treeMap.firstEntry());
        System.out.println("Get last entry: " + treeMap.lastEntry());
        System.out.println("Get low entry: " + treeMap.lowerEntry(3));
        System.out.println("Get high entry: " + treeMap.higherEntry(3));
        System.out.println("Get ceiling entry: " + treeMap.ceilingEntry(3));
        System.out.println("Get floor entry: " + treeMap.floorKey(3));

        System.out.println("Tree map: " + treeMap);
        System.out.println("Tree map in descending: " + treeMap.descendingMap());

        NavigableMap<Product, User> productUserMap = new TreeMap<Product, User>(new CustomProductSort());

        productUserMap.put(new DefaultProduct(1,"Oak is here","Doors",333),
                new DefaultUser("mo","dsf","32","ejr"));
        productUserMap.put(new DefaultProduct(1,"Tesla","Cars",324322.32)
                ,new DefaultUser("Mohamed","Abdelaal","32432432sdf","Mezoooo@gmail.com"));

        for (Product product: productUserMap.keySet()){
            System.out.println(product);
        }


        System.out.println();


    }
}
