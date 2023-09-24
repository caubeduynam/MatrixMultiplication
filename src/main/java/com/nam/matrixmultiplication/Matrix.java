package com.nam.matrixmultiplication;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Matrix {
    private int rows;
    private int columns;
    private int[][] data;

    // Constructor
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }
}
