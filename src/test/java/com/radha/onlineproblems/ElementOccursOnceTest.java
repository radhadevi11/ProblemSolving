package com.radha.onlineproblems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElementOccursOnceTest {

    @Test
    public void testFindElementOccursOnce(){
        ElementOccursOnce obj = new ElementOccursOnce();
        int a[] = new int[]{2, 2, 5, 5, 20, 30, 30};

        int actual = obj.findElementOccursOnce(a);

        assertEquals(actual, 20);


    }

}