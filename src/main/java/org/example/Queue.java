package org.example;

public class Queue {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void add(int data) {
        if(head == null) {
            head = new Node(data);
            tail = head;
        } else {
            tail.next = new Node(data);
            tail = tail.next;
        }
    }

    public int get() throws Exception {
        if(head != null) {
            Node c = head;
            head = c.next;
            return c.data;
        }
        throw new Exception("Queue empty!!");
    }
}
