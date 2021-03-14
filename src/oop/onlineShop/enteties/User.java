package oop.onlineShop.enteties;

public interface User {
    String getFirstName();
    String getLastName();
    String getPassword();
    String getEmail();
    int getId();

    void setPassword(String newPassWord);
    void setEmail(String newEmail);


}
