package com.company.Ex_3;

import java.lang.reflect.Array;

@SuppressWarnings("unchecked")

public class DenseMatrix<T extends Number> implements Matrix<T> {

    private int rowsCount, columnsCount;
    private T[][] matrix;

    @SuppressWarnings("unchecked")
    public DenseMatrix(int rows, int columns) {
        rowsCount = rows;
        columnsCount = columns;
    }

    @Override
    public T get(int row, int column) throws Exception {
        isOutOfRange(row, column);

        return matrix[row][column];
    }

    @Override
    /**
     * We have to initialize generic array and we need object of T in order
     * to do this, so we wait with initialization until first `set()`.
     */
    public void set(int row, int column, T value) throws Exception {
        isOutOfRange(row, column);
        initializeMatrixIfNotInitialized(value);

        matrix[row][column] = value;
    }

    private void isOutOfRange(int row, int column) throws Exception {
        if (row > rowsCount || column > columnsCount) {
            throw new Exception("Index out of range!");
        }
    }

    private void initializeMatrixIfNotInitialized(T value) {
        if (matrix == null) {
            matrix = (T[][]) Array.newInstance(value.getClass(), rowsCount, columnsCount);
        }
    }
}
