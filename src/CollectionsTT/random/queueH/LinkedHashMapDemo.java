package CollectionsTT.random.queueH;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo extends LinkedHashMap<Integer, String> {

    private int capacity = 3;

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        if(size() > this.capacity){
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedHashMap map = new LinkedHashMap();

        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");

        System.out.println(map);
    }
}
