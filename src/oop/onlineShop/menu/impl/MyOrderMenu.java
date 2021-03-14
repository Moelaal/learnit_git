package oop.onlineShop.menu.impl;

import oop.onlineShop.configs.ApplicationContext;
import oop.onlineShop.enteties.Order;
import oop.onlineShop.menu.Menu;
import oop.onlineShop.services.OrderManagementService;
import oop.onlineShop.services.impl.DefaultOrderManagement;

public class MyOrderMenu implements Menu {

    private ApplicationContext context;
    private OrderManagementService orderManagementService;

    {
        context = ApplicationContext.getInstance();
        orderManagementService = DefaultOrderManagement.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        if (context.getLoggedInUser() == null){
            System.out.println(
                    "Please log in or create new account ot see list of your orders"
            );
            new MainMenu().start();
            return;
        }else {
            printUserOrdersToConsole();
        }
        new MainMenu().start();
    }

    private void printUserOrdersToConsole(){
        Order[] loggedInUserOrders = orderManagementService.getOrderByUserId(context.getLoggedInUser().getId());

        if(loggedInUserOrders == null || loggedInUserOrders.length ==0){
            System.out.println(
                    "Unfortunately, you don't have any orders yet."+
                            "Navigate back to main menu to place a new order"
            );
        }else {
            for(Order order : loggedInUserOrders){
                System.out.println(order);
            }
        }
    }

    @Override
    public void printMenuHeader() {
        System.out.println("**** MY ORDERS ****");
    }
}
