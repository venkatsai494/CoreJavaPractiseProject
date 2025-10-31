package solution.leetcode;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    public static void main(String[] args) {
        DivideArrayIntoArraysWithMaxDifference obj = new DivideArrayIntoArraysWithMaxDifference();
        System.out.println(Arrays.deepToString(obj.divideArray(new int[]{1,3,4,8,7,9,3,5,1}, 2))); // [[1,2,3],[4,5,6]]
        System.out.println(Arrays.deepToString(obj.divideArray(new int[]{2,4,2,2,5,2}, 2))); // []
        System.out.println(Arrays.deepToString(obj.divideArray(new int[]{4,2,9,8,2,12,7,12,10,5,8,5,5,7,9,2,5,11}, 2))); // []
    }
    public int[][] divideArray(int[] nums, int k) {
        int [][] result = new int[nums.length/3][3];
        Arrays.sort(nums);
        int maxDifference = 1;
        int row = 0;
        int column = 0;
        for(int i : nums){
            result[row][column] = i;
            column++;
            if((column)%3==0){
                column = 0;
                row++;
            }
        }
        for(int [] arr: result){
            maxDifference = Math.max(maxDifference, arr[2]-arr[0]);
        }
        if(maxDifference<=k) return result;
        else return new int[0][0];
    }
}
