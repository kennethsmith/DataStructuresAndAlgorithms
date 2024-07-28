package org.example;

import org.junit.jupiter.api.Test;

public class GraphTest {

    @Test
    public void test() {
        Graph g = new Graph();
        g.addVertex("1");
        g.addVertex("2");
        g.addVertex("3");
        g.addVertex("4");
        g.addEdge("1", "2");
        g.addEdge("3", "4");
        g.addEdge("2", "3");
        System.out.println("State 1:");
        g.print();
        g.removeVertex("2");
        System.out.println("State 2: (drop vertex 2)");
        g.print();
        g.removeVertex("1");
        System.out.println("State 3: (drop vertex 1)");
        g.print();
        g.removeEdge("3", "4");
        System.out.println("State 3: (drop vertex 1)");
        g.print();
    }
}
