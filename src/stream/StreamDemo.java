package stream;

import oop.onlineShop.enteties.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        System.out.println("----- filter() & map() & collect() demo -----");

        List<Product1> products = new ArrayList<>(Arrays.asList(
                new Product1(1224.3,"laptops",333),
                new Product1(444.32,"Ps5",555),
                new Product1(888,"Iphone 12", 10002),
                new Product1(577,"Frdigerator",9000),
                new Product1(332,"Chair",700)
        ));

        List<Product1> modifiedProduct = products.stream().filter(product -> product.getItemInWarehouse() >600).
                map(product ->{
                    product.setPrice(product.getPrice() - (product.getPrice() *0.1));
                    return product;
                }).collect(Collectors.toList());

        modifiedProduct.stream().forEach(System.out::println);

        System.out.println("----- flatMap() demo --------");
        Warehouse warehouse1 = new Warehouse();
        Warehouse warehouse2 = new Warehouse();
        Warehouse warehouse3 = new Warehouse();

        warehouse1.setProducts(Arrays.asList(new Product1(899,"ps5",900)));
        warehouse2.setProducts(Arrays.asList(new Product1(899,"chair",383),
                new Product1(899,"iPhone 12",889)));
        warehouse3.setProducts(Arrays.asList(new Product1(753,"Laptop",32332),
                new Product1(9948,"weird",7463)));

        List<Warehouse> warehouses = new ArrayList<>(Arrays.asList(
                warehouse1,
                warehouse2,
                warehouse3
        ));


        Product1[] productToArray = warehouses.stream().flatMap(
                warehouse -> warehouse.getProducts().stream()).filter(
                        product -> product.getItemInWarehouse() >700).map(
                                product -> {
                                    product.setPrice(product.getPrice() - (product.getPrice()*0.1));
                                    return product;
                                }
        ).toArray(Product1[]::new);

        Arrays.stream(productToArray).forEach(System.out::println);

        System.out.println("===== toMap() demo ======");

        Map<String,Product1> productMap = products.stream()
                .collect(Collectors.toMap(Product1::getName, Function.identity()));

        System.out.println(productMap);

        System.out.println("+++++ mapToInt ________");

        int totalITemInWarehouse = products.stream().mapToInt(product ->
                product.getItemInWarehouse()).sum();
        System.out.println("Item in warehouse: " + totalITemInWarehouse);


    }
}
class Product1{
    private double price;
    private String name;
    private int itemInWarehouse;

    public Product1(double price,String name,int itemInWarehouse){
        this.price = price;
        this.name = name;
        this.itemInWarehouse = itemInWarehouse;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemInWarehouse() {
        return itemInWarehouse;
    }

    public void setItemInWarehouse(int itemInWarehouse) {
        this.itemInWarehouse = itemInWarehouse;
    }

    @Override
    public String toString() {
        return "Product: \n" + "price:\t" + price +",\tname:\t" + name + ",\titem in warehouse:\t" + itemInWarehouse;
    }
}
class Warehouse{
    private List<Product1> products;

    public List<Product1> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product1> products){
        this.products = products;
    }
}
