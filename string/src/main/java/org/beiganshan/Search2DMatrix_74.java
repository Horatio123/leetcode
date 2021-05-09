package org.beiganshan;
/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/search-a-2d-matrix
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
