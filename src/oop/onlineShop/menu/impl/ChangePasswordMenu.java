package oop.onlineShop.menu.impl;

import oop.onlineShop.configs.ApplicationContext;
import oop.onlineShop.menu.Menu;

import java.util.Scanner;

public class ChangePasswordMenu implements Menu {
    private ApplicationContext context;

    {
        context = ApplicationContext.getInstance();
    }


    @Override
    public void start() {
        printMenuHeader();
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        context.getLoggedInUser().setPassword(userInput);
        System.out.println("Password has been successfully Changed");
        new MainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("**** CHANGE PASSWORD ****");
        System.out.println("Enter new password: ");
    }
}
