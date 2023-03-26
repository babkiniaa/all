package org.example;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class DocText {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("C:\\Users\\Ярик\\Desktop\\task8\\src\\main\\java\\org\\example\\notes.txt")) {
            Map<String, Integer> counts = new HashMap<String, Integer>();
            byte[] buffer = new byte[256];
            System.out.println("File data:");
            String s="";
            int count;
            while ((count = fin.read(buffer)) != -1) {
                for (int i = 0; i < count; i++) {
                    if (buffer[i]==' '){
                        System.out.println(s);
                        int s1=0;
                        if (counts.get(s) == null){
                            s1=1;
                            counts.put(s, s1);
                        }else{
                            s1 = counts.get(s);
                            s1+=1;
                            counts.put(s,s1);
                        }
                        s="";
                    }else{
                        s = s + (char) buffer[i];
                    }
                }
            }
            for (String key : counts.keySet()) {
                System.out.println(key + " - " + counts.get(key));
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }
    }
}
