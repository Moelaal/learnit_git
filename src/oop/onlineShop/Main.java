package oop.onlineShop;

import oop.onlineShop.menu.Menu;
import oop.onlineShop.menu.impl.MainMenu;

public class Main {
    public static String EXIT_COMMAND = "Exit";

    public static void main(String[] args) {
        Menu mainMenu = new MainMenu();
        mainMenu.start();
    }
}
