class Solution {
    public static void setZeroRows(int [][]mat,int i){
        for(int j = 0; j < mat[i].length; j++){
            mat[i][j] = 0;
        }
    }
    public static void setZeroCol(int[][]mat, int j){
        for(int i = 0; i < mat.length; i++){
            mat[i][j] = 0;
        }
    }

    public static void setZeroes(int[][] matrix) {
        boolean []col = new boolean[matrix[0].length];
        boolean []row = new boolean[matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    col[j] = true;
                    row[i] = true;
                }
            }
        }
        for(int i = 0; i < row.length; i++){
            if(row[i]) setZeroRows(matrix,i);
        }
        for(int j = 0; j < col.length; j++){
            if(col[j]) setZeroCol(matrix,j);
        }
    }
}