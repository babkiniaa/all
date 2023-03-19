package org.example;
import org.junit.Assert;

public class LinkedListTestOOP {
    @org.junit.Test
    public void LinkedListTestOOP(){
        LinkedList LL = new LinkedList();
        LL.add(12);
        LL.add(14);
        LL.add(30);
        Assert.assertEquals(14, LL.get(2));
        Assert.assertEquals(12, LL.get(1));
        Assert.assertEquals(3, LL.size());

    }

}