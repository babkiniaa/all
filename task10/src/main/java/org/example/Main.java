package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ModTwoZiro {
        Multiplication res = new Multiplication();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите значение a ->");
        int a = in.nextInt();
        System.out.print("Введите значение b ->");
        int b = in.nextInt();

        try {
            System.out.println("Результат произведения равен: " + res.Umn(a,b));
        }catch (Exception e){
            System.out.println("Одно из чисел не четное");
        }finally {
            System.out.println("Попробуйте ещё раз ");
        }
    }
}