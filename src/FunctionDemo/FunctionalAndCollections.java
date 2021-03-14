package FunctionDemo;

import java.util.*;
import java.util.function.Function;

public class FunctionalAndCollections {

    private static final double DISCOUNT_RATE= 0.05;

    public static void main(String[] args) {
        Map<Integer, String> map =new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");

//        System.out.println("=== BiFunction type demo ====");
//
//        map.computeIfPresent(4,(key,value) -> key + ":" + value);
//        System.out.println("4: " + map.get(4));
//        map.computeIfPresent(1,FunctionalAndCollections::combineStringAndInteger);
//        System.out.println("map.get(1) : " + map.get(1));
//
//        System.out.println("------ Compose Functions type Demo ========");

//
//        Map<Product,Double> productDoubleMap = new HashMap<>();
//
//        List<Product> products = new ArrayList<>(Arrays.asList(new Product(1,122),new Product(2,144),
//                new Product(3,455) ));
//
//        for(Product product:products){
//            Function<Product,Double> getPrice =
//                    product2 -> product2.getPrice();
//
//            Function<Double,Double> getDiscount=
//                    price -> price * DISCOUNT_RATE;
//
//            Function<Product,Double> getPriceAndThenDiscount=
//                    getPrice.andThen(getDiscount);
//
//            Function<Product,Double> getPriceAndThenDiscount2 =
//                    getDiscount.compose(getPrice);
//
//            productDoubleMap.computeIfAbsent(product,getPriceAndThenDiscount);
//        }
//        System.out.println(productDoubleMap);
//
//
//        System.out.println("=======  Comparator.comparing() demo ========");
//
//        products.sort(Comparator.comparing(Product::getPrice));
//        products.sort(Comparator.comparing(product -> product.getPrice()));
//        System.out.println(products);
//
//
//
//
//    }
//    public static String convertingToString(Integer integer){
//        return Integer.toString(integer);
//    }
//    public static String combineStringAndInteger(Integer integer,String string){
//        return integer + ":" + string;
    }



}
