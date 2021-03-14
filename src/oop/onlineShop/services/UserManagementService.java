package oop.onlineShop.services;

import oop.onlineShop.enteties.User;

public interface UserManagementService {
    String registerUser(User user);
    User[] getUsers();
    User getUserByEmail(String userEmail);
}
