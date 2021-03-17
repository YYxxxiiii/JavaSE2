package leetcode;

public class Four0306 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //从右上角开始
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1;
        //此时 row col就在15位置上
        while (row < m && col >= 0) {
            if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }
}
