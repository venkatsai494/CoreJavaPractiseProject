package solution.leetcode;

import java.util.Arrays;

public class FindMissingAndRepeatedValues {
    public static void main(String[] args) {
        FindMissingAndRepeatedValues f = new FindMissingAndRepeatedValues();
        System.out.println(Arrays.toString(f.findMissingAndRepeatedValues(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        System.out.println(Arrays.toString(f.findMissingAndRepeatedValues(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 8}})));
        System.out.println(Arrays.toString(f.findMissingAndRepeatedValues(new int[][]{{1, 2}, {2, 3}})));
        System.out.println(Arrays.toString(f.findMissingAndRepeatedValues(new int[][]{{9,1,7}, {8,9,2}, {3,4,6}})));
    }
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int [] result = new int[2];
        int temp[] = new int[grid.length * grid.length];
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                temp[grid[i][j]-1]++;
            }
        }
        for(int i = 0; i<temp.length; i++){
            if(temp[i] == 0) result[1] = i+1; // missing value
            else if(temp[i] > 1) result[0] = i+1; // repeated value
        }

        return result;
    }
}
