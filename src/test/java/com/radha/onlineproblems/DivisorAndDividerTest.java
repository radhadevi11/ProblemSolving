package com.radha.onlineproblems;

import com.radha.onlineproblems.DivisorAndDivider;
import org.junit.Test;

public class DivisorAndDividerTest {

    @Test
    public void testPrintAllDividerAndDivisor(){
        int[] array1 = new int[]{1, 2, 2, 4};
        int[] array2 = new int[]{16, 32, 64};

        DivisorAndDivider divisorAndDivider = new DivisorAndDivider();
        divisorAndDivider.printAllDividerAndDivisor(array1,array2);
    }

}