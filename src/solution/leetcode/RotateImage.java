package solution.leetcode;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        RotateImage solution = new RotateImage();
        solution.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
    public void rotate(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        int[][] temp = new int[matrix[0].length][matrix.length];
        for(int i = 0; i< temp.length; i++){
            for(int j = 0; j<temp[0].length; j++){
                temp[i][j] = matrix[j][i];
            }
        }
        for(int i = 0; i< result.length; i++){
            for(int j1 = 0, j2= result[0].length-1; j1<result[0].length && j2>=0; j1++, j2--){
                result[i][j1] = temp[i][j2];
            }
        }
        for(int i = 0; i<result.length; i++){
            System.arraycopy(result[i], 0, matrix[i], 0, result[0].length);
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
