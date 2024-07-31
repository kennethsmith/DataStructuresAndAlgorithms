package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    private Graph getGraph() {
        Graph g = new Graph();
        g.addVertex("1");
        g.addVertex("2");
        g.addVertex("3");
        g.addVertex("4");
        g.addEdge("1", "2");
        g.addEdge("3", "4");
        g.addEdge("2", "3");
        return g;
    }

    @Test
    void addVertexAndEdge() {
        Graph a = getGraph();
        Graph b = getGraph();
        assertEquals(a, b);
    }

    @Test
    void removeVertex() {
        Graph a = getGraph();
        a.removeVertex("1");
        Graph b = getGraph();
        b.removeVertex("1");
        assertEquals(a, b);
    }

    @Test
    void addVertex() {
        Graph a = getGraph();
        a.addVertex("1");
        Graph b = getGraph();
        b.addVertex("1");
        assertEquals(a, b);
    }

    @Test
    void removeEdge() {
        Graph a = getGraph();
        a.removeEdge("1", "2");
        Graph b = getGraph();
        b.removeEdge("1", "2");
        assertEquals(a, b);
    }

    @Test
    void addEdge() {
        Graph a = getGraph();
        a.addEdge("1", "2");
        Graph b = getGraph();
        b.addEdge("1", "2");
        assertEquals(a, b);
    }

    @Test
    void print() {
        Graph a = getGraph();
        a.print();
    }

    @Test
    void hashCodeTest() {
        Graph a = getGraph();
        Graph b = getGraph();
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void graphEqualsTest() {
        Graph a = getGraph();
        Object i = new Object();
        assertTrue(a.equals(a));
        assertFalse(a.equals(null));
        assertFalse(a.equals(i));
    }

    @Test
    void vertexEqualsTest() {
        Graph.Vertex a = new Graph.Vertex("a");
        Object i = new Object();
        assertTrue(a.equals(a));
        assertFalse(a.equals(null));
        assertFalse(a.equals(i));
    }
}