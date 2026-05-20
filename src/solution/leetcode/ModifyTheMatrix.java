package solution.leetcode;

import java.util.Arrays;

public class ModifyTheMatrix {
    public static void main(String[] args) {
        ModifyTheMatrix modifyTheMatrix = new ModifyTheMatrix();
        System.out.println(Arrays.deepToString(modifyTheMatrix.modifiedMatrix(new int[][]{{1,2,-1},{4,-1,6},{7,8,9}})));
        System.out.println(Arrays.deepToString(modifyTheMatrix.modifiedMatrix(new int[][]{{3,-1},{5,2}})));
        System.out.println(Arrays.deepToString(modifyTheMatrix.modifiedMatrix(new int[][]{{1,-1,3},{-1,2,-1},{3,-1,1}})));
        System.out.println(Arrays.deepToString(modifyTheMatrix.modifiedMatrix(new int[][]{{2,-1,2,-1,2},{1,0,-1,2,-1},{2,-1,-1,-1,2},{2,1,2,-1,2},{0,1,0,0,0},{0,0,0,0,-1},{2,-1,2,2,0},{0,1,0,2,2},{2,2,0,1,-1}})));// Expected: [[2,2,2,2,2],[1,0,2,2,2],[2,2,2,2,2],[2,1,2,2,2],[0,1,0,0,0],[0,0,0,0,2],[2,2,2,2,0],[0,1,0,2,2],[2,2,0,1,2]] Actual: [[2,1,2,2,2],[1,0,2,2,2],[2,1,2,2,2],[2,1,2,2,2],[0,1,0,0,0],[0,0,0,0,2],[2,1,2,2,0],[0,1,0,2,2],[2,2,0,1,2]]
    }
    public int[][] modifiedMatrix(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
        int [] maxInCol = new int[col];
        for(int j = 0; j < col; j++){
            int max = 0;
            for (int[] ints : matrix) {
                max = Math.max(max, ints[j]);
            }
            maxInCol[j] = max;
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j]==-1) matrix[i][j] = maxInCol[j];
            }
        }
        return matrix;
    }
}
