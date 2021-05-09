package org.beiganshan;
/*
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.



来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/transpose-matrix
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
