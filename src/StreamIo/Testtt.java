package StreamIo;

import oop.onlineShop.enteties.Product;
import oop.onlineShop.enteties.impl.DefaultProduct;
import oop.onlineShop.enteties.impl.DefaultUser;

import java.util.*;

public class Testtt {
    public static void main(String[] args) {
//        TreeSet<DefaultProduct> defaultProduct = new TreeSet<>();
//        defaultProduct.add(new DefaultProduct(2,"product 1","category 1",333));
//        defaultProduct.add(new DefaultProduct(4,"product 2","category 2",552));
//        defaultProduct.add(new DefaultProduct(1,"def 2","def 4",3844));
//
//        for (DefaultProduct default1:defaultProduct){
//            System.out.println(default1);
//        }

        List<String> food = new ArrayList<>();
        food.add("Beans");
        food.add("rice");
        food.add("potato");

        for (int i = 0; i<food.size();i++){
            System.out.println(food.get(i));
        }

        for(String foods:food){
            System.out.println(foods);
        }

    }
}
