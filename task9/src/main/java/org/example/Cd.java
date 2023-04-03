package org.example;

import java.io.File;
import java.time.LocalDate;

public class Cd implements Command{
    public void setCoommand(){

    }

    public String getCoommand(String a) {
        final File file = new File(a);
        String absolutePath = file.getAbsolutePath();

        return absolutePath;
    }
}

