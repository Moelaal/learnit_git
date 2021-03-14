package CollectionsTT.random.queueH;

import oop.onlineShop.enteties.User;

import java.util.Objects;

public class UserForHashTables implements User {

    private static int counter = 0;

    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    {
        id = ++counter;
    }

    public UserForHashTables(){}

    public UserForHashTables(int id ,String firstName,String lastName,String password,String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }



    public UserForHashTables(String firstName, String lastName,String password,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        counter--;
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
        return this.lastName;
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
        this.password = newPassWord;
    }

    @Override
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserForHashTables)) return false;
        UserForHashTables that = (UserForHashTables) o;
        return getId() == that.getId() && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getPassword(), that.getPassword()) && Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getPassword(), getEmail());
    }

    @Override
    public String toString() {
        return "UserForHashTables{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    void clearState(){
        counter++;
    }
}
