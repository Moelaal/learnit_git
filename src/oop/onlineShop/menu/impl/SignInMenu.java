package oop.onlineShop.menu.impl;

import oop.onlineShop.configs.ApplicationContext;
import oop.onlineShop.enteties.User;
import oop.onlineShop.menu.Menu;
import oop.onlineShop.services.UserManagementService;
import oop.onlineShop.services.impl.DefaultUserManagement;

import java.util.Scanner;

public class SignInMenu implements Menu {

    private ApplicationContext context;
    private UserManagementService userManagementService;

    {
        context = ApplicationContext.getInstance();
        userManagementService = DefaultUserManagement.getInstance();

    }
    @Override
    public void start() {
        printMenuHeader();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter your email: ");
        String userEmail = sc.next();
        System.out.print("Please , enter your password:");
        String userPassword = sc.next();

        User user = userManagementService.getUserByEmail(userEmail);
        if(user != null && user.getPassword().equals(userPassword)){
            System.out.printf("Glad to see you %s %s" , user.getFirstName() ,
                    user.getLastName() + "\n");
            context.setLoggedInUser(user);
        }else{
            System.out.println("Unfortunately such login and password doesn't exist");
        }
        context.getMainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** Sign in *****");
    }
}
