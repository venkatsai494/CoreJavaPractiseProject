package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTheMatrixDiagonally {
    public static void main(String[] args) {
        SortTheMatrixDiagonally sortTheMatrixDiagonally = new SortTheMatrixDiagonally();
        System.out.println(Arrays.deepToString(sortTheMatrixDiagonally.diagonalSort(new int[][]{{3,3,1,1},{2,2,1,2},{1,1,1,2}})));
        System.out.println(Arrays.deepToString(sortTheMatrixDiagonally.diagonalSort(new int[][]{{11,25,66,1,69,7},{23,55,17,45,15,52},{75,31,36,44,58,8},{22,27,33,25,68,4},{84,28,14,11,5,50}})));
    }
    public int[][] diagonalSort(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
        int currentRow = 0;
        int currentCol = 0;
        while(currentCol<mat[0].length){
            int m = 0;
            int n = currentCol;
            List<Integer> tempList = new ArrayList<>();
            while(n<mat[0].length && m<mat.length){
                tempList.add(mat[m][n]);
                m++;
                n++;
            }
            Collections.sort(tempList);
            m = 0;
            n = currentCol;
            for(int i: tempList){
                result[m][n] = i;
                m++;
                n++;
            }
            currentCol++;
        }
        while(currentRow<mat.length){
            int m = currentRow;
            int n = 0;
            List<Integer> tempList = new ArrayList<>();
            while(m<mat.length && n<mat[0].length){
                tempList.add(mat[m][n]);
                m++;
                n++;
            }
            Collections.sort(tempList);
            m = currentRow;
            n = 0;
            for(int i: tempList){
                result[m][n] = i;
                m++;
                n++;
            }
            currentRow++;
        }
        return result;
    }
}
