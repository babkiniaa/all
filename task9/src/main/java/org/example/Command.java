package org.example;

public interface Command {

     default void setCoommand(){

     }

    default Object getCoommand(){
        return null;
    }

}
