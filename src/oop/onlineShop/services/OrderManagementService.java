package oop.onlineShop.services;


import oop.onlineShop.enteties.Order;

public interface OrderManagementService {
    void addOrder(Order order);
    Order [] getOrderByUserId(int userId);
    Order [] getOrders();
}
