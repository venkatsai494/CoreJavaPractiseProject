package solution.leetcode;

import java.util.Arrays;

public class DeleteGreatestValueInEachRow {
    public static void main(String[] args) {
        DeleteGreatestValueInEachRow obj = new DeleteGreatestValueInEachRow();
        System.out.println(obj.deleteGreatestValue(new int[][]{{1,2,4},{3,3,1}})); // 8
        System.out.println(obj.deleteGreatestValue(new int[][]{{10}})); // 10
    }
    public int deleteGreatestValue(int[][] grid) {
        int result = 0;
        for(int[] arr: grid){
            Arrays.sort(arr);
        }
        int col = grid[0].length-1;
        while(col>=0){
            int max = 0;
            for(int[] i: grid){
                max= Math.max(max, i[col]);
            }
            result = result + max;
            col--;
        }
        return result;
    }
}
