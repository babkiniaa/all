package org.example;

import java.util.Scanner;

public class Main {
    static String str, filename1, filename2;
    public static void main(String[] args) {
        vod();
        IOFIie iofIie = new IOFIie();
        NIOFile nioFile = new NIOFile();
        iofIie.fileWrite(filename1, str);
        nioFile.fileWrite(filename2, str);

        System.out.println(iofIie.fileRead(filename1));
        System.out.println(nioFile.fileRead(filename2));
    }
    public static void vod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        str = scanner.nextLine();
        System.out.println("Введите имя первого файла");
        filename1 = scanner.nextLine();
        System.out.println("Введите имя второого файла");
        filename2 = scanner.nextLine();

    }
}