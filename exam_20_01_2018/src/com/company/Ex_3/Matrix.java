package com.company.Ex_3;

public interface Matrix<T extends Number> {
    T get(int row, int column) throws Exception;

    void set(int row, int column, T value) throws Exception;
}
