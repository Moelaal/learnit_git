package CollectionsTT.random;

import oop.onlineShop.enteties.Product;
import oop.onlineShop.enteties.User;
import oop.onlineShop.enteties.impl.DefaultProduct;
import oop.onlineShop.enteties.impl.DefaultUser;
import CollectionsTT.random.queueH.UserForHashTables;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
       Map<Integer, String> map = new HashMap<>();

       map.put(2,"Two");
       map.put(4,"Four");
       map.put(1,"One");
       map.put(5,"Five");
       map.put(3,"Three");

        System.out.println("Get entries from map: " + map.get(3));

        System.out.println("-----------");
        System.out.println("Getting value and keys: ");

        for(Map.Entry<Integer,String> entries: map.entrySet()){
            System.out.println( "Key: " + entries.getKey() + "\t\t" + "Value: " + entries.getValue() );
        }

        System.out.println("==============");


        System.out.println("get 4 element : " + map.getOrDefault(4,"default"));
        System.out.println("get 5 element : " + map.getOrDefault(5,"default"));

        Map<User,Product> userProductMap = new HashMap<>();

       User user = new DefaultUser("moo","Abdelaal","38232dslfa","medo.elaal@gmail.com");
       Product product = new DefaultProduct(1,"panana","fruit",32432);

        userProductMap.put(user,product);

        User user2= new DefaultUser("mmm","nnn","rererer","32432432@gsam");

        System.out.println("Get product by user in map : "+ userProductMap.get(user2));

        System.out.println("user hashCode():" + user.hashCode());
        System.out.println("Product hashcode() :" + product.hashCode());


        User user4 = new UserForHashTables(2,"mo","lo","dfjdslf3","dsfmds$");

        userProductMap.put(user4,product);


        User user5 = new UserForHashTables(4,"So","No","ererw","rewrewr");

        System.out.println("Get the user with hashCode(): "+ userProductMap.get(user4));

        user5.setEmail("dsafsdf@gafdldsf");

        System.out.println("Get product from when user is changed : " + userProductMap.get(user5));


        System.out.println();












    }
}
