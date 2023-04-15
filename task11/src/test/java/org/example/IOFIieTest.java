package org.example;
import org.junit.Assert;
//import static org.junit.jupiter.api.Assertions.*;

public class IOFIieTest {

    @org.junit.Test
    public void fileWriteTest() {
        String str = "odin ili dva";
        IOFIie iofIie = new IOFIie();
        NIOFile nioFile = new NIOFile();
        iofIie.fileWrite("one",str);
        nioFile.fileWrite("two", str);
        String str1 = nioFile.fileRead("one");
        String str2 = iofIie.fileRead("two");
        System.out.println(str2);
        System.out.println(str1);
        Assert.assertEquals(str1,str2);

    }
}