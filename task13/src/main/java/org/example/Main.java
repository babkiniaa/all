package org.example;

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        print(new OnlyOne());
    }

    public static void print(OnlyOne onle) throws NoSuchMethodException {

        Method field1 = onle.getClass().getDeclaredMethod("sos");
        Method field2 = onle.getClass().getDeclaredMethod("help");
        Method field3 = onle.getClass().getDeclaredMethod("ey");

        field1.setAccessible(true);
        field2.setAccessible(true);
        field3.setAccessible(true);

        try {

            if(field1.isAnnotationPresent(Paint.class)){
                System.out.println(field1.getAnnotation(Paint.class).color() + field1.getAnnotation(Paint.class).style() + field1.invoke(onle));
            }else if(onle.getClass().isAnnotationPresent(Paint.class)){
                System.out.println(onle.getClass().getAnnotation(Paint.class).color() + onle.getClass().getAnnotation(Paint.class).style() + field1.invoke(onle));
            }

            if(field2.isAnnotationPresent(Paint.class)){
                System.out.println(field2.getAnnotation(Paint.class).color() + field2.getAnnotation(Paint.class).style() + field2.invoke(onle));
            }else if(onle.getClass().isAnnotationPresent(Paint.class)){
                System.out.println(onle.getClass().getAnnotation(Paint.class).color() + onle.getClass().getAnnotation(Paint.class).style() + field2.invoke(onle));
            }

            if(field3.isAnnotationPresent(Paint.class)){
                System.out.println(field3.getAnnotation(Paint.class).color() + field3.getAnnotation(Paint.class).style() + field3.invoke(onle));
            }else if(onle.getClass().isAnnotationPresent(Paint.class)){
                System.out.println(onle.getClass().getAnnotation(Paint.class).color() + onle.getClass().getAnnotation(Paint.class).style() + field3.invoke(onle));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}