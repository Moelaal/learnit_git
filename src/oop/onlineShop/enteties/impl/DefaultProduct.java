package oop.onlineShop.enteties.impl;

import oop.onlineShop.enteties.Product;

public class DefaultProduct implements Product ,Comparable<DefaultProduct>{

    private int id;
    private String productName;
    private String categoryName;
    private double price;

    public DefaultProduct(Integer integer, String productElement, String element, String s, Double aDouble){}

    public DefaultProduct(int id,String productName,String categoryName,double price){
        this.id = id;
        this.productName = productName;
        this.categoryName = categoryName;
        this.price = price;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DefaultProduct{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public int compareTo(DefaultProduct defaultProduct) {

        if(id > defaultProduct.id){
            return 1;
        }else if(id< defaultProduct.id){
            return -1;
        }else{

        return 0;
        }
    }
}
