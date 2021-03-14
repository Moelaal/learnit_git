package oop.onlineShop.services;

import oop.onlineShop.enteties.Product;

import java.util.List;

public interface ProductManagementService {
    List<Product> getProduct();
    Product getProductById(int productIdAddToCart);
}
