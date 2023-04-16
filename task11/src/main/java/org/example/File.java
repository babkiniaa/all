package org.example;

import java.io.IOException;

public interface File {
    public void fileWrite(String fname, String info) throws IOException;

    public String fileRead(String fname);
}
