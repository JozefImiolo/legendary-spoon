package com.company;

/**
 *
 * @param <T>
 */
public class Pair<T, I> {
    private T el1;
    private I el2;

    /**
     *
     * @param el1 T
     * @param el2 I
     */
    Pair(T el1, I el2) {
        this.el1 = el1;
        this.el2 = el2;
    }

    /**
     *
     * @return T
     */
    public T getFirst() {
        return el1;
    }

    /**
     *
     * @return T
     */
    public I getSecond() {
        return el2;
    }


}
