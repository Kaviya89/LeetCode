class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][] isZero = new boolean[row][col];
       for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j]==0){
                    isZero[i][j] = true;
                }}}
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(isZero[i][j]){
                   for (int c = 0; c < col; c++) {
                        matrix[i][c] = 0;
                    }
                    for (int r = 0; r < row; r++) {
                        matrix[r][j] = 0;
                    }
                }
            }
        }
    }
}