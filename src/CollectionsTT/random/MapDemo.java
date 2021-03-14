package CollectionsTT.random;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(32,"one");
        map.put(13,"two");
        map.put(40,"three");
        map.put(35,"four");

        System.out.println("---------");
        List<Map.Entry<Integer,String>> list = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());

        Collections.shuffle(list);
        System.out.println("List" +  list);
        System.out.println("");

        list.sort(Map.Entry.comparingByKey());

        System.out.println("Sorting map by comparable key with TreeMap:");

        Map<Integer,String > sortedMap = new TreeMap<>(map);
        System.out.println("Elements in Tree Map: " + sortedMap);

        System.out.println("Sorting map by comparable Value");

        Collections.shuffle(list);
        System.out.println("Entries before sorting : " + list);

        list.sort(Map.Entry.comparingByValue());
        Collections.sort(list,Map.Entry.comparingByValue());

        System.out.println("Entries after sorting by value: " + list);

        Map<Integer,String> map2 = Map.ofEntries(list.toArray(Map.Entry[]::new));

    }
}
