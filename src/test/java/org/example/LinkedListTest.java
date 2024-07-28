package org.example;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class LinkedListTest {
    @Test
    public void test() {
        LinkedList ll = new LinkedList();
        IntStream.range(0, 5).forEachOrdered(ll::insert);
        ll.print();
    }
}
