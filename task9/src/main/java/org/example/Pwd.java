package org.example;

import java.io.File;

public class Pwd implements Command{
    public void setCoommand(){

    }

    public String getCoommand() {
        final File file = new File("task10");
        String absolutePath = file.getAbsolutePath();
        String filePath = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
        String filePath1 = filePath.substring(0,filePath.lastIndexOf(File.separator));
        if (file.exists()) {
            System.out.println("директория файла: " + file.getAbsolutePath());
        }
        return filePath1;
    }
}
