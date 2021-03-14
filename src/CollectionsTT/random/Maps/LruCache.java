package CollectionsTT.random.Maps;

public interface LruCache {
    int get(int key);
    void put(int key,int value);
    void capacity(int capacity);


}
