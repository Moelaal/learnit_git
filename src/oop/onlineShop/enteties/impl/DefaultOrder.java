package oop.onlineShop.enteties.impl;

import oop.onlineShop.enteties.Order;
import oop.onlineShop.enteties.Product;

import java.util.Arrays;

public class DefaultOrder implements Order {

    private static final int AMOUNT_DIGITS_IN_CREDIT_CARD=  16;

    private String creditCardNumber;
    private Product[] products;
    private int customerId;



    @Override
    public boolean isCreditCardNumberValid(String userInput) {
        return creditCardNumber.toCharArray().length == AMOUNT_DIGITS_IN_CREDIT_CARD &&
                !creditCardNumber.contains(" ") && Long.parseLong(creditCardNumber)>0;
    }

    @Override
    public void setCreditCardNumber(String userInput) {
        if (userInput ==null){
            return;
        }
        this.creditCardNumber = userInput;
    }

    @Override
    public void setProduct(Product[] products) {
        this.products = products;

    }

    @Override
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public int getCustomerId() {
        return this.customerId;
    }

    @Override
    public String

    toString() {
        return "DefaultOrder{" +
                "creditCardNumber='" + this.creditCardNumber + '\'' +
                ", products=" + Arrays.toString( this.products) +
                ", customerId=" +  this.customerId +
                '}';
    }
}
