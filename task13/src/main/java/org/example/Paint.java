package org.example;
import java.lang.annotation.*;
import java.awt.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Paint {

    String style();

    String color() ;
}
