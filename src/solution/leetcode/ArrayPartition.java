package solution.leetcode;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        ArrayPartition solution = new ArrayPartition();
        System.out.println(solution.arrayPairSum(new int[]{1,4,3,2})); // 4
        System.out.println(solution.arrayPairSum(new int[]{6,2,6,5,1,2})); // 9
    }
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = nums.length-2; i>=0; i = i-2){
            sum += nums[i];
        }
        return sum;
    }
}
