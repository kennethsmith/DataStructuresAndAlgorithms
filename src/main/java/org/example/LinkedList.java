package org.example;

public class LinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    private Node head = null;
    public void insert(int data) {
        if(head == null) {
            head = new Node(data);
        } else {
            insertNode(head, new Node(data));
        }
    }

    public void print() {
        printNode(head);
    }

    private void insertNode(Node c, Node n) {
        if (c.next == null) {
            c.next = n;
        } else {
            insertNode(c.next, n);
        }
    }
    public void printNode(Node n) {
        if(n != null) {
            System.out.println(n.data);
            printNode(n.next);
        }
    }
}
