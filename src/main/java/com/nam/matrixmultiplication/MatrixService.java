package com.nam.matrixmultiplication;

import org.springframework.stereotype.Service;

@Service
public class MatrixService {
    public Matrix multiply(Matrix matrix1, Matrix matrix2) {
        int rows1 = matrix1.getRows();
        int columns1 = matrix1.getColumns();
        int columns2 = matrix2.getColumns();

        // Kiểm tra nếu số cột của ma trận 1 không bằng số hàng của ma trận 2
        if(columns1 != matrix2.getRows()) {
            throw new IllegalArgumentException("Cannot multiply matrices. Invalid dimensions.");
        }

        Matrix result = new Matrix(rows1, columns2);

        for(int i = 0; i < rows1; i++) {
            for(int j = 0; j < columns2; j++) {
                int value = 0;
                for(int k = 0; k < columns1; k++) {
                    value += matrix1.getData()[i][k] * matrix2.getData()[k][j];
                }
                result.getData()[i][j] = value;
            }
        }
        return result;
    }

    public Matrix add(Matrix matrix1, Matrix matrix2) {
        int rows = matrix1.getRows();
        int columns = matrix1.getColumns();

        // Kiểm tra nếu số hàng, cột của ma trận 1  bằng số hàng, cột của ma trận 2
        if (rows != matrix2.getRows() || columns != matrix2.getColumns()) {
            throw new IllegalArgumentException("Cannot add matrices. Invalid dimensions.");
        }

        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.getData()[i][j] = matrix1.getData()[i][j] + matrix2.getData()[i][j];
            }
        }
        return result;
    }
}
