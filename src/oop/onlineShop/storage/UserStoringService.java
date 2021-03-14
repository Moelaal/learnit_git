package oop.onlineShop.storage;

import oop.onlineShop.enteties.User;

import java.util.List;

public interface UserStoringService {
    void saveUsers(User user);
    List<User> loadUsers();
}
