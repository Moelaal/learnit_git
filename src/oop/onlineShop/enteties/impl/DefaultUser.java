package oop.onlineShop.enteties.impl;

import oop.onlineShop.enteties.User;

public class DefaultUser implements User {
    private static int userCounter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    {
        id = ++userCounter;
    }

    public DefaultUser(Integer integer, String userElement, String element, String s, String userElement1){}

    public DefaultUser(String firstName,String lastName,String password,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public int getId() {
        return this.id;
    }


    @Override
    public void setPassword(String newPassWord) {
        if(newPassWord == null){
            return;
        }
        this.password = newPassWord;
    }

    @Override
    public void setEmail(String newEmail) {
        if(newEmail  == null){
            return;
        }
        this.email = newEmail;

    }

    @Override
    public String toString() {
        return "DefaultUser{" +
                "id=" + id +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", password='" + this.getPassword() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                '}';
    }

    void clearState(){
        userCounter = 0;
    }
}
