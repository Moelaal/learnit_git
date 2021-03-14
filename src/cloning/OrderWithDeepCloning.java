package cloning;

import oop.onlineShop.enteties.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderWithDeepCloning implements Cloneable{
    private String creditCardNumber;
    private List<Product> products;
    private int customerId;

    public OrderWithDeepCloning(){}

    public OrderWithDeepCloning(String creditCardNumber,List<Product> products,int customerId){
        this.creditCardNumber = creditCardNumber;
        this.products = products;
        this.customerId = customerId;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "OrderWithDeepCloning{" +
                "creditCardNumber='" + creditCardNumber + '\'' +
                ", products=" + products +
                ", customerId=" + customerId +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        OrderWithDeepCloning orderCloning = (OrderWithDeepCloning) super.clone();
        List<Product> productToCopy = new ArrayList<>(this.products);
        orderCloning.setProducts(productToCopy);
        return orderCloning;
    }
}
