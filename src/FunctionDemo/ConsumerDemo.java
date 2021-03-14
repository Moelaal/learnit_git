package FunctionDemo;

import oop.onlineShop.enteties.Product;
import oop.onlineShop.enteties.impl.DefaultProduct;

import java.util.*;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new DefaultProduct(1,"product 1","Category 1",88),
                new DefaultProduct(1,"product 1","Category 1",188),
                new DefaultProduct(1,"product 1","Category 1",68)
        ));

        increasePriceForProductList(products,12);
        for (Product product: products){
            System.out.println(product);
        }


        System.out.println("========== BiConsumer demo ==========");
        Map<Integer,Product> productMap = new HashMap<>();
        productMap.put(1,new DefaultProduct(1,"product 1","category 1",23));
        productMap.put(2,new DefaultProduct(1,"Category 2","Product 2",112));
        productMap.put(3,new DefaultProduct(3,"Product 3","category 3",32));
        increasePriceForProductMap(productMap,20);
        for (Product product:productMap.values()){
            System.out.println(product);
        }

    }
    public static void increasePriceForProductList(List<? extends Product> products,
                                                   double price){
        products.iterator().forEachRemaining(product -> product.setPrice(product.getPrice() + price));
    }

    public static void increasePriceForProductMap(Map<Integer,? extends Product> products,
                                                  double priceToIncrease){
        products.forEach((id,product) -> product.setPrice(product.getPrice() + priceToIncrease));
    }
}
