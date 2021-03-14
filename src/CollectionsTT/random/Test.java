package CollectionsTT.random;

import oop.onlineShop.enteties.User;
import oop.onlineShop.enteties.impl.DefaultUser;
import CollectionsTT.random.queueH.UserForHashTables;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        System.out.println("Add 1 element ; " + set.add(1));
        System.out.println("add 2 element:" + set.add(2));


        System.out.println("---------------");
        Set<User> users = new HashSet<>();
        User user1 = new DefaultUser("Mohamed","Abdelaal","32432l","mdfd@gamil.com");

        User user2 = new DefaultUser("Mohamed","Abdelaal","32432l","mdfd@gamil.com");

        users.add(user1);
        users.add(user2);

        for(User user: users){
            System.out.println(user);
        }

        System.out.println("---------------");
        User user3 = new UserForHashTables(2,"Fathi","Elrays","233dsfa","32rl@gmail.com");
        User user4 = new UserForHashTables(2,"Fathi","Elrays","233dsfa","32rl@gmail.com");

        users.add(user3);
        users.add(user4);
        for(User user:users){
            System.out.println(user);
        }

        }
    }
