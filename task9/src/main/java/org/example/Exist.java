package org.example;

import java.time.LocalTime;

public class Exist implements Command{
    public void setCoommand(){
    }
    public Integer getCoommand(){
        System.out.println(" Приходите к нам еще! ");
        System.exit(0);
        return 1;
    }
}
