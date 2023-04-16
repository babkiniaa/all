package org.example;
import org.junit.Assert;

import java.io.IOException;
//import static org.junit.jupiter.api.Assertions.*;

public class IOFIieTest {

    @org.junit.Test
    public void IOTest() throws IOException {
        String str = "odin ili dva";
        IOFIie file = new IOFIie();

        file.fileWrite("one", str);
        String result = file.fileRead("one");

        Assert.assertEquals(str, result);
    }

    @org.junit.Test
    public void NIOTest() throws IOException {
        String str = "odin ili dva";
        NIOFile file = new NIOFile();

        file.fileWrite("one", str);
        String result = file.fileRead("one");

        Assert.assertEquals(str, result);

    }
}