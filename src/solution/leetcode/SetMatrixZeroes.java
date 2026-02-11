package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        SetMatrixZeroes solution = new SetMatrixZeroes();
        solution.setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
        solution.setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    list.add(temp);
                }
            }
        }
        for(List l: list){
            int r = (int)l.get(0);
            int c = (int)l.get(1);
            for(int i = 0; i<matrix[0].length; i++){
                matrix[r][i] = 0;
            }
            for(int i = 0; i<matrix.length; i++){
                matrix[i][c] = 0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
