package org.example.trees;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void print() {
        BinaryTree a = getBinaryTree();
        a.print();
    }

    @Test
    void add() {
        BinaryTree a = getBinaryTree();
        a.add(null);
        a.add("70");
        a.add("10");
        assertNotNull(a.get("80"));
        assertNotNull(a.get("5"));
    }

    @Test
    void remove() {
        BinaryTree a = new BinaryTree();
        a.remove("0");

        a = getBinaryTree();
        a.remove("50");
        BinaryTree.Node n = a.get("50");
        assertNull(n);

        a.remove("80");
        n = a.get("80");
        assertNull(n);

        a.remove("0");
        n = a.get("0");
        assertNull(n);

        a.remove("2");
        n = a.get("2");
        assertNull(n);
    }

    @Test
    void removeCoverage01() {
        BinaryTree a = new BinaryTree();
        a.add("50");
        a.add("10");
        a.remove("50");
        assertNull(a.get("50"));
        assertNotNull(a.get("10"));
    }

    @Test
    void removeCoverage02() {
        BinaryTree a = new BinaryTree();
        a.add("50");
        a.add("60");
        a.remove("50");
        assertNull(a.get("50"));
        assertNotNull(a.get("60"));
    }

    @Test
    void removeCoverage03() {
        BinaryTree a = new BinaryTree();
        a.add("50");
        a.add("40");
        a.add("30");
        a.remove("40");
        assertNull(a.get("40"));
        assertNotNull(a.get("30"));
    }

    @Test
    void removeCoverage04() {
        BinaryTree a = new BinaryTree();
        a.add("50");
        a.add("60");
        a.add("70");
        a.add("65");
        a.add("75");
        a.remove("70");
        assertNull(a.get("70"));
        assertNotNull(a.get("65"));
        assertNotNull(a.get("75"));
    }

    @Test
    void removeCoverage05() {
        BinaryTree a = new BinaryTree();
        a.add("50");
        a.add("60");
        a.add("40");
        a.remove("50");
        a.remove("60");
        a.remove("40");
        assertNull(a.get("50"));
        assertNull(a.get("66"));
        assertNull(a.get("40"));
    }

    @Test
    void getNodesTest() {
        BinaryTree a = new BinaryTree();
        BinaryTree.Node n = a.get(null);
        assertNull(n);
        n = a.get("20");
        assertNull(n);

        a = getBinaryTree();
        n = a.get(null);
        assertNull(n);
        n = a.get("50");
        assertEquals("50", n.value);

        a.remove("50");
        n = a.get("50");
        assertNull(n);
    }

    BinaryTree getBinaryTree() {
        BinaryTree b = new BinaryTree();
        b.add("50");
        b.add("10");
        b.add("5");
        b.add("0");
        b.add("20");
        b.add("30");
        b.add("70");
        b.add("60");
        b.add("80");
        return b;
    }
}