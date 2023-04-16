package org.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class IOFIie implements File{
    @Override
    public void fileWrite(String fname, String info) {
        try (PrintWriter printWriter = new PrintWriter(fname);){
            printWriter.print(info);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    @Override
    public String fileRead(String fname) {
        try (Scanner scanner = new Scanner(new java.io.File(fname))){
            String str = "";
            while (scanner.hasNext()){
                if (str.equals("")){
                    str += scanner.nextLine();
                }else {
                    str = str + "\n" + scanner.nextLine();
                }
            }
            //System.out.println(str);
            return str;
        }catch (FileNotFoundException e){
            e.printStackTrace();
            return "";
        }
    }
}
