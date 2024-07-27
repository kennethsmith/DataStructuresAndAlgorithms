package org.example.trees;

import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void test() {
        BinaryTree b = new BinaryTree();
        b.add("50");
        b.add("1");
        b.add("0");
        b.add("2");
        b.add("70");
        b.add("60");
        b.add("80");
        b.print();
        //b.remove("70");
        //System.out.println("After we remove 70.");
        //b.print();
        b.remove("50");
        System.out.println("After we remove 50.");
        b.print();
    }

    @Test
    public void testOofn() {
        BinaryTree b = new BinaryTree();
        b.add("0");
        b.add("1");
        b.add("2");
        b.add("3");
        b.add("4");
        b.add("5");
        b.add("6");
        b.print();
    }
}
