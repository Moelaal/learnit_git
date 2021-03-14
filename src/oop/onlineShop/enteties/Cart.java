package oop.onlineShop.enteties;

public interface Cart {
    boolean isEmpty();
    void addProduct(Product getProductById);
    Product[] getProducts();
    void clear();
}
