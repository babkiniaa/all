package org.example;
import java.util.HashMap;
import java.util.Map;

public class MapSet {
    public <V, K>HashMap MapSet1(Map<K, V> old) {
        Map<V, K> nuw = new HashMap<>();
        for (K key : old.keySet()) {
            nuw.put(old.get(key), key);
        }
        System.out.println(old);
        System.out.println(nuw);
        return (HashMap<V, K>) nuw;
    }
}

