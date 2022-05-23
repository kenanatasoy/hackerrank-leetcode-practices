package org.example.practices;

public class RotateImage {

    public void rotate(int[][] matrix) {

        int matrixLength = matrix.length;
        int innerIteration = matrixLength;
        int outerIteration = matrixLength / 2;

        for(int i = 0; i < outerIteration; i++) {
            for(int j = i; j < innerIteration - 1; j++) {
                int temp = matrix[j][matrixLength - i - 1];
                matrix[j][matrixLength - i - 1] = matrix[i][j];

                int temp2 = matrix[matrixLength - i - 1][matrixLength - j - 1];
                matrix[matrixLength - i - 1][matrixLength - j - 1] = temp;

                temp = matrix[matrixLength - j - 1][i];
                matrix[matrixLength - j - 1][i] = temp2;
                matrix[i][j] = temp;
            }

            innerIteration--;
        }

    }
}
