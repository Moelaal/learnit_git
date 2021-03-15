package generics;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Testtt1 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.put("1","a");
        p.put("2","b");

        Set s = p.keySet();
        Iterator i = s.iterator();

        while (i.hasNext()){
            String key = (String) i.next();
            String str = key +":"+p.getProperty(key);
            System.out.println(str);
        }



    }
}
