package org.example;

import javax.swing.*;
import java.time.LocalDate;

public class Data implements Command {

    public LocalDate data;

    public void setCoommand(){
        this.data = LocalDate.now() ;
    }

    public LocalDate getCoommand() {
        LocalDate data = LocalDate.now();
        return data;
    }
}
