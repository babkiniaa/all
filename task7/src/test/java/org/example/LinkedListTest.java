package org.example;
import org.junit.Assert;

public class LinkedListTest{
    @org.junit.Test
    public void LinkedListTest(){
        LinkedList LL = new LinkedList();
        LL.add("12");
        LL.add(13);
        LL.add(14);
        LL.add(20);
        Assert.assertEquals(13, LL.get(2));
        Assert.assertEquals("12", LL.get(1));
        Assert.assertEquals(4, LL.size());

    }

}