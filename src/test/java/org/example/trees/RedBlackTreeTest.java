package org.example.trees;

import org.junit.Test;

public class RedBlackTreeTest {

    @Test
    public void test() {
        //Create instance of the createRedBlackTree class and pass minimum integer value to the constructor to make it header node
        RedBlackTree rbt = new RedBlackTree(Integer.MIN_VALUE);
        rbt.insertNewNode(50);
        rbt.insertNewNode(1);
        rbt.insertNewNode(0);
        rbt.insertNewNode(2);
        rbt.insertNewNode(70);
        rbt.insertNewNode(60);
        rbt.insertNewNode(80);
        rbt.inorderTraversal();;
    }

    @Test
    public void testOofn() {
        RedBlackTree rbt = new RedBlackTree(Integer.MIN_VALUE);;
        rbt.insertNewNode(0);
        rbt.insertNewNode(1);
        rbt.insertNewNode(2);
        rbt.insertNewNode(3);
        rbt.insertNewNode(4);
        rbt.insertNewNode(5);
        rbt.insertNewNode(6);
        rbt.inorderTraversal();;
    }
}
