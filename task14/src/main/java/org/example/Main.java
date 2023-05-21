package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        for (;;) {
            int n1 = io.nextInt();
            System.out.println(Process(n1, a -> a % 13 == 0));
            if ( Process(n1, a -> a % 13 == 0)){
                break;
            }
        }

    }

    public static Boolean Process(int a, In<Integer> functoin){
        return functoin.apply(a);
    }
}