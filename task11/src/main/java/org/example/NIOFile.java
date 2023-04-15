package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOFile implements File{
    @Override
    public void fileWrite(String fname, String info) {
        try (PrintWriter printWriter = new PrintWriter(fname);){
            printWriter.println(info);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    @Override
    public String fileRead(String fname) {
        try {
            String data = null;
            data = new String(Files.readAllBytes(Paths.get(fname)));
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

