package org.example;
import org.junit.Assert;

import java.util.Optional;

import static java.util.Optional.*;

public class PairTest {
    @org.junit.Test
    public void PairTest(){
        Integer I = 1;
        String J = "SE";
        Pair<Integer, String> Pai = new Pair<>(I, J);
        Assert.assertEquals(I, Pai.getKey());
        Assert.assertEquals(J, Pai.getValue());
    }

    @org.junit.Test
    public void PairTest1(){
        Integer I = 2;
        String J = "SE1";
        Pair<Integer, String> Pai = new Pair<>(I, J);
        Assert.assertEquals(I, Pai.getKey());
        Assert.assertEquals(J, Pai.getValue());
    }
}