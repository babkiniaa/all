package org.example;

public class Main2 {

    public static void main(String[] args) {
        Str operator = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            } else {
                return s2;
            }
        };
        System.out.println(operator.Apply("hi", "his"));
    }
}
