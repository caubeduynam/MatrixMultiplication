package com.nam.matrixmultiplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MatrixController {
    private final MatrixService matrixService;

    @Autowired
    public MatrixController(MatrixService matrixService) {
        this.matrixService = matrixService;
    }

    @PostMapping("/multiply")
    public ResponseEntity<Matrix> multiplyMatrices(@RequestBody MatrixRequest request) {
        Matrix matrix1 = request.getMatrix1();
        Matrix matrix2 = request.getMatrix2();

        Matrix result = matrixService.multiply(matrix1, matrix2);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Matrix> addMatrices(@RequestBody MatrixRequest request) {
        Matrix matrix1 = request.getMatrix1();
        Matrix matrix2 = request.getMatrix2();

        Matrix result = matrixService.add(matrix1, matrix2);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
