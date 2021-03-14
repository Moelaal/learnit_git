package oop.onlineShop.services.impl;

import oop.onlineShop.enteties.Order;
import oop.onlineShop.services.OrderManagementService;

import java.util.Arrays;

public class DefaultOrderManagement implements OrderManagementService {
    private final int  DEFAULT_ORDER_CAPACITY=10;
    private static DefaultOrderManagement instance;
    private int lastIndex;
    private Order[] orders;

    {
        orders = new Order[DEFAULT_ORDER_CAPACITY];
    }

    public static DefaultOrderManagement getInstance(){
        if (instance == null){
            instance = new DefaultOrderManagement();
        }
        return instance;
    }

    @Override
    public void addOrder(Order order) {
        if (order == null){
            return;
        }
        if (orders.length <= lastIndex){
            orders = Arrays.copyOf(orders,orders.length <<1);
        }
        orders[lastIndex++] = order;
    }

    @Override
    public Order[] getOrderByUserId(int userId) {
        if(userId ==0){
            return new Order[0];
        }
        int nonNullUser =0;
        for (Order order : orders){
            if(order != null && order.getCustomerId() == userId){
                nonNullUser++;
            }
        }
        Order[] orderByUserId = new Order[nonNullUser];
        int index =0;
        for (Order order :orders) {
            if (order != null && order.getCustomerId() == userId) {
                orderByUserId[index++] = order;
            }
        }
        return orderByUserId;
    }

    @Override
    public Order[] getOrders() {
        if(orders == null){
            return new Order[0];
        }
        int nonNullOrder = 0;
        for (Order order :orders){
            if(order != null){
                nonNullOrder++;
            }
        }

        Order[] nonOrder = new Order[0];
        int index = 0;
        for (Order order:orders){
            if(order != null){
                nonOrder[index++] = order;
            }
        }
        return nonOrder;

    }

    void clearServiceState(){
        lastIndex = 0;
        orders = new Order[DEFAULT_ORDER_CAPACITY];
    }


}
