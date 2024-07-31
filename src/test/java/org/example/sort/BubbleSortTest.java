package org.example.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class BubbleSortTest {
    @Test
    public void test() {
        int[] e = {0,1,2,3,4,5,6,7,8};
        int[] i = {8,7,6,5,4,3,2,0,1};
        int[] t = BubbleSort.bubbleSort(i);
        assertArrayEquals(e, t);
    }

    @Test
    public void newTest() {
        int[] e = {1,2,3,4,5,6,7,8};
        int[] i = {8,7,6,5,4,3,2,1};
        BubbleSort t = new BubbleSort(i);
        int [] r = t.sort();
        t.print();
        assertArrayEquals(e, r);
    }
}
