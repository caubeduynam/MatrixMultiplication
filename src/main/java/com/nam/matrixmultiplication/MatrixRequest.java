package com.nam.matrixmultiplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatrixRequest {
    private Matrix matrix1;
    private Matrix matrix2;
}
