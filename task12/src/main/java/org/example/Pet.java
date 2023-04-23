package org.example;
import java.util.List;
import java.awt.*;

public class Pet {
    private String name;
    private Status status;
    private List<Photo> photosList;

    public Pet(String name, Status status,  List<Photo> photosList) {
        this.name = name;
        this.status = status;
        this.photosList = photosList;
    }
}

enum Status {
    AVAILABLE,
    SOLD,
}

class Photo {
    private String name;
    private String URL;

    public Photo(String name, String URL) {
        this.name = name;
        this.URL = URL;
    }

    public String getName() {
        return name;
    }

    public String getURL() {
        return URL;
    }


}
