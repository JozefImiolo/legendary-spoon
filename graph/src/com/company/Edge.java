package com.company;

/**
 * Edge class
 */
public class Edge {

    /**
     * First end of edge
     */
    private Vertex end1;

    /**
     * Second end of edge
     */
    private Vertex end2;

    /**
     * @param vertex1 first end of edge
     * @param vertex2 second end of edge
     */
    Edge(Vertex vertex1, Vertex vertex2) {
        this.end1 = vertex1;
        this.end2 = vertex2;
    }

    public Vertex getEnd1() {
        return this.end1;
    }

    public Vertex getEnd2() {
        return this.end2;
    }
}
