package com.nam.matrixmultiplication;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class MatrixRequest {
    private Matrix matrix1;
    private Matrix matrix2;

    public MatrixRequest() {
    }
}
