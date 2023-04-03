package org.example;

import java.time.LocalTime;

public class Time implements Command{
    LocalTime time;
    public void setCoommand(){
        this.time = LocalTime.now();
    }
    public LocalTime getCoommand(){
        LocalTime time = LocalTime.now();
        return time;
    }
}
