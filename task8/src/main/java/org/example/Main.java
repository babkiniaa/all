package org.example;
import java.util.HashMap;
import java.util.Map;


public class Main{
    public static void main(String[] args) {
        HashMap<String, Integer> ven = new HashMap<String, Integer>();
        MapSet MapSet = new MapSet();
        ven.put("BMW", 22);
        ven.put("Mercedes", 122);
        ven.put("Audi", 2);
        ven.put("Ford", 0);
        HashMap now = MapSet.MapSet1(ven);
        System.out.println(now);
    }
}
