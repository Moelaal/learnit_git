package CollectionsTT.random.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultLruCache extends LinkedHashMap<Integer, Integer> implements LruCache {

    public int capacity;

    public DefaultLruCache(){
        super(16,0.75f,true);
    }

    public DefaultLruCache(int capacity){
        super(16,0.75f,true);
        this.capacity = capacity;
    }


    @Override
    public int get(int key) {
        Integer result = super.get(key);
        if (result ==null){
            return -1;
        }
        return super.get(key);
    }

    @Override
    public void put(int key, int value) {
        super.put(key,key);
    }

    @Override
    public void capacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
      if(size() > this.capacity){
          return true;
      }
      return false;
    }

    public static void main(String[] args) {
        DefaultLruCache lruCache = new DefaultLruCache(2);

        lruCache.put(2,2);
        lruCache.put(1,1);
        System.out.println(lruCache.get(1));

        lruCache.put(3,3);
        System.out.println(lruCache.get(2));
        lruCache.put(4,4);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));

    }


}
