package org.beiganshan;

public class Search2DMatrix_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }
        int row = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            if (target < matrix[i][0]) {
                row = i - 1;
                // break for loop
                break;
            }
        }

        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i] == target) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int[][] mm = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Search2DMatrix_74 search2DMatrix_74 = new Search2DMatrix_74();
        search2DMatrix_74.searchMatrix(mm, 3);
    }

}
