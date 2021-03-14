package oop.onlineShop.menu.impl;

import oop.onlineShop.configs.ApplicationContext;
import oop.onlineShop.enteties.Cart;
import oop.onlineShop.enteties.Product;
import oop.onlineShop.menu.Menu;
import oop.onlineShop.services.ProductManagementService;
import oop.onlineShop.services.impl.DefaultProductManagement;

import java.util.List;
import java.util.Scanner;

public class ProductCatalogMenu implements Menu {

    private static final String CHECK_OUT_COMMAND = "Checkout";
    private ApplicationContext context;
    private ProductManagementService productManagementService;
    {
        context = ApplicationContext.getInstance();
        productManagementService = DefaultProductManagement.getInstance();
    }


    @Override
    public void start() {
        Menu menuToNavigate = null;
        while (true) {
            printMenuHeader();
            printProductToConsole();
            String userInput = readUserInput();
            if(context.getLoggedInUser() == null){
                menuToNavigate = new MainMenu();
                System.out.println("You are not logged in. Please, sign in or create new account");
                break;
            }

            if(userInput.equalsIgnoreCase(MainMenu.MENU_COMMAND)){
                menuToNavigate = new MainMenu();
                break;
            }

            if(userInput.equalsIgnoreCase(CHECK_OUT_COMMAND)){
                Cart  sessionCart = context.getSessionCart();
                if(sessionCart == null || sessionCart.isEmpty()){
                    System.out.println("Your cart is empty. Please, Add product to cart first and then proceed with checkout");
                }else{
                    menuToNavigate = new MainMenu();
                    break;
                }
            }else{
                Product productToAddToCart = fetchProduct(userInput);

                if(productToAddToCart == null){
                    System.out.println("Please, enter product ID if you wnat to add product to cart. or enter 'checkout' if you want ot proceed with checkout or " +
                            "back to the menu");
                    continue;
                }
                processAddToCart(productToAddToCart);
            }
        }
        menuToNavigate.start();
    }

    private String readUserInput(){
        System.out.println("Product ID to add to cart or enter 'Checkout' to proceed with checkout:  ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        return userInput;
    }

    private void processAddToCart(Product productToAddToCart){
        context.getSessionCart().addProduct(productToAddToCart);
        System.out.printf("Product %s has been added to your cart."+
                "if you want to add a new Product - enter the product id ."+
                "if you want to proceed with checkout - enter word"+
                "'checkout' to console %n", productToAddToCart.getProductName());
    }

    @Override
    public void printMenuHeader() {
        System.out.println("**** PRODUCT CATALOG ****");
        System.out.println("Enter product id to add it to the cart or 'menu' you want to navigate  back to the main menu");
    }
    private void printProductToConsole(){
        List<Product> products = productManagementService.getProduct();
        for (Product product:products){
            System.out.println(product);
        }
    }
    private Product fetchProduct(String userInput){
        int productIdToAddToCart = Integer.parseInt(String.valueOf(userInput));
        Product productToAddToCart = productManagementService.getProductById(productIdToAddToCart);
        return productToAddToCart;
    }

}
