package solution.leetcode;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        TransposeMatrix tm = new TransposeMatrix();
        System.out.println(Arrays.deepToString(tm.transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}})));
        System.out.println(Arrays.deepToString(tm.transpose(new int[][]{{1,2,3},{4,5,6}})));
    }
    public int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
