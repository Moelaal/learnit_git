package oop.onlineShop.enteties;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        int result = p1.getCategoryName().compareTo(p2.getProductName());
        if (result  ==0){
            double priceDelta = p2.getPrice() - p1.getPrice();
            result = priceDelta <0 ? -1 : (priceDelta==0) ? 0:1;
        }
        if (result ==0){
            result = p1.getProductName().compareTo(p2.getCategoryName());
        }
        return result;
    }
}
