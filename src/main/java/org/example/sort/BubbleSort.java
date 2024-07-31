package org.example.sort;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class BubbleSort {
    private int [] list;

    public BubbleSort(int[] list) {
        this.list = list;
    }

    public void print() {
        System.out.println("Unsorted: " + Arrays.toString(list));
        System.out.println("Sorted: " + Arrays.toString(this.sort()));
    }

    public int[] sort() {
        return bubbleSort(this.list);
    }

    static int[] bubbleSort(final int[] a) {
        int[] n = deepCopy(a);
        AtomicInteger comparisons = new AtomicInteger();
        AtomicInteger assignments = new AtomicInteger();
        IntStream.range(0, n.length).forEach(i -> {
            IntStream.range(0, n.length - i - 1).forEach(j -> {
                comparisons.incrementAndGet();
                if(n[j] > n[j+1]) {
                    int t = n[j];
                    n[j] = n[j+1];
                    n[j+1] = t;
                    assignments.addAndGet(3);
                }
                System.out.println(Arrays.toString(n) + " i: " + i + ", j: " + j);
            });
        });
        System.out.println("Comparisons/iterations: " + comparisons + "   Assignments: " + assignments);
        return n;
    }

    static int[] deepCopy(int[] a) {
        int[] n = new int[a.length];
        IntStream.range(0, a.length).forEach(i -> {
            n[i] = a[i];
        });
        return n;
    }
}
