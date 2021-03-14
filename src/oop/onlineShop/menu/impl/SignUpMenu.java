package oop.onlineShop.menu.impl;

import oop.onlineShop.configs.ApplicationContext;
import oop.onlineShop.enteties.User;
import oop.onlineShop.enteties.impl.DefaultUser;
import oop.onlineShop.menu.Menu;
import oop.onlineShop.services.UserManagementService;
import oop.onlineShop.services.impl.DefaultUserManagement;

import java.util.Scanner;

public class SignUpMenu implements Menu{
    private UserManagementService userManagementService;
    private ApplicationContext context;

    {
        userManagementService = DefaultUserManagement.getInstance();
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first name:");
        String firstName = scanner.next();
        System.out.print("Please enter your last name:");
        String lastName = scanner.next();
        System.out.print("Please enter your password:");
        String password = scanner.next();
        System.out.print("Please enter your email:");

        scanner = new Scanner(System.in);
        String email = scanner.next();

        User user = new DefaultUser(firstName,lastName,password,email);
        String errorMessage = userManagementService.registerUser(user);
        if(errorMessage == null|| errorMessage.isEmpty()){
            context.setLoggedInUser(user);
            System.out.println("New user is created");
        }else{
            System.out.println(errorMessage);
        }

        context.getMainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("**** SIGN UP ****");
    }

}
