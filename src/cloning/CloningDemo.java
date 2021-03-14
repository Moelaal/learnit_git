package cloning;

import oop.onlineShop.enteties.Product;
import oop.onlineShop.services.ProductManagementService;
import oop.onlineShop.services.impl.DefaultProductManagement;

import java.util.List;

public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException{
        User user = new User();

        ProductManagementService productService = DefaultProductManagement.getInstance();

        List<Product> products =  productService.getProduct();
        Order order = new Order("122313112123112",products,1);
        System.out.println("Original order: " + order);

        Order cloneOrder = (Order) order.clone();
        System.out.println("Cloned order: " + cloneOrder);

     //   cloneOrder.getProducts().clear();
        System.out.println("**** Cleared products for cloned ****");

        System.out.println("Original order: " + order);

        System.out.println("==== Deep cloning demo ====");

        DefaultProductManagement.loadProductsFromStorage();
        products = productService.getProduct();

        System.out.println(products);

        OrderWithDeepCloning order2 = new OrderWithDeepCloning("2222222222",products,1);

        var order3 = (OrderWithDeepCloning) order.clone();

        order3.getProducts().clear();

        System.out.println("Original order: " + order);
        System.out.println("Cloned order: " + order2);
















    }
}
