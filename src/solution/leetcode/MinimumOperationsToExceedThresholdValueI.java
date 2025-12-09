package solution.leetcode;

import java.util.Arrays;

public class MinimumOperationsToExceedThresholdValueI {
    public static void main(String[] args) {
        MinimumOperationsToExceedThresholdValueI solution = new MinimumOperationsToExceedThresholdValueI();
        System.out.println(solution.minOperations(new int[]{2,11,10,1,3}, 10)); // Output: 3
        System.out.println(solution.minOperations(new int[]{1,1,2,4,9}, 1)); // Output: 0
        System.out.println(solution.minOperations(new int[]{1,1,2,4,9}, 9)); // Output: 4
    }
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>=k) return i;
        }
        return 0;
    }
}
