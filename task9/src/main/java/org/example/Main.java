package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Доступные комманды: Time, Data, Exit, Ls, Pwd, Cd");
        while(true) {
            Addname str1 = new Addname();
            String s;
            s = str1.Addname();
            System.out.println(s);
            SearchWordl Sw = new SearchWordl();
            Sw.SearchWordl(s);
        }
    }
}