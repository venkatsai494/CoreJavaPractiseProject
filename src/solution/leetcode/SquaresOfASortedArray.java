package solution.leetcode;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        SquaresOfASortedArray solution = new SquaresOfASortedArray();
        System.out.println(Arrays.toString(solution.sortedSquares(new int[]{-4,-1,0,3,10}))); // [0,1,9,16,100]
        System.out.println(Arrays.toString(solution.sortedSquares(new int[]{-7,-3,2,3,11}))); // [4,9,9,49,121]
    }
    public int[] sortedSquares(int[] nums) {
        int [] result = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }
}
