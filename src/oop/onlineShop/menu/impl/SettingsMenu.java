package oop.onlineShop.menu.impl;

import oop.onlineShop.configs.ApplicationContext;
import oop.onlineShop.menu.Menu;

import java.util.Scanner;

public class SettingsMenu implements Menu {
    private static final String Settings = "1. Change Password " + "\n" + "2. change Email";

    private ApplicationContext context;
    {
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        Menu menuToNavigate = null;
        mainLoop: while(true){
            printMenuHeader();
            if(context.getLoggedInUser() == null){
                System.out.println("Please, log in or create new account to change your account settings");
                new MainMenu().start();
                return;
            }else{
                System.out.println(Settings);
                System.out.println("Please enter option or type 'Menu' to back to navigate back to the main menu");
                Scanner sc = new Scanner(System.in);
                String userInput = sc.next();
                if (userInput.equalsIgnoreCase(MainMenu.MENU_COMMAND)){
                    menuToNavigate = new MainMenu();
                    break mainLoop;
                }

                int userOpt = Integer.parseInt(userInput);
                switch(userOpt){
                    case 1:
                        menuToNavigate  = new ChangePasswordMenu();
                        break mainLoop;
                    case 2 :
                        menuToNavigate = new ChangeEmailMenu();
                        break mainLoop;
                    default:
                        System.out.println("Only 1,2 is allowed. Try one more time");
                }
            }
        }
        menuToNavigate.start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("**** Settings *****");
    }
}