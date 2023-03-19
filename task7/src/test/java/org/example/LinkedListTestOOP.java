package org.example;
import org.junit.Assert;

import java.util.Optional;

public class LinkedListTestOOP {
    @org.junit.Test
    public void LinkedListTestOOP(){
        LinkedListOOP <Integer> LLO = new LinkedListOOP();
        LLO.add(12);
        LLO.add(14);
        LLO.add(30);
        Integer I = LLO.get(2);
        Integer C = LLO.get(1);
        Assert.assertEquals(I, LLO.get(2));
        Assert.assertEquals(C, LLO.get(1));
        Assert.assertEquals(3, LLO.size());

    }

}