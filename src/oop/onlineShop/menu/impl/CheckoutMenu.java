package oop.onlineShop.menu.impl;

import oop.onlineShop.configs.ApplicationContext;
import oop.onlineShop.enteties.Order;
import oop.onlineShop.enteties.impl.DefaultOrder;
import oop.onlineShop.menu.Menu;
import oop.onlineShop.services.OrderManagementService;
import oop.onlineShop.services.impl.DefaultOrderManagement;

import java.util.Scanner;

public class CheckoutMenu implements Menu {

    private OrderManagementService orderManagementService;
    private ApplicationContext context;

    {
        context = ApplicationContext.getInstance();
        orderManagementService = DefaultOrderManagement.getInstance();
    }

    @Override
    public void start() {
        while (true){
            printMenuHeader();
            Scanner sc  = new Scanner(System.in);
            String userInput = sc.next();

            if(!createOrder(userInput)){
                continue;
            }
            context.getSessionCart().clear();
            break;
        }
        System.out.println("Thinks a lot for your purchase. Details about order delivery are sent to your email");
        new MainMenu().start();
    }

    private boolean createOrder(String creditCardNumber) {
        Order order = new DefaultOrder();
        if (!order.isCreditCardNumberValid(creditCardNumber)){
            return false ;
        }

        order.setCreditCardNumber(creditCardNumber);
        order.setProduct(context.getSessionCart().getProducts());
        order.setCustomerId(context.getLoggedInUser().getId());
        orderManagementService.addOrder(order);
        return false ;

    }

    @Override
    public void printMenuHeader() {
        System.out.println("**** Checkout ****");
        System.out.println(
                "Enter your card number without spaces and press enter if you confirm purchase: "
        );
    }
}
