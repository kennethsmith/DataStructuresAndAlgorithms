package org.example;

import java.util.*;

public class Graph {

    private static class Vertex {
        String label;
        public Vertex(String label) {
            this.label = label;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vertex vertex = (Vertex) o;
            return Objects.equals(label, vertex.label);
        }

        @Override
        public int hashCode() {
            return Objects.hash(label);
        }

        @Override
        public String toString() {
            return "Vertex{" +
                    "label='" + label + '\'' +
                    '}';
        }
    }

    private final Map<Vertex, ArrayList> edges = new HashMap<>();

    public void addVertex(String label) {
        Vertex v = new Vertex(label);
        edges.put(v, new ArrayList());
    }
    public void removeVertex(String label) {
        Vertex v = new Vertex(label);
        ArrayList es = edges.get(v);
        edges.remove(v);
        es.forEach(e -> {
            edges.get(e).remove(v);
        });
    }

    public void addEdge(String v1, String v2) {
        // If this was directional, we could add v2 only to v1's list, we are going to go bidirectional.
        // So, we'll add to both edge lists.
        Vertex ver1 = new Vertex(v1);
        Vertex ver2 = new Vertex(v2);
        addToList(ver1, ver2);
        addToList(ver2, ver1);
    }

    public void removeEdge(String v1, String v2) {
        Vertex ver1 = new Vertex(v1);
        Vertex ver2 = new Vertex(v2);
        edges.get(ver1).remove(ver2);
        edges.get(ver2).remove(ver1);
    }

    private void addToList(Vertex v1, Vertex v2) {
        edges.get(v1).add(v2);
    }

    private void removeFromList(Vertex v1, Vertex v2) {
        edges.get(v1).remove(v2);
        edges.get(v2).remove(v1);
    }

    public void print() {
        Arrays.stream(edges.keySet().toArray()).toList().forEach(k -> {
            System.out.println(k.toString());
            edges.get(k).forEach(v -> {
                System.out.println("\t" + v.toString());
            });
        });
    }
}
