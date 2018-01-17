package com.company;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(new Vertex(1),
                new Vertex(2),
                new Vertex(3),
                new Vertex(4),
                new Vertex(78),
                new Vertex(12)
        );

        graph.createEdgeBetween(graph.getVertex(0), graph.getVertex(1));
        graph.createEdgeBetween(graph.getVertex(1), graph.getVertex(2));
        graph.createEdgeBetween(graph.getVertex(2), graph.getVertex(3));
        graph.createEdgeBetween(graph.getVertex(3), graph.getVertex(4));
        graph.createEdgeBetween(graph.getVertex(4), graph.getVertex(5));

        graph.depthFirstSearch();

        for (Vertex v : graph.getAllVertex()) {
            System.out.println(v.visited);
        }
    }
}
