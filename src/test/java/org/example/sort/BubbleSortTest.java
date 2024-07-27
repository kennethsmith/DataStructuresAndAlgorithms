package org.example.sort;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {
    @Test
    public void test() {
        int[] i = {8,7,6,5,4,3,2,1};
        int[] t = BubbleSort.bubbleSort(i);
        System.out.println(Arrays.toString(t));
    }
}
