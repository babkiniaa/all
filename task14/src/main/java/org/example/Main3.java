package org.example;

public class Main3 {

    public static void main(String[] args){
         Discr operator = (a, b ,c) ->{
             float d = (b*b)-(4*a*c);
             return d;
        };
        float a = 12.0F;
        float b = 5.0F;
        float c = 3.0F;

        float d = operator.Apply(a,b,c);
        System.out.println(d);
    }
}
