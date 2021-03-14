package oop.onlineShop.enteties.impl;

import oop.onlineShop.enteties.Cart;
import oop.onlineShop.enteties.Product;

import java.util.Arrays;

public class DefaultCart implements Cart {

    private final int DEFAULT_PRODUCT_CAPACITY = 10;
    private Product[] products;
    private int lastIndex;

    {
        products = new Product[DEFAULT_PRODUCT_CAPACITY];
    }

    @Override
    public boolean isEmpty() {
        if (products == null|| products.length ==0){
            return true;
        }
        for (Product product:products){
            if(products != null){
                return false;
            }
        }
        return true;

    }

    @Override
    public void addProduct(Product getProductById) {
        if(getProductById==null){
            return;
        }
        if (products.length<= lastIndex ){
            products = Arrays.copyOf(products,products.length<<1);
        }
        products[lastIndex++]= getProductById;
    }

    @Override
    public Product[] getProducts() {
        if (products == null){
            return new Product[0];
        }
        int nonNullAmount = 0;
        for (Product product:products){
            if(product!=null){
                nonNullAmount++;
            }
        }

        Product[] nonNullProduct = new Product[nonNullAmount];
        int index = 0;
        for (Product product:products){
            if(product != null){
                nonNullProduct[index++] = product;
            }
        }
        return nonNullProduct;
    }

    @Override
    public void clear() {
        products = new Product[DEFAULT_PRODUCT_CAPACITY];
    }
}
