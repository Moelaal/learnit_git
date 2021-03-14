package CollectionsTT.random;

import oop.onlineShop.enteties.Product;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionsDemo {
    public static void main(String[] args) {
        Set<Integer> set = Collections.newSetFromMap(new ConcurrentHashMap<Integer,Boolean>());


    }
    public static List<Product> getProductsByCartId(int cartId){
        List <Product> products = getProductsByCartId(cartId);

        return products == null ? Collections.emptyList() : products;
    }
    private static List<Product> getProductsFromDbByCartId(int cartId){
        return null;
    }
}
