package org.beiganshan;

public class TransposeMatrix_867 {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int column = A[0].length;

        int[][] res = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                res[j][i] = A[i][j];
            }
        }

        return res;
    }

}
