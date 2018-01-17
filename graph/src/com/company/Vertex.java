package com.company;

import java.util.ArrayList;

/**
 * Vertex class
 */
public class Vertex {

    /**
     *
     */
    private int value;

    /**
     *
     */
    private String label;

    /**
     * @param value
     * @param label
     */
    private ArrayList<Vertex> neighbours;

    /**
     * Has been visited already?
     */
    public boolean visited = false;

    /**
     * @param value value of vertex
     * @param label label of vertex
     */
    Vertex(int value, String label) {
        this.setValue(value);
        this.setLabel(label);
        this.neighbours = new ArrayList<>();
    }

    /**
     * @param value value of vertex
     */
    Vertex(int value) {
        this.setValue(value);
        this.setLabel("");
        this.neighbours = new ArrayList<>();
    }

    /**
     * Value setter
     *
     * @param value new value of vertex
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Label setter
     *
     * @param label new label of vertex
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Value getter
     *
     * @return vertex value
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Label getter
     *
     * @return vertex label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Get neighbours
     * Returns edge neighbours
     * @return
     */
    public ArrayList<Vertex> getNeighbours() {
        return this.neighbours;
    }

    public void addNeighbour(Vertex vertex) {
        this.neighbours.add(vertex);
    }

}
