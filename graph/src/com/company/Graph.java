package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

/**
 * Graph class
 */
public class Graph {

    /**
     * Edges array
     */
    private ArrayList<Edge> edges;

    /**
     * Vertex array
     */
    private ArrayList<Vertex> vertex;

    Graph() {
        this.edges = new ArrayList<>(50);
        this.vertex = new ArrayList<>(50);
    }

    /**
     * @param vertex array of Vertex objects
     */
    public void addVertex(Vertex... vertex) {
        for (Vertex v : vertex) {
            this.vertex.add(v);
        }
    }

    /**
     * @param vertex Vertex object
     * @return int id of vertex
     */
    public int addVertex(Vertex vertex) {
        this.vertex.add(vertex);
        return this.vertex.size() - 1;
    }

    /**
     * Get vertex on given index
     *
     * @param id
     * @return vertex object
     */
    public Vertex getVertex(int id) {
        return this.vertex.get(id);
    }

    /**
     * Get all vertexes
     * Returns all vertexes as array list
     *
     * @return
     */
    public ArrayList<Vertex> getAllVertex() {
        return this.vertex;
    }

    /**
     * Create edge between two vectors
     *
     * @param vertex1 first vector index
     * @param vertex2 second vector index
     */
    public Edge createEdgeBetween(Vertex vertex1, Vertex vertex2) {
        Edge edge = new Edge(vertex1, vertex2);
        vertex1.addNeighbour(vertex2);
        vertex2.addNeighbour(vertex1);
        this.edges.add(edge);
        return edge;
    }

    /**
     * function VisitNode(u):
     * oznacz u jako odwiedzony
     * dla każdego wierzchołka v na liście sąsiedztwa u:
     * jeżeli v nieodwiedzony:
     * VisitNode(v)
     * function DepthFirstSearch(Graf G):
     * dla każdego wierzchołka u z grafu G:
     * oznacz u jako nieodwiedzony
     * dla każdego wierzchołka u z grafu G:
     * jeżeli u nieodwiedzony:
     * VisitNode(u)
     *
     * @return
     */
    public void depthFirstSearch() {
        for (Vertex currentVertex : this.vertex) {
            currentVertex.visited = false;
        }

        for (Vertex currentVertex : this.vertex) {
            if (!currentVertex.visited) {
                this.visitNode(currentVertex);
            }
        }
    }

    private void visitNode(Vertex vertex) {
        vertex.visited = true;
        for (Vertex currentVertex : vertex.getNeighbours()) {
            if (!currentVertex.visited) {
                this.visitNode(currentVertex);
            }
        }
    }
}
