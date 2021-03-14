package oop.onlineShop.storage;

import oop.onlineShop.enteties.Product;

import java.util.List;

public interface ProductStoringService {
    List<Product> loadProduct();
}
