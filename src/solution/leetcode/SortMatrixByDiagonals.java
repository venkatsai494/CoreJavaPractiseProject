package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMatrixByDiagonals {
    public static void main(String[] args) {
        SortMatrixByDiagonals sortMatrixByDiagonals = new SortMatrixByDiagonals();
        System.out.println(Arrays.deepToString(sortMatrixByDiagonals.sortMatrix(new int[][]{{1,7,3},{9,8,2},{4,5,6}})));
        System.out.println(Arrays.deepToString(sortMatrixByDiagonals.sortMatrix(new int[][]{{0,1},{1,2}})));
    }
    public int[][] sortMatrix(int[][] grid) {
        int[][] result = new int[grid.length][grid[0].length];
        int currentRow = 0;
        int currentCol = 1;
        while(currentCol<grid[0].length){
            int m = 0;
            int n = currentCol;
            List<Integer> tempList = new ArrayList<>();
            while(n<grid[0].length && m<grid.length){
                tempList.add(grid[m][n]);
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
        while(currentRow<grid.length){
            int m = currentRow;
            int n = 0;
            List<Integer> tempList = new ArrayList<>();
            while(m<grid.length && n<grid[0].length){
                tempList.add(grid[m][n]);
                m++;
                n++;
            }
            tempList.sort(Collections.reverseOrder());
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
