package solution.leetcode;

import java.util.Arrays;

public class DifferenceBetweenOnesAndZerosInRowAndColumn {
    public static void main(String[] args) {
        DifferenceBetweenOnesAndZerosInRowAndColumn dbzo = new DifferenceBetweenOnesAndZerosInRowAndColumn();
        System.out.println(Arrays.deepToString(dbzo.onesMinusZeros1(new int[][]{{0,1,1},{1,0,1},{0,0,1}})));
        System.out.println(Arrays.deepToString(dbzo.onesMinusZeros1(new int[][]{{1,1,1},{1,1,1}})));
        System.out.println(Arrays.deepToString(dbzo.onesMinusZeros(new int[][]{{0,1,1},{1,0,1},{0,0,1}})));
        System.out.println(Arrays.deepToString(dbzo.onesMinusZeros(new int[][]{{1,1,1},{1,1,1}})));
    }
    public int[][] onesMinusZeros(int[][] grid) {
        int [] oneInColumns = new int[grid[0].length];
        int [] oneInRows = new int[grid.length];
        int [] zeroInColumns = new int[grid[0].length];
        int [] zeroInRows = new int[grid.length];

        for(int j = 0; j<grid[0].length; j++){
            int oneCount = 0;
            int zeroCount = 0;
            for(int i = 0; i<grid.length; i++){
                if(grid[i][j]==0) zeroCount++;
                else if(grid[i][j]==1) oneCount++;
            }
            oneInColumns[j] = oneCount;
            zeroInColumns[j] = zeroCount;
        }
        for(int i = 0; i<grid.length; i++){
            int oneCount = 0;
            int zeroCount = 0;
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j]==0) zeroCount++;
                else if(grid[i][j]==1) oneCount++;
            }
            oneInRows[i] = oneCount;
            zeroInRows[i] = zeroCount;
        }

        int [][] result = new int[grid.length][grid[0].length];
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                result[i][j] = oneInRows[i] + oneInColumns[j] - zeroInRows[i] - zeroInColumns[j];
            }
        }
        return result;
    }



    public int[][] onesMinusZeros1(int[][] grid) {
        int [][] result = new int[grid.length][grid[0].length];
        for(int i = 0; i<grid.length; i++){
            int row = calculateTheOccurences(grid, 'r', i, 1) - calculateTheOccurences(grid, 'r', i, 0);
            for(int j = 0; j<grid[0].length; j++){
                result[i][j] = row + calculateTheOccurences(grid, 'c', j, 1) - calculateTheOccurences(grid, 'c', j, 0);
            }
        }
        return result;
    }
    public int calculateTheOccurences(int[][] arr, char rc, int rowcol, int num){
        int count = 0;
        if(rc == 'r'){
            for(int i = 0; i<arr[0].length; i++){
                if(arr[rowcol][i] == num) count++;
            }
        }
        if(rc == 'c'){
            for(int i = 0; i<arr.length; i++){
                if(arr[i][rowcol] == num) count++;
            }
        }
        return count;
    }
}
