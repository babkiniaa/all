package org.example;

public class Multiplication {

    public Integer Umn(int a, int b) throws ModTwoZiro {
        if (a % 2 == 0 && b % 2 == 0) {
            return a * b;
        }else {
           throw new ModTwoZiro(" одно из чисел не четное");
        }
    }
}
