package oop.onlineShop.storage;

import oop.onlineShop.enteties.Order;

import java.util.List;

public interface OrderStoringService {
    void saveOrder(List<Order> order);
    List<Order> loadOrder();
}
