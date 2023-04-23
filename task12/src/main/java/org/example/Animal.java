package org.example;

import java.util.Map;

public class Animal {
    private    String title;
    private   boolean isAvailable;
    private  boolean isSold;
    private  Map<String, String> photosMap;

    @Override
    public String toString() {
        // Реализовать метод.
        return "Кличка: " + title  + " Avaible: " + isAvailable + " Sold: " + isSold + "\n Его фотографии" + photosMap;
    }
}
