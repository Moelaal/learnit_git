package oop.onlineShop.services.impl;

import oop.onlineShop.enteties.Product;

import java.util.Comparator;

public class CustomProductSort implements Comparator<Product>{


    @Override
    public int compare(Product p1, Product p2) {
        int result = p1.getCategoryName().compareTo(p2.getCategoryName());
        if (result==0){
            double priceDelta = p1.getPrice() - p2.getPrice();
            result = priceDelta<0?-1:(priceDelta==0)?0:1;
        }
        if(result==0){
            result = p1.getProductName().compareTo(p2.getProductName());
        }
        return result;

    }
}
