package org.example;
import org.junit.Assert;

import javax.accessibility.Accessible;
import java.nio.file.AccessDeniedException;

public class MultiplicationTest {

    @org.junit.Test
    public void UmnTest() throws ModTwoZiro{
        Multiplication Sra = new Multiplication();
        int res = Sra.Umn(2,6);
        Assert.assertEquals(res , 12);
    }

    @org.junit.Test
    public void UmnTest1() throws ModTwoZiro {
        Multiplication Sra = new Multiplication();
        int res = Sra.Umn(1, 6);
        Assert.assertEquals(res, 6);
    }

    @org.junit.Test(expected = AccessDeniedException.class)
    public void UmnTest2() throws ModTwoZiro {
        Multiplication Sra = new Multiplication();
        int res = Sra.Umn(1, 6);
        Assert.assertEquals(res, " одно из чисел не четное");
    }
}