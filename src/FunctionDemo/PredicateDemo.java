package FunctionDemo;

import CollectionsTT.random.queueH.UserForHashTables;
import oop.onlineShop.enteties.Product;
import oop.onlineShop.enteties.User;
import oop.onlineShop.enteties.impl.DefaultProduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        System.out.println("------ Consumer demo ------");

        List<Product> products = new ArrayList<>(Arrays.asList(
                new DefaultProduct(1,"product 1","category 1",75.8),
                new DefaultProduct(2,"product 2","category 2",244.9),
                new DefaultProduct(3,"product 3","Category 3",37.3)
        ));

        removeProductIfMoreThan(products,100);

        for(Product product : products){
            System.out.println(product);
        }

        System.out.println("----- Predicate.and() demo----------");

        removeProductsIfPriceIsMoreThanAndCategoryIsEqualTo(
                products,75.8,"category 1"
        );

        for(Product product:products){
            System.out.println(product);
        }


        System.out.println("------ Predicate.isEqual()");

        List<User> users= new ArrayList<>(Arrays.asList(
                new UserForHashTables(1,"Johan","Smith","password","johan@gmail.com"),
                new UserForHashTables(2,"Ivan","Ivanov","mddjf","ivafdads@dfds.com"),
                new UserForHashTables(3,"Hanaa","abdelaal","3eroiew320","324dsf@gmail.com")
        ));

        User criteria = new UserForHashTables(1,"Johan","Smith",
                "password","johan@gmail.com");

        users.removeIf(Predicate.not(Predicate.isEqual(criteria)));
        System.out.println(users);





    }
    public static void removeProductIfMoreThan(List<? extends Product> products,double price){
        products.removeIf(product -> product.getPrice() > price);
    }

    public static void removeProductsIfPriceIsMoreThanAndCategoryIsEqualTo(List<? extends Product> products,
                                                                           double price,String categoryName){
        Predicate<Product> productPredicate =
                product -> product.getPrice() > price;

        Predicate<Product> predicateCategoryName =
                product -> product.getCategoryName().equals(categoryName);

        products.removeIf(productPredicate.or(predicateCategoryName).negate());

    }

}