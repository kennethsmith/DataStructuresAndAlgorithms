package org.example;

public class Stack {
    private static class Node {
        int data;
        Node previous;

        Node(int data) {
            this.data = data;
            this.previous = null;
        }
    }

    private Node tail = null;

    public void push(int data) {
        if(tail == null) {
            tail = new Node(data);
        } else {
            Node n = new Node(data);
            n.previous = tail;
            tail = n;
        }
    }

    public int pop() throws Exception {
        if(tail != null) {
            Node c = tail;
            tail = tail.previous;
            return c.data;
        }
        throw new Exception("Empty Stack!");
    }
}
