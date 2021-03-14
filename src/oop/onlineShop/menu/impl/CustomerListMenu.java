package oop.onlineShop.menu.impl;

import oop.onlineShop.configs.ApplicationContext;
import oop.onlineShop.enteties.User;
import oop.onlineShop.menu.Menu;
import oop.onlineShop.services.UserManagementService;
import oop.onlineShop.services.impl.DefaultUserManagement;

public class CustomerListMenu implements Menu {

    private ApplicationContext context;
    private UserManagementService userManagementService;

    {
        context  = ApplicationContext.getInstance();
        userManagementService = DefaultUserManagement.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        User[] users = userManagementService.getUsers();
        if(users.length == 0){
            System.out.println("Unfortunately, no customer found");
        }else{
            for (User user: users){
                System.out.println(user);
            }
        }
        context.getMainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("**** USERS ****");
    }
}
